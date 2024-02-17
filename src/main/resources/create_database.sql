create database if not exists booklending;
use booklending;

-- delete table if already exists
drop table if exists `user`;
drop table if exists inventory;
drop table if exists book;
drop table if exists borrowingRecord;

-- create tables
create table `user` (
	userID int primary key auto_increment,
    phoneNum varchar(20),
    `password` varchar(100),
    userName varchar(50),
    regisTime datetime,
    lastLoginTime datetime
)auto_increment = 10001;

create table book (
    ISBN varchar(20) primary key,
    `name` varchar(100),
    author varchar(100),
    introduction longtext
);

create table inventory (
	inventoryID int primary key auto_increment,
    ISBN varchar(20) not null,
    storeTime datetime,
    `status` varchar(20),
    foreign key (ISBN) references book(ISBN)
)auto_increment = 20001;

create table borrowingRecord (
	userID int not null,
    inventoryID int not null,
    borrowingTime datetime,
    returnTime datetime,
    constraint pk_userID_inventoryID primary key (userID, inventoryID)
);