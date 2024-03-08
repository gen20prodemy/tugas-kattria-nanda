package Tugas.InputTxt;

import Tugas.Pojo.PojoData;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriterFile {
    public void MaptoTxt (Map<String, PojoData> mapData, String namaFile){
        try(BufferedWriter writer = new BufferedWriter ((new FileWriter(namaFile)))){

            for (PojoData data: mapData.values ()){
                writer.write(data.toString());
                writer.newLine();
            }

        }catch(IOException e){
            System.err.println("Gagal Menyimpan data");
            e.printStackTrace();
        }
    }
}