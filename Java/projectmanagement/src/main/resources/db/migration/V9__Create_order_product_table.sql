create table order_product(
    order_product bigint not null primary key auto_increment,
    product_count int,
    product_id int,
    order_id int,
    foreign key (product_id) references product (product_id),
    foreign key (order_id) references orders (order_id));