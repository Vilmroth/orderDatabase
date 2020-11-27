-- Korkein ja pienin hinta, hintojen varianssi
select max(price) as suurin, min(price) as pienin, variance(price) as varianssi from PRODUCT;
--Antaa kaikkien tuotteiden kokonaishinnan ja keskihinnan kaikista tuotteista
SELECT SUM(PRICE) AS TOTAL, AVG(PRICE) AS AVERAGE FROM PRODUCT;
-- kertoo storagen kokonaiscapacityn
SELECT Sum(capacity) FROM STORAGES;


-- Tuotteen nimi ja montako kertaa ostettu
SELECT PRODUCT.PRODUCTNAME, COUNT(PRODUCT.PRODUCTNAME) 
FROM PRODUCT, ORDERPRODUCT 
WHERE PRODUCT.PRODUCTID = ORDERPRODUCT.PRODUCTID 
GROUP BY PRODUCT.PRODUCTNAME;

-- Näyttää kuinka monta tilausta kukin asiakas on yhteensä tehnyt.
SELECT CUSTOMER.FORENAME, COUNT(CUSTOMER.FORENAME) as amount
FROM ORDERS, CUSTOMER 
WHERE ORDERS.CUSTOMERID = CUSTOMER.CUSTOMERID
GROUP BY CUSTOMER.FORENAME;

-- Kertoo kuinka paljon yksi tilaus maksaa.
SELECT SUM(PRODUCT.PRICE), ORDERPRODUCT.ORDERID FROM ORDERPRODUCT, PRODUCT WHERE ORDERPRODUCT.PRODUCTID = PRODUCT.PRODUCTID GROUP BY ORDERPRODUCT.ORDERID;