CREATE TABLE Teachers(
	id bigserial, --karna pake bigserial jadi secara otomatis mengisi kolom ini dengan bilangan bulat yang bertambah secara otomatis
	first_name varchar (25),
	last_name varchar (25),
	school varchar (50),
	hire_date date,
	salary numeric
);

INSERT INTO teachers (first_name, last_name, school, hire_date, salary)
VALUES 
		('Kattria', 'Nanda Petma', 'SMA 1 LUBUK SIKAPING', '2023-11-14', 120000),
		('Syafira', 'Aulina', 'SMA 1 BUKITTINGGI', '2022-12-06', 125000),
		('Mutia', 'Ulfah', 'SMA 1 TAPAN', '2023-07-31', 65000),
		('Aulia', 'Izzati', 'SMA 1 LUBUK SIKAPING', '2022-10-12', 150000),
		('James', 'Smith', 'F.D. Roosevelt HS', '1993-05-22', 43500);
		
		
SELECT * FROM teachers;

SELECT DISTINCT school, salary FROM teachers; --tidak menampikan school dengan isi yang sama

SELECT last_name, school, hire_date, salary FROM teachers ORDER BY salary ASC, hire_date DESC;

SELECT first_name, last_name, school From teachers WHERE first_name = 'Kattria';

SELECT first_name, last_name, school From teachers WHERE first_name != 'Kattria';

SELECT first_name, last_name, hire_date From teachers WHERE hire_date < '2020-01-01';

SELECT first_name, last_name, hire_date From teachers WHERE hire_date > '2023-05-01';

SELECT first_name, last_name, salary FROM teachers WHERE salary BETWEEN 120000 AND 150000 ;

SELECT first_name FROM teachers WHERE first_name LIKE 'kat%'; --yang ini berpengaruh

SELECT first_name FROM teachers WHERE first_name ILIKE 'kat%'; --yang ini tidak berpengaruh huruf besar/kecilnya

SELECT first_name FROM teachers WHERE first_name LIKE '_ulia'; --mencari satu karakter kosong

SELECT * FROM teachers WHERE school = 'SMA 1 LUBUK SIKAPING' AND salary > 100000;

SELECT first_name, last_name, school, salary FROM teachers WHERE school LIKE 'SMA%' ORDER BY salary ASC;