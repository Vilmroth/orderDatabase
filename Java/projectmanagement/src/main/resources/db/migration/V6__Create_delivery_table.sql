create table delivery ( 
    deliveryid int not null primary key auto_increment,
    maxweight int,
    customerid int not null,
    delivery_date date not null, 
    delivery_address varchar(100) not null);