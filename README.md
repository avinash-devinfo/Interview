These commands should be run in mysql before starting the project.


MYSQL Commands:

drop table if exists company;
drop table if exists address;

CREATE TABLE Company(company_id BIGINT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255) not null);
Create table Address (address_id BIGINT auto_increment Primary key, company_id bigint not null,street_address Varchar(255) not null,city_name Varchar(255) not null, foreign key (company_id) references Company(company_id));

INSERT INTO Company (name) VALUES ('Tech Innovators'), ('Green Solutions'), ('Alpha Crop'), ('Urban Ventures'), ('NextGen Dynamics');
INSERT INTO address (company_id, street_address, city_name) VALUES 
(1, '123 ABC Lane','Mumbai'),
(1,'321 Tech Colony', 'Delhi'),
(2, '456 greenway rd', 'seattle'),
(1, '789 Rajib Chowk', 'Delhi'),
(4, '101 Maidan St', 'Kolkata'),
(1, '540 Sarojini Nagar', 'Delhi');
