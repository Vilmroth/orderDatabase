    CREATE TABLE PROJECT(
    project_id int not null primary key auto_increment,
    begins date not null,
    ends date,
    name varchar(255),
    customer varchar(255),
    state varchar(255),
    project_manager_person_no int,
    foreign key (project_manager_person_no) references employee (person_no)
    )