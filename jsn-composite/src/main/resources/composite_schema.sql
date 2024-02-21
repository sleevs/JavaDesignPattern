


create table account (
	account_id serial primary key,
	account_name varchar(50) not null ,
	accout_email varchar(50) ,
	account_phone varchar (20),
	account_document varchar (50)
  
	
);



CREATE TABLE project (
  project_id SERIAL PRIMARY KEY, 
  project_type VARCHAR (50)  NOT NULL, 
  project_description VARCHAR (50)  NOT NULL, 
  project_date TIMESTAMP NOT NULL ,
  project_responsability int ,
  project_scope varchar(500) 

);


CREATE TABLE employee (
  employee_id SERIAL PRIMARY KEY, 
  employee_name  VARCHAR (20) NOT NULL, 
  employee_type VARCHAR (20)  NOT NULL, 
  employee_phone VARCHAR (20)  NOT NULL, 
  employee_email VARCHAR (20)  NOT NULL, 
  employee_experience VARCHAR (500)  NOT NULL, 
  employee_skill VARCHAR (200)  NOT NULL, 
  employee_certification VARCHAR (200)  NOT NULL, 
  employee_create TIMESTAMP NOT NULL
);



CREATE TABLE task (
  task_id SERIAL PRIMARY KEY, 
  task_functional VARCHAR (50)  NOT NULL, 
  task_description VARCHAR (500)  , 
  task_requirements VARCHAR (200)  ,
  project_id int , 
 
);


CREATE TABLE resource (
  resource_id SERIAL PRIMARY KEY, 
  resource_description VARCHAR (100)  NOT NULL, 
  resource_value VARCHAR (20)  NOT NULL, 
  resource_type VARCHAR (20)  NOT NULL 
 
);

CREATE TABLE analyzer (
  analyze_id SERIAL PRIMARY KEY, 
  analyze_value VARCHAR (20) NOT NULL, 
  analyze_cost VARCHAR (20) NOT NULL, 
  analyze_date VARCHAR (10) NOT NULL, 
  analyze_complexity VARCHAR (10)  NOT NULL, 
  analyze_priority VARCHAR (10)  NOT NULL,
  analyst_id INT NOT NULL,  
  task_id INT NOT NULL,  
  employee_id INT ,
  analyze_status INT NOT NULL,  
  resource_id INT   
 
);


CREATE TABLE description_action (
  description_action_id SERIAL PRIMARY KEY, 
  description_action_value VARCHAR (200)  NOT NULL, 
  description_action_type VARCHAR (20)  NOT NULL
 
);


CREATE TABLE action (
  action_id SERIAL PRIMARY KEY, 
  action_resource VARCHAR (50)  , 
  action_start VARCHAR (500)  , 
  action_end VARCHAR (200) , 
  action_status VARCHAR (200)  NOT NULL, 
  description_action_id INT  NOT NULL ,
  task_id INT NOT NULL 
 
);
