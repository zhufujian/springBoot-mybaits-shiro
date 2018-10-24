/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.6.30-log 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `user_info` (
	`uid` int (11),
	`name` varchar (765),
	`password` varchar (765),
	`salt` varchar (765),
	`state` tinyint (4),
	`username` varchar (765)
); 
insert into `user_info` (`uid`, `name`, `password`, `salt`, `state`, `username`) values('1','管理员','d3c59d25033dbf980d29554025c23a75','8d78869f470951332959580424d4bf4f','0','admin');
