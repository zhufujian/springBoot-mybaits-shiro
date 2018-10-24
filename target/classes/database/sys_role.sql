/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.6.30-log 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `sys_role` (
	`id` int (11),
	`available` bit (1),
	`description` varchar (765),
	`role` varchar (765)
); 
insert into `sys_role` (`id`, `available`, `description`, `role`) values('1','','管理员','admin');
insert into `sys_role` (`id`, `available`, `description`, `role`) values('2','','VIP会员','vip');
insert into `sys_role` (`id`, `available`, `description`, `role`) values('3','','test','test');
