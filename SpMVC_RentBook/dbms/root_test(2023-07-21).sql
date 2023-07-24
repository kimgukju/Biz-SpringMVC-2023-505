CREATE DATABASE bookDB;
USE bookDB;

CREATE TABLE TBL_BOOKS (
B_CODE	VARCHAR(6)	NOT NULL	PRIMARY KEY,
B_NAME	VARCHAR(125)	NOT NULL,	
B_AUTHER	VARCHAR(125)	NOT NULL,	
B_COMP	VARCHAR(125),		
B_YEAR	INT	NOT NULL,	
B_IPRICE	INT,		
B_RPRICE	INT	NOT NULL	
);

CREATE TABLE TBL_USERS (
U_CODE	VARCHAR(6)	NOT NULL	PRIMARY KEY,
U_NAME	VARCHAR(125)	NOT NULL	,
U_TEL	VARCHAR(125),		
U_ADDR	VARCHAR(125)		
);



CREATE TABLE TBL_RENT_BOOK (
RENT_SEQ	INT	NOT NULL	PRIMARY KEY	AUTO_INCREMENT,
RENT_DATE	VARCHAR(30)	NOT NULL,		
RENT_RETURN_DATE	VARCHAR(10)	NOT NULL,		
RENT_BCODE	VARCHAR(6)	NOT NULL,		
RENT_UCODE	VARCHAR(6)	NOT NULL,		
RENT_RETURN_YN	VARCHAR(1),			
RENT_POINT	INT			
);

-- 참조무결성관계 1:도서정보/회원정보(TBL_BOOKS/TBL_USERS) N:대여정보(TBL_RENT_BOOK)
ALTER TABLE TBL_RENT_BOOK
ADD CONSTRAINT F_BCODE
FOREIGN KEY (RENT_BCODE)
REFERENCES TBL_BOOKS(B_CODE);

ALTER TABLE TBL_RENT_BOOK
ADD CONSTRAINT F_UCODE
FOREIGN KEY (RENT_UCODE)
REFERENCES TBL_USERS(U_CODE);

INSERT INTO TBL_BOOKS (
B_CODE, B_NAME, B_AUTHER, B_COMP, B_YEAR, B_IPRICE, B_RPRICE
) VALUES (
'A0001','내맘대로책','내맘','내맘출판사',1999,12000,2000
);

INSERT INTO TBL_BOOKS (
B_CODE, B_NAME, B_AUTHER, B_COMP, B_YEAR, B_IPRICE, B_RPRICE
) VALUES (
'A0002','어디로든책','어디로','어디로출판사',1972,4000,500
);

SELECT * FROM tbl_books;
SELECT * FROM TBL_BOOKS ORDER BY b_code;

SELECT * FROM tbl_books
WHERE b_code = 'A0002';

UPDATE tbl_books SET
	b_code = 'A0002',
	b_name = '어디로든책',
	b_auther = '어디로',
	b_comp = '몰루?',
	b_year = 1972,
	b_iprice = 4000,
	b_rprice = 1500
WHERE b_code = 'A0002';
