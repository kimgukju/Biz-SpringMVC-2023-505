CREATE DATABASE imageDB;
USE imageDB;

CREATE TABLE tbl_bbs (
	b_seq BIGINT PRIMARY KEY AUTO_INCREMENT,
	b_title varchar(125),
	b_content varchar(1000),
	b_nickname varchar(125),
	b_password varchar(125),
	b_ccode varchar(6),
	b_date varchar(10),
	b_viewcount long,
    b_image VARCHAR(255),
    b_origin_image VARCHAR(255)
);
DROP TABLE tbl_bbs;
DROP TABLE tbl_files;
SELECT * FROM tbl_bbs;
SELECT * FROM tbl_file;
SHOW TABLES;
