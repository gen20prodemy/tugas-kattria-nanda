SELECT * FROM Produk;--menampilkan semua yang ada di tabel produk'
SELECT * FROM Kategori;

SELECT * FROM user_data WHERE gender= 'Male';


SELECT * FROM Produk Where Kategori_id = 1; --menampilkan semua yang memiliki kategori id =1

SELECT produk_nama, produk_harga FROM Produk; --menampilkan berdasarkan kolom

SELECT produk_nama FROM Produk JOIN Kategori ON produk.kategori_id = kategori.kat_id; --menampilkan data dari gabungan 2 tabel

SELECT produk_nama FROM Produk INNER JOIN Kategori ON produk.kategori_id = kategori.kat_id;

SELECT produk.produk_nama, kategori.kat_name FROM Produk Left JOIN Kategori  ON produk.kategori_id = kategori.kat_id;

SELECT produk.produk_nama, kategori.kat_name FROM Produk RIGHT JOIN Kategori  ON produk.kategori_id = kategori.kat_id;

SELECT produk.produk_nama, kategori.kat_name FROM Produk CROSS JOIN Kategori; --mencocokkan setiap baris dari tabel produk dengan baris dari tabel kategori sehingga menghasilkan (table 1+tabel 2) kolom

SELECT  produk.produk_nama, kategori.kat_name FROM Produk FULL JOIN Kategori ON produk.kategori_id = kategori.kat_id;--menambilkan semua baris di kolom dari tabel 1 dan tabel 2

SELECT * FROM Produk ORDER BY produk_harga ASC; --menampilkan dengan urutan berdasarkan produk_harga ASC naik, DESC turun

SELECT * FROM Produk LIMIT 2; --MENAMPILKAN DENGAN DIBATASI 2 BARIS

SELECT DISTINCT produk_nama, produk_harga FROM produk; --menampilkan kolom tertentu


SELECT * FROM TRANSAKTIONS;

SELECT Transaktions.trans_tanggal, SUM (trans_total) AS total_penddapatan FROM transaktions GROUP BY trans_tanggal;


SELECT Transaktions.trans_tanggal, COUNT (*) AS jmlh_transaksi FROM transaktions GROUP BY trans_tanggal;

SELECT * FROM view_produk;

