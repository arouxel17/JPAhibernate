CREATE DATABASE  IF NOT EXISTS `spring_jpa_quest` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `spring_jpa_quest`;
DROP TABLE IF EXISTS `school`;
DROP TABLE IF EXISTS `wizard`;
CREATE TABLE `school` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
CREATE TABLE `wizard` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `school_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_school_id` (`school_id`),
  CONSTRAINT `FK_school_id` FOREIGN KEY (`school_id`) REFERENCES `school` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;