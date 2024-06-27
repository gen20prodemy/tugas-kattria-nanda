package com.example.Mini.Project.Prodemi.Controller;


import com.example.Mini.Project.Prodemi.Dto.ProductDto;
import com.example.Mini.Project.Prodemi.Validation.ResponseData;
import com.example.Mini.Project.Prodemi.Entity.Product;
import com.example.Mini.Project.Prodemi.Service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pos/api")
public class ProductController {
    private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    // @CrossOrigin
    @PostMapping("/addproduct")
    public ResponseEntity<ResponseData<ProductDto>> addProduct (@Valid @RequestBody ProductDto productDto, Errors errors){
        ResponseData<ProductDto> responseData = new ResponseData<>();
        if(errors.hasErrors()){
            for(ObjectError error : errors.getAllErrors()){
                responseData.getMessages().add(error.getDefaultMessage());
            }
            responseData.setStatus("failed");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        productService.addProduct(productDto);
        responseData.setStatus("ok");
        responseData.setMessages(Collections.singletonList("success"));
        return ResponseEntity.ok(responseData);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<ProductDto>> getAll (){
        List<ProductDto> product = productService.getAllProduct();
        return ResponseEntity.ok(product);
    }

    @PutMapping("/updateproduct/{id}")
    public ResponseEntity<ResponseData<ProductDto>> updateProduct (
            @PathVariable (required = false) String id,
            @RequestBody ProductDto productDto, Errors errors){

        int productId;
        try{
            productId = Integer.parseInt(id);
        }catch (NumberFormatException e){
            ResponseData<ProductDto> responseData = new ResponseData<>();
            responseData.setStatus("failed");
            responseData.setMessages(Collections.singletonList("Id harus berupa angka"));
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        if (productId <= 0 ){
            ResponseData<ProductDto> responseData = new ResponseData<>();
            responseData.setStatus("failed");
            responseData.setMessages(Collections.singletonList("Id harus berupa bilangan positif"));
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }

        ResponseData<ProductDto> responseData = new ResponseData<>();
            if(errors.hasErrors()){
                for (ObjectError error : errors.getAllErrors()){
                    responseData.getMessages().add(error.getDefaultMessage());
                }
                responseData.setStatus("failed");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
            }
            productService.updateProduct(productId, productDto);
            responseData.setStatus("ok");
            responseData.setMessages(Collections.singletonList("success"));
            return ResponseEntity.ok(responseData);

    }

    @DeleteMapping("/deleteproduct/{id}")
    public ResponseEntity<ResponseData<String>> deleteProduct (@PathVariable (required = false) String id){
        int productId;
        try{
            productId = Integer.parseInt(id);
        }catch (NumberFormatException e){
            ResponseData<String> responseData = new ResponseData<>();
            responseData.setStatus("failed");
            responseData.setMessages(Collections.singletonList("Id harus berupa angka"));
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        if (productId <= 0 ){
            ResponseData<String> responseData = new ResponseData<>();
            responseData.setStatus("failed");
            responseData.setMessages(Collections.singletonList("Id harus berupa bilangan positif"));
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
//        else if (id == null || id.isEmpty()) {
//            ResponseData<String> responseData = new ResponseData<>();
//            responseData.setStatus("failed");
//            responseData.setMessages(Collections.singletonList("Masukkan Id yang akan di hapus"));
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
//
//        }

        productService.deleteProduct(productId);
        ResponseData<String> responseData = new ResponseData<>();
        responseData.setStatus("ok");
        responseData.setMessages(Collections.singletonList("success"));
        return ResponseEntity.ok(responseData);

    }

    @GetMapping("/detailproduct/{id}")
    public ResponseEntity<?> detailProduct (@PathVariable String id){
        int productId;
        try{
            productId = Integer.parseInt(id);
        }catch (NumberFormatException e){
            ResponseData<Optional<Product>> responseData = new ResponseData<>();
            responseData.setStatus("failed");
            responseData.setMessages(Collections.singletonList("Id harus berupa angka"));
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        if (productId <= 0 ){
            ResponseData<String> responseData = new ResponseData<>();
            responseData.setStatus("failed");
            responseData.setMessages(Collections.singletonList("Id harus berupa bilangan positif"));
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        List<Product> product = productService.detailProduct(productId);
        return ResponseEntity.ok(product);
    }
    @GetMapping("/detailproduct")
    public ResponseEntity<?> detailProduct (){
        List<Product> product = productService.detailProduct();
        return ResponseEntity.ok(product);
    }


    @GetMapping("/listproduct")
    public List<Product> listProducts( @RequestParam(required = false) String title,
                                       @RequestParam(required = false) Integer category,
                                       @RequestParam(required = false, defaultValue = "id") String sort_by,
                                       @RequestParam(required = false, defaultValue = "asc")String sort_order){

        if (title!=null){
            return productService.findProductByTitle(title,sort_by, sort_order);
        } else if (category!=null) {
            return productService.findProductByCategory(category, sort_by, sort_order);
        } else {
            Sort.Direction sortOrder = sort_order.equalsIgnoreCase("asc") ? Sort.Direction.ASC:Sort.Direction.DESC;
            Sort sort = Sort.by(sortOrder, sort_by);
            return productService.listProducts(sort);
        }
    }
}
