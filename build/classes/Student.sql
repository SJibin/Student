DROP SCHEMA IF EXISTS `verizon` ;

-- -----------------------------------------------------
-- Schema verizon
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `verizon` DEFAULT CHARACTER SET utf8 ;
USE `verizon` ;

-- -----------------------------------------------------
-- Table `verizon`.`student`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `verizon`.`student` ;

CREATE TABLE IF NOT EXISTS `verizon`.`student` (
  `sId` INT(11) NULL DEFAULT NULL,
  `sName` VARCHAR(20) NULL DEFAULT NULL,
  `contactNo` DECIMAL(10,0) NULL DEFAULT NULL,
  `percentage` DOUBLE NULL DEFAULT NULL,
  `admissionDate` DATE NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;