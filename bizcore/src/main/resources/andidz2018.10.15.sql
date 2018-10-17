# Host: localhost  (Version: 5.0.96-community-nt)
# Date: 2018-10-15 18:48:53
# Generator: MySQL-Front 5.3  (Build 1.27)

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40101 SET SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;
/*!40103 SET SQL_NOTES='ON' */;

CREATE DATABASE `andidz` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `andidz`;

#
# Source for table "product"
#

CREATE TABLE `product` (
  `Id` int(11) NOT NULL auto_increment,
  `productNumb` varchar(255) NOT NULL default '',
  `productType` int(11) default '0',
  `productName` varchar(255) default NULL,
  `description` varchar(255) default NULL,
  `feature` varchar(255) default NULL,
  PRIMARY KEY  (`Id`),
  UNIQUE KEY `productNumb` (`productNumb`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Source for table "product_type"
#

CREATE TABLE `product_type` (
  `Id` int(11) NOT NULL auto_increment,
  `typeCode` varchar(255) default NULL,
  `typeName` varchar(255) default NULL,
  `description` varchar(255) default NULL,
  `feature` varchar(255) default NULL,
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Source for table "prodution_type"
#

CREATE TABLE `prodution_type` (
  `Id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `description` varchar(255) default NULL,
  `feature` varchar(255) default NULL,
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Source for table "production_order"
#

CREATE TABLE `production_order` (
  `Id` int(11) NOT NULL auto_increment,
  `orderNumb` varchar(255) NOT NULL default '',
  `productionType` int(11) NOT NULL default '1',
  `productNumb` varchar(255) NOT NULL default '',
  `createTime` datetime NOT NULL default '0000-00-00 00:00:00',
  `updateTime` datetime NOT NULL default '0000-00-00 00:00:00',
  `status` int(11) NOT NULL default '0',
  `expctStartTime` datetime default '0000-00-00 00:00:00',
  `expctEndTime` datetime default NULL,
  `completedProduce` int(11) NOT NULL default '0',
  `feature` varchar(255) default NULL,
  PRIMARY KEY  (`Id`),
  UNIQUE KEY `orderNumb` (`orderNumb`),
  KEY `productionType` (`productionType`),
  CONSTRAINT `production_order_ibfk_1` FOREIGN KEY (`productionType`) REFERENCES `prodution_type` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Source for table "production_plan"
#

CREATE TABLE `production_plan` (
  `planId` int(11) NOT NULL auto_increment,
  `orderNumb` varchar(255) default NULL,
  `data` datetime NOT NULL default '0000-00-00 00:00:00',
  `planningProduce` int(11) NOT NULL default '0',
  `completedProduce` int(11) NOT NULL default '0',
  `targetCompletion` double(5,4) default '0.0000',
  `createTime` datetime NOT NULL default '0000-00-00 00:00:00',
  `updateTime` datetime NOT NULL default '0000-00-00 00:00:00',
  `status` int(11) NOT NULL default '0',
  `feature` varchar(255) default NULL,
  PRIMARY KEY  (`planId`),
  KEY `orderNumb` (`orderNumb`),
  CONSTRAINT `production_plan_ibfk_1` FOREIGN KEY (`orderNumb`) REFERENCES `production_order` (`orderNumb`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Source for table "production_completed_detail"
#

CREATE TABLE `production_completed_detail` (
  `Id` int(11) NOT NULL auto_increment,
  `planId` int(11) NOT NULL default '0',
  `orderNumb` varchar(255) default NULL,
  `createTime` varchar(255) default NULL,
  `updateTime` varchar(255) default NULL,
  `status` varchar(255) default NULL,
  `type` varchar(255) default NULL,
  `completedProduce` varchar(255) default NULL,
  `qualifiedProduce` varchar(255) default NULL,
  `operator` varchar(255) default NULL,
  `feature` varchar(255) default NULL,
  PRIMARY KEY  (`Id`),
  KEY `planId` (`planId`),
  KEY `orderNumb` (`orderNumb`),
  CONSTRAINT `production_completed_detail_ibfk_2` FOREIGN KEY (`orderNumb`) REFERENCES `production_order` (`orderNumb`),
  CONSTRAINT `production_completed_detail_ibfk_1` FOREIGN KEY (`planId`) REFERENCES `production_plan` (`planId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Source for table "right_resource"
#

CREATE TABLE `right_resource` (
  `Id` int(11) NOT NULL auto_increment,
  `resourcePath` varchar(255) default NULL,
  `resourceName` varchar(255) default NULL,
  `description` varchar(255) default NULL,
  `feature` varchar(255) default NULL,
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Source for table "user"
#

CREATE TABLE `user` (
  `Id` int(11) NOT NULL auto_increment,
  `userNick` varchar(255) default NULL,
  `userName` varchar(255) NOT NULL default '',
  `password` varchar(255) NOT NULL default '',
  PRIMARY KEY  (`Id`),
  UNIQUE KEY `userName` (`userName`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

#
# Source for table "user_right_relationship"
#

CREATE TABLE `user_right_relationship` (
  `Id` int(11) NOT NULL auto_increment,
  `userId` int(11) NOT NULL default '0',
  `resourceId` int(11) NOT NULL default '0',
  PRIMARY KEY  (`Id`),
  KEY `resourceId` (`resourceId`),
  KEY `userId` (`userId`),
  CONSTRAINT `user_right_relationship_ibfk_2` FOREIGN KEY (`userId`) REFERENCES `user` (`Id`),
  CONSTRAINT `user_right_relationship_ibfk_1` FOREIGN KEY (`resourceId`) REFERENCES `right_resource` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Source for table "user_type"
#

CREATE TABLE `user_type` (
  `Id` int(11) NOT NULL auto_increment,
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Source for table "workshop_art"
#

CREATE TABLE `workshop_art` (
  `Id` int(11) NOT NULL auto_increment,
  `artName` varchar(255) default NULL,
  `workShopNumb` int(11) NOT NULL default '0',
  `artCode` varchar(255) default NULL,
  `avgQualify` double(5,4) default '0.0000',
  `description` varchar(255) default NULL,
  `feature` varchar(255) default NULL,
  PRIMARY KEY  (`Id`),
  UNIQUE KEY `workShopNumb` (`workShopNumb`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Source for table "production_task"
#

CREATE TABLE `production_task` (
  `taskId` int(11) NOT NULL auto_increment,
  `orderNumb` varchar(255) default NULL,
  `workshopNumb` int(11) NOT NULL default '0',
  `planningTotalProduce` int(11) NOT NULL default '0',
  `totalProduce` int(11) NOT NULL default '0',
  `totalQualify` int(11) NOT NULL default '0',
  `totalDeliver` int(11) NOT NULL default '0',
  `createTime` datetime NOT NULL default '0000-00-00 00:00:00',
  `status` int(11) NOT NULL default '0',
  `feature` varchar(255) default NULL,
  PRIMARY KEY  (`taskId`),
  KEY `orderNumb` (`orderNumb`),
  KEY `workshopNumb` (`workshopNumb`),
  CONSTRAINT `production_task_ibfk_2` FOREIGN KEY (`workshopNumb`) REFERENCES `workshop_art` (`workShopNumb`),
  CONSTRAINT `production_task_ibfk_1` FOREIGN KEY (`orderNumb`) REFERENCES `production_order` (`orderNumb`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Source for table "product_art_relationship"
#

CREATE TABLE `product_art_relationship` (
  `Id` int(11) NOT NULL auto_increment,
  `productId` int(11) NOT NULL default '0',
  `artId` int(11) NOT NULL default '0',
  PRIMARY KEY  (`Id`),
  KEY `productId` (`productId`),
  KEY `artId` (`artId`),
  CONSTRAINT `product_art_relationship_ibfk_2` FOREIGN KEY (`artId`) REFERENCES `workshop_art` (`Id`),
  CONSTRAINT `product_art_relationship_ibfk_1` FOREIGN KEY (`productId`) REFERENCES `product` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
