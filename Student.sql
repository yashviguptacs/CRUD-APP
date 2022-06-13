create table Student
(
id int primary key not null unique,
name char(35) not null,
aadhar char(12) not null unique,
mobileNumber char(10) not null unique,
isIndian char(1)
);