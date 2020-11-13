CREATE TABLE CUSTOMER ( 
    CUSTOMERID INT NOT NULL PRIMARY KEY,
    COMPANY VARCHAR(100) NOT NULL,
    FORENAME VARCHAR(100), 
    SURNAME VARCHAR(100), 
    ADDRESS VARCHAR(100) NOT NULL);

CREATE TABLE STORAGES ( 
    STORAGELOCATION INT NOT NULL PRIMARY KEY,
    CAPACITY INT NOT NULL);


CREATE TABLE DELIVERY ( 
    MAXWEIGHT INT NOT NULL,
    MAXSIZE INT NOT NULL, 
    DELIVERY_DATE DATE NOT NULL, 
    DELIVERY_ADDRESS VARCHAR(100) NOT NULL,
    DELIVERYID INT NOT NULL PRIMARY KEY,
  	ORDERID INT NOT NULL,
    CUSTOMERID INT NOT NULL,
    FOREIGN KEY (CUSTOMERID) REFERENCES CUSTOMER (CUSTOMERID));

CREATE TABLE PRODUCT ( 
  	PRODUCTID INT NOT NULL PRIMARY KEY, 
    PRODUCTNAME VARCHAR(100) NOT NULL,
    PRICE INT NOT NULL, 
    QUANTITY INT NOT NULL, 
    SIZE INT NOT NULL,
    WEIGHT INT NOT NULL,
  	ORDERID INT NOT NULL,
  	STORAGELOCATION INT NOT NULL,
    FOREIGN KEY (STORAGELOCATION) REFERENCES STORAGES (STORAGELOCATION));

CREATE TABLE ORDERS ( 
    ORDERDATE DATE NOT NULL,
    ORDERID INT NOT NULL PRIMARY KEY,
  	PRODUCTID INT NOT NULL,
  	DELIVERYID INT NOT NULL,
  	CUSTOMERID INT NOT NULL,
    FOREIGN KEY (DELIVERYID) REFERENCES DELIVERY (DELIVERYID),
    FOREIGN KEY (CUSTOMERID) REFERENCES CUSTOMER (CUSTOMERID),
    FOREIGN KEY (PRODUCTID) REFERENCES PRODUCT (PRODUCTID));

CREATE TABLE ORDERPRODUCT(
    ORDERPRODUCT BIGINT NOT NULL,
    PRODUCTCOUNT INT,
    PRODUCTID INT NOT NULL,
    ORDERID INT NOT NULL,
    FOREIGN KEY (PRODUCTID) REFERENCES PRODUCT (PRODUCTID),
    FOREIGN KEY (ORDERID) REFERENCES ORDERS (ORDERID));



-- sijoitetaan customer tauluun-->
-- INSTERT INTO CUSTOMER (CUSTOMERID, COMPANY, FORENAME) VALUES (12345, 6789, "VILLEPETTERI"); 
-- avataan customer näkyviin
-- SELECT * FROM CUSTOMER;
-- poistetaan customer taulu
-- DROP TABLE CUSTOMER;
--1. Create tables that doesnt have foreign keys(viiteavaimia muihin tauluihin)
-- assosiatiivinen taulu(2 viiteavainta, täyty luoda taulut, joista viiteavaimet)
-- mitä jos kaikissa tauluissa viiteavaimia?
-- AUTO_INCREMENT -> kasvava numerosarja
-- yhdistetty viiteavain primary key (muuttuja1, muuttuja2)



-- It is possible to write the INSERT INTO statement in two ways.
-- The first way specifies both the column names and the values to be inserted:


-- If you are adding values for all the columns of 
-- the table, you do not need to specify the column 
-- names in the SQL query. However, make sure the 
-- order of the values is in the same order as the 
-- columns in the table. The INSERT INTO syntax 
-- would be as follows:

-- INSERT INTO table_name
-- VALUES (value1, value2, value3, ...);