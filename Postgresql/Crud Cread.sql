CREATE TABLE Produk (
	Produk_id SERIAL Primary key,
	Produk_nama varchar (50) not null,
	Produk_harga DECIMAL (10,2) not null,
	Kategori_id int REFERENCES Kategori(Kat_iD)
);

CREATE TABLE Kategori (
	Kat_id SERIAL PRIMARY KEY,
	Kat_name VARCHAR (100) NOT NULL
);

CREATE TABLE Transaktions (
	Trans_id SERIAL Primary Key,
	Trans_Tanggal TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	Trans_total DECIMAL (10,2) NOT NULL
);

CREATE VIEW view_produk AS
SELECT produk.produk_nama AS nama, produk.produk_harga AS harga, kategori.kat_name AS kategori 
FROM produk JOIN kategori ON produk.kategori_id = kategori.kat_id;