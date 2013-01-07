create database jadz;
use jadz;

create user jadz_admin identified by 'jadz';
create user 'jadz_admin'@'localhost' identified by 'jadz';
GRANT ALL ON jadz.* TO 'jadz_admin'@'localhost';
 
create table JOB (
ID INT NOT NULL AUTO_INCREMENT,
PRIMARY KEY(ID),
WHEN_CREATED DATE,
WHEN_COMMITMENT_START DATE,
WHEN_COMMITMENT_END DATE
WHEN_MODIFIED DATE
)
;

create table CUSTOMER (
ID INT NOT NULL AUTO_INCREMENT,
PRIMARY KEY(ID),
NAME VARCHAR(20),
DESCRIPTION()

)
;
