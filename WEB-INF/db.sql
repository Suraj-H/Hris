CREATE DATABASE IF NOT EXISTS hris_db;

USE hris_db;

DROP TABLE IF EXISTS `state_info`;

CREATE TABLE `state_info` (
  `id` int NOT NULL,
  `code` char(2) NOT NULL,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

LOCK TABLES `state_info` WRITE;

INSERT INTO
  `state_info`
VALUES
  (1, 'JK', 'Jammu & Kashmir'),
  (2, 'HP', 'Himachal Pradesh'),
  (3, 'PB', 'Punjab'),
  (4, 'CH', 'Chandigarh'),
  (5, 'UT', 'Uttranchal'),
  (6, 'HR', 'Haryana'),
  (7, 'DL', 'Delhi'),
  (8, 'RJ', 'Rajasthan'),
  (9, 'UP', 'Uttar Pradesh'),
  (10, 'BH', 'Bihar'),
  (11, 'SK', 'Sikkim'),
  (12, 'AR', 'Arunachal Pradesh'),
  (13, 'NL', 'Nagaland'),
  (14, 'MN', 'Manipur'),
  (15, 'MI', 'Mizoram'),
  (16, 'TR', 'Tripura'),
  (17, 'ME', 'Meghalaya'),
  (18, 'AS', 'Assam'),
  (19, 'WB', 'West Bengal'),
  (20, 'JH', 'Jharkhand'),
  (21, 'OR', 'Orissa'),
  (22, 'CT', 'Chhattisgarh'),
  (23, 'MP', 'Madhya Pradesh'),
  (24, 'GJ', 'Gujarat'),
  (25, 'DD', 'Daman & Diu'),
  (26, 'DN', 'Dadra & Nagar Haveli'),
  (27, 'MH', 'Maharashtra'),
  (28, 'AP', 'Andhra Pradesh'),
  (29, 'KA', 'Karnataka'),
  (30, 'GA', 'Goa'),
  (31, 'LD', 'Lakshdweep'),
  (32, 'KL', 'Kerala'),
  (33, 'TN', 'Tamil Nadu'),
  (34, 'PY', 'Pondicherry'),
  (35, 'AN', 'Andaman & Nicobar Islands'),
  (36, 'TS', 'Telangana'),
  (37, 'AD', 'Andhra Pradesh (New)');

UNLOCK TABLES;

DROP TABLE IF EXISTS `district_info`;

CREATE TABLE `district_info` (
  `id` int NOT NULL,
  `code` int NOT NULL,
  `name` varchar(50) NOT NULL,
  `state_code` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `state_code` (`state_code`),
  CONSTRAINT `district_info_ibfk_1` FOREIGN KEY (`state_code`) REFERENCES `state_info` (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

LOCK TABLES `district_info` WRITE;

INSERT INTO
  `district_info`
VALUES
  (1, 1, 'Nandurbar', 27),
  (2, 2, 'Dhule', 27),
  (3, 3, 'Jalgaon', 27),
  (4, 4, 'Buldana', 27),
  (5, 5, 'Akola', 27),
  (6, 6, 'Washim', 27),
  (7, 7, 'Amravati', 27),
  (8, 8, 'Wardha', 27),
  (9, 9, 'Nagpur', 27),
  (10, 10, 'Bhandara', 27),
  (11, 11, 'Gondiya', 27),
  (12, 12, 'Gadchiroli', 27),
  (13, 13, 'Chandrapur', 27),
  (14, 14, 'Yavatmal', 27),
  (15, 15, 'Nanded', 27),
  (16, 16, 'Hingoli', 27),
  (17, 17, 'Parbhani', 27),
  (18, 18, 'Jalna', 27),
  (19, 19, 'Aurangabad', 27),
  (20, 20, 'Nashik', 27),
  (21, 21, 'Thane', 27),
  (22, 22, 'Mumbai (Suburban)', 27),
  (23, 23, 'Mumbai', 27),
  (24, 24, 'Raigarh', 27),
  (25, 25, 'Pune', 27),
  (26, 26, 'Ahmadnagar', 27),
  (27, 27, 'Bid', 27),
  (28, 28, 'Latur', 27),
  (29, 29, 'Osmanabad', 27),
  (30, 30, 'Solapur', 27),
  (31, 31, 'Satara', 27),
  (32, 32, 'Ratnagiri', 27),
  (33, 33, 'Sindhudurg', 27),
  (34, 34, 'Kolhapur', 27),
  (35, 35, 'Sangli', 27),
  (36, 1, 'Chamba', 2),
  (37, 2, 'Kangra', 2),
  (38, 3, 'Lahul & Spiti', 2),
  (39, 4, 'Kullu', 2),
  (40, 5, 'Mandi', 2),
  (41, 6, 'Hamirpur', 2),
  (42, 7, 'Una', 2),
  (43, 8, 'Bilaspur', 2),
  (44, 9, 'Solan', 2),
  (45, 10, 'Sirmaur', 2),
  (46, 11, 'Shimla', 2),
  (47, 12, 'Kinnaur', 2),
  (48, 1, 'Gurdaspur', 3),
  (49, 2, 'Amritsar', 3),
  (50, 3, 'Kapurthala', 3),
  (51, 4, 'Jalandhar', 3),
  (52, 5, 'Hoshiarpur', 3),
  (53, 6, 'Nawanshahr', 3),
  (54, 7, 'Rupnagar', 3),
  (55, 8, 'Fatehgarh Sahib', 3),
  (56, 9, 'Ludhiana', 3),
  (57, 10, 'Moga', 3),
  (58, 11, 'Firozpur', 3),
  (59, 12, 'Muktsar', 3),
  (60, 13, 'Faridkot', 3),
  (61, 14, 'Bathinda', 3),
  (62, 15, 'Mansa', 3),
  (63, 16, 'Sangrur', 3),
  (64, 17, 'Patiala', 3),
  (65, 1, 'Chandigarh', 4),
  (66, 1, 'Uttarkashi', 5),
  (67, 2, 'Chamoli', 5),
  (68, 3, 'Rudraprayag', 5),
  (69, 4, 'Tehri Garhwal', 5),
  (70, 5, 'Dehradun', 5),
  (71, 6, 'Garhwal', 5),
  (72, 7, 'Pithoragarh', 5),
  (73, 8, 'Bageshwar', 5),
  (74, 9, 'Almora', 5),
  (75, 10, 'Champawat', 5),
  (76, 11, 'Nainital', 5),
  (77, 12, 'Udham Singh Nagar', 5),
  (78, 13, 'Hardwar', 5),
  (79, 1, 'Tawang', 12),
  (80, 2, 'West Kameng', 12),
  (81, 3, 'East Kameng', 12),
  (82, 4, 'Papum Pare', 12),
  (83, 5, 'Lower Subansiri', 12),
  (84, 6, 'Upper Sabansiri', 12),
  (85, 7, 'West Siang', 12),
  (86, 8, 'East Siang', 12),
  (87, 9, 'Upper Siang', 12),
  (88, 10, 'Dibang Valley', 12),
  (89, 11, 'Lohit', 12),
  (90, 12, 'Changlang', 12),
  (91, 13, 'Tirap', 12),
  (92, 18, 'Bangalor', 29),
  (93, 7, 'Ahmadabad', 24),
  (94, 2, 'Chennai', 33),
  (95, 5, 'New Delhi', 7),
  (96, 1, 'North Goa', 30),
  (97, 18, 'Gurgaon', 6),
  (98, 5, 'Hyderabad', 36),
  (99, 16, 'Kolkata', 19),
  (100, 26, 'Lucknow', 9);

UNLOCK TABLES;

DROP TABLE IF EXISTS `branch_info`;

CREATE TABLE `branch_info` (
  `id` int NOT NULL,
  `address` varchar(50) NOT NULL,
  `district_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `district_id` (`district_id`),
  CONSTRAINT `branch_info_ibfk_1` FOREIGN KEY (`district_id`) REFERENCES `district_info` (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

LOCK TABLES `branch_info` WRITE;

INSERT INTO
  `branch_info`
VALUES
  (1, 'Nariman Point', 23),
  (2, 'Andheri', 22),
  (3, 'Powai', 23),
  (4, 'Vikhroli West', 23),
  (5, 'Borivali East', 22),
  (6, 'Colaba', 23),
  (7, 'Malad East', 23),
  (8, 'Fort', 23),
  (9, 'Pokhran Road 2', 21),
  (10, 'Bhosari', 25),
  (11, 'Mangaldas Road', 25),
  (12, 'Hadapsar', 25),
  (13, 'Koregaon Road', 25),
  (14, 'Yerwada', 25),
  (15, 'Whitefield Road', 18),
  (16, 'Baroda', 18),
  (17, 'Gandinagar', 18),
  (18, 'Ellis Bridge', 7),
  (19, 'Siruseri', 2),
  (20, 'Karapakkam', 2),
  (21, 'Velachery', 2),
  (22, 'Taramani', 2),
  (23, 'Cathedral Road', 2),
  (24, 'Lloyds Road', 2),
  (25, 'Thoraipakkam', 2),
  (26, '4 Parliament Street', 5),
  (27, 'Mapusa', 1),
  (28, 'HSIDC', 18),
  (29, 'Sector 19', 18),
  (30, 'Fateh Maidan Road', 5),
  (31, 'Madhapur', 5),
  (32, 'Cyberabad', 5),
  (33, 'Bidhannagar', 16),
  (34, 'Salt Lake', 16),
  (35, 'New Town', 16),
  (36, 'Gomti Nagar', 26);

UNLOCK TABLES;

DROP TABLE IF EXISTS `department_info`;

CREATE TABLE `department_info` (
  `id` int NOT NULL,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

LOCK TABLES `department_info` WRITE;

INSERT INTO
  `department_info`
VALUES
  (1, 'Application developement & Maintenance'),
  (2, 'Asset Leverage Solutions'),
  (3, 'Assurance Services'),
  (4, 'Business Process Outsourcing'),
  (5, 'Consulting'),
  (6, 'Engineering and Industial Services'),
  (7, 'Enterprise Solutions'),
  (8, 'IT Infrastructure Services'),
  (9, 'Cloud Infrastructure'),
  (10, 'Automation and AI');

UNLOCK TABLES;

DROP TABLE IF EXISTS `employees`;

CREATE TABLE `employees` (
  `id` int NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `address` varchar(100) NOT NULL,
  `state_id` int NOT NULL,
  `district_id` int NOT NULL,
  `date_of_birth` varchar(50) NOT NULL,
  `phone_no` bigint NOT NULL,
  `email` varchar(100) NOT NULL,
  `qualification` varchar(50) NOT NULL,
  `designation` varchar(50) NOT NULL,
  `joining_date` varchar(50) NOT NULL,
  `department_id` int NOT NULL,
  `branch_id` int NOT NULL,
  `salary` double(50, 2) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `branch_id` (`branch_id`),
  KEY `department_id` (`department_id`),
  KEY `state_id` (`state_id`),
  KEY `city_id` (`district_id`),
  CONSTRAINT `employees_ibfk_1` FOREIGN KEY (`branch_id`) REFERENCES `branch_info` (`id`),
  CONSTRAINT `employees_ibfk_2` FOREIGN KEY (`department_id`) REFERENCES `department_info` (`id`),
  CONSTRAINT `employees_ibfk_3` FOREIGN KEY (`state_id`) REFERENCES `state_info` (`id`),
  CONSTRAINT `employees_ibfk_4` FOREIGN KEY (`district_id`) REFERENCES `district_info` (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

LOCK TABLES `employees` WRITE;

INSERT INTO
  `employees`
VALUES
  (
    1,
    'Dheemant',
    'Jain',
    'a',
    27,
    9,
    '1996-04-26',
    9993218198,
    'djain1@outlook.com',
    'M.C.A.',
    'Software Engineer',
    '2011-07-24',
    2,
    1,
    55000.00,
    'Jain1',
    'Jain1'
  ),
  (
    2,
    'Yaalisai',
    'Raj',
    'b',
    27,
    19,
    '1996-11-11',
    7438495040,
    'yraj2@yahoo.com',
    'M.B.A.',
    'Consultant',
    '2012-10-09',
    1,
    3,
    60000.00,
    'Raj2',
    'Raj2'
  ),
  (
    3,
    'Jasapal',
    'Khan',
    'c',
    27,
    25,
    '1983-08-24',
    9817483096,
    'jkhan3@gmail.com',
    'Computer Eng.',
    'Project Manager',
    '2002-01-28',
    2,
    2,
    115000.00,
    'Khan3',
    'Khan3'
  ),
  (
    4,
    'Gangadutt',
    'Singh',
    'd',
    27,
    26,
    '1984-02-17',
    9418192192,
    'gsingh4@outlook.com',
    'B.S.C.I.T.',
    'Software Engineer',
    '2008-04-30',
    5,
    5,
    40000.00,
    'Singh4',
    'Singh4'
  ),
  (
    5,
    'Ganitha',
    'Jain',
    'e',
    27,
    23,
    '2008-05-10',
    9446249674,
    'gjain5@gmail.com',
    'Computer Eng.',
    'Team Leader',
    '2011-10-27',
    2,
    8,
    90000.00,
    'Jain5',
    'Jain5'
  ),
  (
    6,
    'Sulalit',
    'Kumar',
    'f',
    27,
    23,
    '2008-11-23',
    9043965880,
    'skumar6@yahoo.com',
    'M.B.A.',
    'Project Manager',
    '2011-06-01',
    1,
    2,
    90500.00,
    'Kumar6',
    'Kumar6'
  ),
  (
    7,
    'Ibrahim',
    'Singh',
    'g',
    27,
    25,
    '1994-03-20',
    9627690998,
    'isingh7@hotmail.com',
    'Computer Eng.',
    'Software Engineer',
    '2017-10-21',
    2,
    10,
    72000.00,
    'Singh7',
    'Singh7'
  ),
  (
    8,
    'Chittesh',
    'Kumar',
    'h',
    27,
    21,
    '2007-07-07',
    9541483356,
    'ckumar8@gmail.com',
    'M.B.A.',
    'Project Manager',
    '2008-10-02',
    1,
    9,
    110500.00,
    'Kumar8',
    'Kumar8'
  ),
  (
    9,
    'Ranjan',
    'Raj',
    'i',
    27,
    23,
    '1982-07-03',
    9577847061,
    'rraj9@gmail.com',
    'M.C.A.',
    'Software Engineer',
    '2000-07-25',
    5,
    4,
    75500.00,
    'Raj9',
    'Raj9'
  ),
  (
    10,
    'Enakshi',
    'Khan',
    'j',
    27,
    23,
    '1982-04-21',
    9138327459,
    'ekhan10@outlook.com',
    'B.S.C.I.T.',
    'Software Trainee',
    '2017-02-04',
    2,
    7,
    26500.00,
    'Khan10',
    'Khan10'
  );

UNLOCK TABLES;

DROP TABLE IF EXISTS `projects`;

CREATE TABLE `projects` (
  `project_id` int NOT NULL,
  `name` varchar(100) NOT NULL,
  `branch_id` int NOT NULL,
  PRIMARY KEY (`project_id`),
  KEY `branch_id` (`branch_id`),
  CONSTRAINT `projects_ibfk_1` FOREIGN KEY (`branch_id`) REFERENCES `branch_info` (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

DROP TABLE IF EXISTS `employee_project_info`;

CREATE TABLE `employee_project_info` (
  `employee_id` int NOT NULL,
  `project_id` int NOT NULL,
  `role_in_project` varchar(50) DEFAULT NULL,
  UNIQUE KEY `employee_id` (`employee_id`, `project_id`),
  KEY `project_id` (`project_id`),
  CONSTRAINT `employee_project_info_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`id`),
  CONSTRAINT `employee_project_info_ibfk_2` FOREIGN KEY (`project_id`) REFERENCES `projects` (`project_id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

DROP TABLE IF EXISTS `work_info`;

CREATE TABLE `work_info` (
  `employee_id` int NOT NULL,
  `working_hours` int NOT NULL,
  `no_of_days` int NOT NULL,
  KEY `employee_id` (`employee_id`),
  CONSTRAINT `work_info_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

DROP TABLE IF EXISTS `auth_info`;

CREATE TABLE `auth_info` (
  `id` int NOT NULL,
  `employee_id` int NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `access_level` char(8) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `employee_id` (`employee_id`),
  CONSTRAINT `auth_info_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

CREATE USER 'guest' @'localhost' IDENTIFIED BY 'surajh';

GRANT
SELECT
  ON hris_db.* TO `guest` @`localhost`;

FLUSH PRIVILEGES;