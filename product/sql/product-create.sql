CREATE SCHEMA `tavorn` ;

CREATE TABLE `PRODUCT` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TYPE_ID` int(11) DEFAULT NULL,
  `NAME` varchar(45) CHARACTER SET tis620 DEFAULT NULL,
  `IMAGE` longblob,
  `STATUS_ID` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE `tavorn`.`PACKAGE` (
  `ID` INT NOT NULL,
  `COST` VARCHAR(45) NULL,
  `PRICE` VARCHAR(45) NULL,
  `EXTRA_PRICE` VARCHAR(45) NULL,
  `PRODUCT_ID` VARCHAR(45) NULL,
  `PACKAGE_TYPE_ID` VARCHAR(45) NULL,
  PRIMARY KEY (`ID`));

CREATE TABLE `PACKAGE_TYPE` (
  `ID` int(11) NOT NULL,
  `NAME` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
);


CREATE TABLE `tavorn`.`PRODUCT_TYPE` (
  `ID` INT NOT NULL,
  `NAME` VARCHAR(45) NULL,
  PRIMARY KEY (`ID`));
