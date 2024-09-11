
INSERT INTO public.account
(account_id, account_name, accout_email, account_phone, account_document)
VALUES(nextval('account_account_id_seq'::regclass), '', '', '', '');

INSERT INTO public.account
(account_id, account_name, accout_email, account_phone, account_document)
VALUES(nextval('account_account_id_seq'::regclass), 'James', 'james@gmail.com', '21987654123', '12345678996');

INSERT INTO public.project
(project_id, project_type, project_description, project_date, project_scope, account_id)
VALUES(nextval('project_project_id_seq'::regclass), 'Construção', 'Costruir uma casa de dois comodos',  'Construção', 1);


SELECT * FROM project
FULL JOIN analysis
ON project.project_id = analysis.project_id
FULL JOIN task 
ON  analysis.analyze_id = task.analyze_id ;



INSERT INTO public.employee
(employee_id, employee_name, employee_type, employee_phone, employee_email, employee_experience, employee_skill, employee_certification, employee_create)
VALUES(nextval('employee_employee_id_seq'::regclass), '', '', '', '', '', '', '', '');




INSERT INTO public.analysis
(analyze_id, analyze_value, analyze_cost, analyze_estimate, analyze_date, analyze_complexity, employee_id, project_id, analyze_status)
VALUES(nextval('analysis_analyze_id_seq'::regclass), '', '', 0, '', '', 0, 0, '');





INSERT INTO public.task
(task_id, task_functional, task_description, task_requirements, analyze_id, task_type, task_status)
VALUES(nextval('task_task_id_seq'::regclass), '', '', '', 0, '', '');





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
  project_description VARCHAR (50) , 
  project_date TIMESTAMP ,
  project_scope varchar(50),
  account_id int 

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


CREATE TABLE analysis (
  analyze_id SERIAL PRIMARY KEY, 
  analyze_value VARCHAR (20) NOT NULL, 
  analyze_cost VARCHAR (20) NOT NULL, 
  analyze_estimate INT ,
  analyze_date TIMESTAMP , 
  analyze_complexity VARCHAR (10)  NOT NULL, 
  employee_id INT ,
  project_id INT ,
  analyze_status VARCHAR (20)   
 
);


CREATE TABLE task (
  task_id SERIAL PRIMARY KEY, 
  task_functional VARCHAR (50)  , 
  task_description VARCHAR (50)  , 
  task_requirements VARCHAR (50)  ,
  analyze_id int ,
  task_type VARCHAR (20)  ,
  task_status VARCHAR (20) 
 
);



CREATE TABLE action (
  action_id SERIAL PRIMARY KEY, 
  action_resource VARCHAR (50),
  action_objective VARCHAR (50),
  action_start VARCHAR (20), 
  action_end VARCHAR (20), 
  action_status VARCHAR (10), 
  employee_id INT,
  task_id INT  
 
);




CREATE TABLE resource (
  resource_id SERIAL PRIMARY KEY, 
  resource_description VARCHAR (50)  , 
  resource_value VARCHAR (20)  , 
  resource_type VARCHAR (20)   
 
);



CREATE TABLE description_action (
  description_action_id SERIAL PRIMARY KEY, 
  description_action_value VARCHAR (20)  NOT NULL, 
  description_action_type VARCHAR (20)  NOT NULL
 
);



