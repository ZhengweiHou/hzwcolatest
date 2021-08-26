-- create table user

CREATE TABLE `hzw_user` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `display_name` varchar(50) DEFAULT NULL,
  `fcd` datetime NOT NULL,
  `fcu` varchar(50) NOT NULL,
  `lcd` datetime NOT NULL,
  `lcu` varchar(50) NOT NULL,
  `version` bigint(20) DEFAULT '0',
  PRIMARY KEY (`id`)
)