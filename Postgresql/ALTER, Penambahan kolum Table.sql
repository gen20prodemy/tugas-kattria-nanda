ALTER TABLE Produk 
ADD COLUMN Produk_harga DECIMAL (10,2) not null,
ADD COLUMN Kategori_id int REFERENCES Kategori(Kat_name);