CREATE TABLE tbOwners (
    idTbOwner int PRIMARY KEY auto_increment,
    uuid varchar(255),
    firstName varchar(30),
    lastName varchar(255),
    birthDate datetime,
    cpf varchar(11) unique,
    rg varchar(9) unique,
    rne varchar(11)unique,
    passport varchar(15) unique,
    nationality varchar(30),
    naturalness varchar(30),
    mothersFullName varchar(255),
    fathersFullName varchar(255),
    maritalStatus varchar(15),
    occupation varchar(20),
    schooling varchar(20),
    activie boolean not null,
    manager boolean,
    createdAt timestamp,
    updatedAt timestamp
) engine=InnoDB;