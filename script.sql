-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema bd_evento
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bd_evento
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bd_evento` DEFAULT CHARACTER SET latin1 ;
USE `bd_evento` ;

-- -----------------------------------------------------
-- Table `bd_evento`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_evento`.`cliente` (
  `id` INT(11) NOT NULL,
  `nome_cliente` VARCHAR(45) NULL DEFAULT NULL,
  `cpf` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `bd_evento`.`evento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_evento`.`evento` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `nome_evento` VARCHAR(45) NULL DEFAULT NULL,
  `cliente_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 7
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `bd_evento`.`hibernate_sequence`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_evento`.`hibernate_sequence` (
  `next_val` BIGINT(20) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
