-- --------------------------------------------------------
-- Autor:                        NEOSUNIVERSITY
-- BD LIBRARY FOR FX PROJECT:    version 1.0
-- --------------------------------------------------------


-- estructura de base de datos para library
DROP DATABASE IF EXISTS `library`;
CREATE DATABASE IF NOT EXISTS `library`;
USE `library`;

--  estructura para tabla library.libros
DROP TABLE IF EXISTS `libros`;
CREATE TABLE IF NOT EXISTS `libros` (
  `id_libro`    int(11)      NOT NULL,
  `nombrelibro` varchar(150)  NULL,
  `autor`       varchar(150)  NULL,
  `editorial`   varchar(150)  NULL
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

ALTER TABLE `libros` ADD PRIMARY KEY (`id_libro`);
ALTER TABLE `libros`CHANGE COLUMN `id_libro` `id_libro` INT(11) NOT NULL AUTO_INCREMENT FIRST;

INSERT INTO `libros` (`nombrelibro`, `autor`, `editorial`) VALUES ('MONGO DB IN ACTION', 'KYLE BANKER', 'MANNING');
INSERT INTO `libros` (`nombrelibro`, `autor`, `editorial`) VALUES ('THE QUICK PHYTHON COOK', 'NAOMI CEDER', 'MANNING');
INSERT INTO `libros` (`nombrelibro`, `autor`, `editorial`) VALUES ('SPRING MICROSERVICES IN ACTION', 'JHON CARNELL', 'MANNING');

