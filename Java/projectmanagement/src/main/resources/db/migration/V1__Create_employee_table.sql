    CREATE TABLE EMPLOYEE (
    person_no int not null primary key auto_increment,
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    birth_date date not null,
    title varchar(255),
    phone_number varchar(255)
    )