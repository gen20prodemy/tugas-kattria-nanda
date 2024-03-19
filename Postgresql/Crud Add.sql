INSERT INTO Kategori (kat_id, kat_name)
VALUES 
		(1,'Elektronik'),
		(2, 'Aksesoris'),
		(3, 'Non Elektronik')
;

INSERT INTO Produk (produk_id, produk_nama, produk_harga, kategori_id)
VALUES 
		(4,'Speaker',25.50, 2),
		(5,'CPU', 250.00, 1),
		(6,'Keyboard', 75.25, 2),
		(7,'Tas Laptop', 30000, 3) 
;

INSERT INTO Transaktions (trans_tanggal, trans_total)
VALUES 
		('2022-01-23', 100.50),
		('2022-01-23', 75.25),
		('2022-01-23', 150),
		('2022-01-23', 90),
		('2022-01-23', 100),
		('2022-04-08', 25.30),
		('2022-04-08', 175.25)
;



