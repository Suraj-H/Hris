CREATE DATABASE hris_db;

USE hris_db;

CREATE TABLE branch_info (
    branch_id INTEGER NOT NULL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    location VARCHAR(100) NOT NULL
);





INSERT INTO
    employees
VALUES
    (
        1,
        'abc',
        'ABC',
        'MH',
        'Mumbai',
        '1989-08-08',
        9870987890,
        'emp1.abc@outlook.com',
        'a',
        'E',
        '2014-04-15',
        1,
        2,
        20000,
        'emp1',
        'emp1'
    ),
    (
        1,
        'Dheemant',
        'Jain',
        'Gujarat',
        'Bharuch',
        '1996-04-26',
        9993218198,
        'djain1@outlook.com',
        'a',
        'E',
        '2011-07-24',
        2,
        1,
        88000,
        'Jain1',
        'Jain1'
    ),
    (
        2,
        "Yaalisai",
        "Raj",
        "Tamil Nadu",
        "Chennai",
        "1996-11-11",
        7438495040,
        "yraj2@yahoo.com",
        "b",
        "M",
        "2012-10-09",
        1,
        3,
        150000,
        'Raj2',
        'Raj2'
    ),
    INSERT INTO employees VALUES
    (
        3,
        "Jasapal",
        "Khan",
        "Andhra Pradesh",
        "Malkajgiri",
        "1983-08-24",
        9817483096,
        "jkhan3@gmail.com",
        'd',
        'E',
        "2002-01-28",
        2,
        2,
        115000,
        'Khan3',
        'Khan3'
    );
    INSERT INTO employees VALUES
    (
        4,
        "Gangadutt",
        "Singh",
        "Karnataka",
        "Mangalore",
        "1984-02-17",
        9418192192,
        "gsingh4@outlook.com",
        'a',
        'E',
        "2008-04-30",
        1,
        3,
        40000,
        'Singh4',
        'Singh4'
    );
    INSERT INTO employees VALUES
    (
        5,
        "Ganitha",
        "Jain",
        "Uttar Pradesh",
        "Bareilly",
        "2008-05-10",
        9446249674,
        "gjain5@gmail.com",
        'b',
        'E',
        "2011-10-27",
        2,
        5,
        90000,
        'Jain5',
        'Jain5'
    );
    INSERT INTO employees VALUES
    (
        6,
        "Sulalit",
        "Kumar",
        "Bihar",
        "Gaya",
        "2008-11-23",
        9043965880,
        "skumar6@yahoo.com",
        'b',
        'E',
        "2011-06-01",
        1,
        2,
        90500,
        'Kumar6',
        'Kumar6'
    );
    INSERT INTO employees VALUES
    (
        7,
        "Ibrahim",
        "Singh",
        "Uttar Pradesh",
        "Budaun",
        "1994-03-20",
        9627690998,
        "isingh7@hotmail.com",
        'f',
        'E',
        "2017-10-21",
        2,
        3,
        72000,
        'Singh7',
        'Singh7'
    );
    INSERT INTO employees VALUES
    (
        8,
        "Chittesh",
        "Kumar",
        "Tamil Nadu",
        "Tiruchirapalli",
        "2007-07-07",
        9541483356,
        "ckumar8@gmail.com",
        'd',
        'E',
        "2008-10-02",
        3,
        2,
        110500,
        'Kumar8',
        'Kumar8'
    );
    INSERT INTO employees VALUES
    (
        9,
        "Ranjan",
        "Raj",
        "Uttar Pradesh",
        "Varanasi",
        "1982-07-03",
        9577847061,
        "rraj9@gmail.com",
        'c',
        'E',
        "2000-07-25",
        2,
        1,
        75500,
        'Raj9',
        'Raj9'
    );
    INSERT INTO employees VALUES
    (
        10,
        "Enakshi",
        "Khan",
        "Kerala",
        "Cochin",
        "1982-04-21",
        9138327459,
        "ekhan10@outlook.com",
        'e',
        'E',
        "2017-02-04",
        2,
        4,
        26500,
        'Khan10',
        'Khan10'
    );

CREATE TABLE department_info (
    department_id INTEGER NOT NULL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE employees (
    employee_id INTEGER NOT NULL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    state VARCHAR(50) NOT NULL,
    city VARCHAR(50) NOT NULL,
    date_of_birth DATE NOT NULL,
    phone_no BIGINT NOT NULL,
    email VARCHAR(100) NOT NULL,
    qualification VARCHAR(50),
    post_level VARCHAR(50),
    joining_date VARCHAR(50),
    department_id INTEGER NOT NULL,
    branch_id INTEGER NOT NULL,
    salary DOUBLE(50, 2) NOT NULL,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    FOREIGN KEY(branch_id) REFERENCES branch_info(branch_id),
    FOREIGN KEY(department_id) REFERENCES department_info(department_id)
);

CREATE TABLE projects (
    project_id INTEGER NOT NULL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    branch_id INTEGER NOT NULL,
    FOREIGN KEY(branch_id) REFERENCES branch_info(branch_id)
);

CREATE TABLE employee_project_info (
    employee_id INTEGER NOT NULL,
    project_id INTEGER NOT NULL,
    role_in_project VARCHAR(50),
    FOREIGN KEY(employee_id) REFERENCES employees(employee_id),
    FOREIGN KEY(project_id) REFERENCES projects(project_id),
    UNIQUE KEY(employee_id, project_id)
);

CREATE TABLE work_Info (
    employee_id INTEGER NOT NULL,
    working_hours INTEGER NOT NULL,
    no_of_days INTEGER NOT NULL,
    FOREIGN KEY(employee_id) REFERENCES employees(employee_id)
);