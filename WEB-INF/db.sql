CREATE DATABASE hris_db;

USE hris_db;

CREATE TABLE Branch (
    branch_id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    location VARCHAR(100) NOT NULL
);

CREATE TABLE Department (
    department_id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    location VARCHAR(100) NOT NULL
);

CREATE TABLE Employee (
    employee_id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(50) NOT NULL,
    age INTEGER NOT NULL,
    address VARCHAR(50) NOT NULL,
    date_of_birth VARCHAR(50),
    phone_no INTEGER NOT NULL,
    email_id VARCHAR(100) NOT NULL,
    qualification VARCHAR(50),
    post_level VARCHAR(50),
    joining_date VARCHAR(50),
    department_id INTEGER NOT NULL,
    branch_id INTEGER NOT NULL,
    salary INTEGER NOT NULL,
    FOREIGN KEY(branch_id) REFERENCES Branch(branch_id) ON DELETE CASCADE,
    FOREIGN KEY(department_id) REFERENCES Department(department_id) ON DELETE CASCADE
);

CREATE TABLE Project (
    project_id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY, 
    name VARCHAR(100) NOT NULL,
    location VARCHAR(50) NOT NULL,
    project_base VARCHAR(50) NOT NULL
);

CREATE TABLE Employee_Project (
    employee_id INTEGER NOT NULL,
    project_id INTEGER NOT NULL,
    role_in_project VARCHAR(50),
    FOREIGN KEY(employee_id) REFERENCES Employee(employee_id) ON DELETE CASCADE,
    FOREIGN KEY(project_id) REFERENCES Project(project_id) ON DELETE CASCADE    
);

CREATE TABLE Work_Info (
    employee_id INTEGER NOT NULL,
    working_hours INTEGER NOT NULL,
    no_of_days INTEGER NOT NULL,
    FOREIGN KEY(employee_id) REFERENCES Employee(employee_id) ON DELETE CASCADE
);

CREATE TABLE Login_Info (
    employee_id INTEGER NOT NULL,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    FOREIGN KEY(employee_id) REFERENCES Employee(employee_id) ON DELETE CASCADE
);