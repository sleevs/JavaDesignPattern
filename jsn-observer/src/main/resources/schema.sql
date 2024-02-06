
CREATE TABLE IF NOT EXISTS 'professional'(
    'profesional_id' int AUTO_INCREMENT PRIMARY KEY,
    'professional_name' varchar (20) NOT NULL,
    'professional_experience' varchar (100) NOT NULL,
    'professional_certification' varchar (100) NOT NULL,
    'professional_degree' varchar (100) NOT NULL

);



CREATE TABLE IF NOT EXISTS 'job'(
    'job_id' int AUTO_INCREMENT PRIMARY KEY,
    'job_tittle' varchar (20) NOT NULL,
    'job_requirements' varchar (100) NOT NULL,
    'job_status' varchar (100) NOT NULL

);