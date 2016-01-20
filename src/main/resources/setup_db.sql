USE `online_tests`;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";
--
-- Database: `online_tests`
--
--
-- Table structure for table `Category`
--
CREATE TABLE IF NOT EXISTS `Category` (`CId` int(11) NOT NULL AUTO_INCREMENT, `name` varchar(50) CHARACTER SET utf8 NOT NULL, PRIMARY KEY (`CId`)) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;
--
-- Table structure for table `Question`
--
CREATE TABLE IF NOT EXISTS `Question` (`questionId` int(11) NOT NULL AUTO_INCREMENT, `categoryId` int(11) NOT NULL, `question` varchar(50) CHARACTER SET utf8 NOT NULL, `answerA` varchar(50) NOT NULL, `answerB` varchar(50) NOT NULL, `answerC` varchar(50) NOT NULL, `answerD` varchar(50) NOT NULL, `correctAnswer` enum('A','B','C','D') NOT NULL, PRIMARY KEY (`questionId`), KEY `categoryId` (`categoryId`), CONSTRAINT `FK_Question_Category` FOREIGN KEY (`categoryId`) REFERENCES `Category` (`CId`)) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;
--
-- Table structure for table `Question_Statistic`
--
CREATE TABLE IF NOT EXISTS `Question_Statistic` (`statisticId` int(11) NOT NULL AUTO_INCREMENT, `questionId` int(11) NULL, `answerA` int(2) NOT NULL, `answerB` int(2) NOT NULL, `answerC` int(2) NOT NULL, `answerD` int(2) NOT NULL, `answerNumber` int(11) NOT NULL,PRIMARY KEY (`statisticId`), UNIQUE KEY `questionId` (`questionId`), CONSTRAINT `FK_Question_Statistic_Question` FOREIGN KEY (`questionId`) REFERENCES `Question` (`questionId`)) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;
--
-- Table structure for table `User`
--
CREATE TABLE IF NOT EXISTS `User` (`userId` int(11) NOT NULL AUTO_INCREMENT, `username` varchar(50) CHARACTER SET utf8 NOT NULL, `password` varchar(50) CHARACTER SET utf8 NOT NULL, `name` varchar(50) CHARACTER SET utf8 NOT NULL, `age` int(11) NOT NULL, `email` varchar(50) CHARACTER SET utf8 NOT NULL, `gender` enum('M','F') NOT NULL, PRIMARY KEY (`userId`), UNIQUE KEY `username` (`username`)) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;
--
-- Table structure for table `Test_Result`
--
CREATE TABLE IF NOT EXISTS `Test_Result` (`userId` int(11) NOT NULL, `categoryId` int(11) NOT NULL, `score` float(11) NOT NULL, CONSTRAINT `FK_Test_Result_User` FOREIGN KEY (`userId`) REFERENCES `User` (`userId`), CONSTRAINT `FK_Test_Result_Category` FOREIGN KEY (`categoryId`) REFERENCES `Category` (`CId`)) ENGINE=InnoDB DEFAULT CHARSET=latin1;