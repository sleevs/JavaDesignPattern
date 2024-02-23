


create table account (
	account_id serial primary key,
	account_name varchar(50) not null ,
	accout_email varchar(50) ,
	account_phone varchar (20),
	account_document varchar (50)
  
	
);



CREATE TABLE project (
  project_id SERIAL PRIMARY KEY, 
  project_type VARCHAR (20)  , 
  project_description VARCHAR (50)  , 
  project_date TIMESTAMP ,
  project_responsability int ,
  project_scope varchar(50) 

);


CREATE TABLE employee (
  employee_id SERIAL PRIMARY KEY, 
  employee_name  VARCHAR (20) , 
  employee_type VARCHAR (20) , 
  employee_phone VARCHAR (20)  , 
  employee_email VARCHAR (20)  , 
  employee_experience VARCHAR (50)  , 
  employee_skill VARCHAR (50)  , 
  employee_certification VARCHAR (50)  , 
  employee_create TIMESTAMP 
);



CREATE TABLE task (
  task_id SERIAL PRIMARY KEY, 
  task_functional VARCHAR (50)  , 
  task_description VARCHAR (50)  , 
  task_requirements VARCHAR (50)  ,
  project_id int , 
 
);


CREATE TABLE resource (
  resource_id SERIAL PRIMARY KEY, 
  resource_description VARCHAR (50)  , 
  resource_value VARCHAR (20)  , 
  resource_type VARCHAR (20)   
 
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
  description_action_value VARCHAR (20)  NOT NULL, 
  description_action_type VARCHAR (20)  NOT NULL
 
);


CREATE TABLE action (
  action_id SERIAL PRIMARY KEY, 
  action_resource VARCHAR (50)  , 
  action_start VARCHAR (50)  , 
  action_end VARCHAR (50) , 
  action_status VARCHAR (10) , 
  employee_id INT ,
  task_id INT  
 
);
