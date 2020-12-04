create table project_employee(
id int not null primary key auto_increment,
project_project_id int not null,
employee_person_no int not null,
added date,
salary DECIMAL (19,4),
unique(project_project_id, employee_person_no),
foreign key (project_project_id) references project (project_id),
foreign key (employee_person_no) references employee (person_no)
)

