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

CREATE TABLE state_info (
    code INTEGER NOT NULL PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);

INSERT INTO city_info VALUES
(1, 01, "Nandurbar", 27),
(2, 02, "Dhule", 27),
(3, 03, "Jalgaon", 27),
(4, 04, "Buldana", 27),
(5, 05, "Akola", 27),
(6, 06, "Washim", 27),
(7, 07, "Amravati", 27),
(8, 08, "Wardha", 27),
(9, 09, "Nagpur", 27),
(10, 10, "Bhandara", 27),
(11, 11, "Gondiya", 27),
(12, 12, "Gadchiroli", 27),
(13, 13, "Chandrapur", 27),
(14, 14, "Yavatmal", 27),
(15, 15, "Nanded", 27),
(16, 16, "Hingoli", 27),
(17, 17, "Parbhani", 27),
(18, 18, "Jalna", 27),
(19, 19, "Aurangabad", 27),
(20, 20, "Nashik", 27),
(21, 21, "Thane", 27),
(22, 22, "Mumbai (Suburban)", 27),
(23, 23, "Mumbai", 27),
(24, 24, "Raigarh", 27),
(25, 25, "Pune", 27),
(26, 26, "Ahmadnagar", 27),
(27, 27, "Bid", 27),
(28, 28, "Latur", 27),
(29, 29, "Osmanabad", 27),
(30, 30, "Solapur", 27),
(31, 31, "Satara", 27),
(32, 32, "Ratnagiri", 27),
(33, 33, "Sindhudurg", 27),
(34, 34, "Kolhapur", 27),
(35, 35, "Sangli", 27),
(36, 01, "Chamba", 02),
(37, 02, "Kangra", 02),
(38, 03, "Lahul & Spiti", 02),
(39, 04, "Kullu", 02),
(40, 05, "Mandi", 02),
(41, 06, "Hamirpur", 02),
(42, 07, "Una", 02),
(43, 08, "Bilaspur", 02),
(44, 09, "Solan", 02),
(45, 10, "Sirmaur", 02),
(46, 11, "Shimla", 02),
(47, 12, "Kinnaur", 02),
(48, 01, "Gurdaspur", 03),
(49, 02, "Amritsar", 03),
(50, 03, "Kapurthala", 03),
(51, 04, "Jalandhar", 03),
(52, 05, "Hoshiarpur", 03),
(53, 06, "Nawanshahr", 03),
(54, 07, "Rupnagar", 03),
(55, 08, "Fatehgarh Sahib", 03),
(56, 09, "Ludhiana", 03),
(57, 10, "Moga", 03),
(58, 11, "Firozpur", 03),
(59, 12, "Muktsar", 03),
(60, 13, "Faridkot", 03),
(61, 14, "Bathinda", 03),
(62, 15, "Mansa", 03),
(63, 16, "Sangrur", 03),
(64, 17, "Patiala", 03),
(65, 01, "Chandigarh", 04),
(66, 01, "Uttarkashi", 05),
(67, 02, "Chamoli", 05),
(68, 03, "Rudraprayag", 05),
(69,04, "Tehri Garhwal", 05),
(70,05, "Dehradun", 05),
(71,06, "Garhwal", 05),
(72,07, "Pithoragarh", 05),
(73,08, "Bageshwar", 05),
(74,09, "Almora", 05),
(75,10, "Champawat", 05),
(76,11, "Nainital", 05),
(77,12, "Udham Singh Nagar", 05),
(78,13, "Hardwar", 05),
(79,01, "Tawang", 12),
(80,02, "West Kameng", 12),
(81,03, "East Kameng", 12),
(82,04, "Papum Pare", 12),
(83,05, "Lower Subansiri", 12),
(84,06, "Upper Sabansiri", 12),
(85,07, "West Siang", 12),
(86,08, "East Siang", 12),
(87,09, "Upper Siang", 12),
(88,10, "Dibang Valley", 12),
(89,11, "Lohit", 12),
(90,12, "Changlang", 12),
(91,13, "Tirap", 12);




CREATE TABLE city_info (
    id INTEGER NOT NULL,
    code INTEGER NOT NULL,
    name VARCHAR(50) NOT NULL,
    state_code INTEGER NOT NULL,
    PRIMARY KEy(id),
    FOREIGN KEY(state_code) REFERENCES state_info(code)
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