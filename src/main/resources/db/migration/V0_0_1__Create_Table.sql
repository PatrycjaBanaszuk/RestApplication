CREATE TABLE user (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    first_name varchar(255),
    last_name varchar(255),
    age int,
    created_on DATETIME,
    updated_on DATETIME,
    deleted_on DATETIME,
    PRIMARY KEY (`id`)
    );
