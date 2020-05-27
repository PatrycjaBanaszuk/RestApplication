CREATE TABLE IF NOT EXISTS problems (
hu_number INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
business_partner VARCHAR(255),
rma_number INT,
product_id INT,
product_quantity INT DEFAULT 1,
problem_description VARCHAR(255) NOT NULL,
wh_comments VARCHAR(255),
cs_comment VARCHAR(255),
status VARCHAR(255),
creation_date DATETIME,
updated_date DATETIME,
processed_date DATETIME,
deleted_date DATETIME
);