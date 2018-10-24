/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.6.30-log 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `sys_permission` (
	`id` int (11),
	`available` bit (1),
	`name` varchar (765),
	`parent_id` bigint (20),
	`parent_ids` varchar (765),
	`permission` varchar (765),
	`resource_type` char (18),
	`url` varchar (765)
); 
insert into `sys_permission` (`id`, `available`, `name`, `parent_id`, `parent_ids`, `permission`, `resource_type`, `url`) values('1','','用户管理','0','0/','userInfo:view','menu','userInfo/userList');
insert into `sys_permission` (`id`, `available`, `name`, `parent_id`, `parent_ids`, `permission`, `resource_type`, `url`) values('2','','用户添加','1','0/1','userInfo:add','button','userInfo/userAdd');
insert into `sys_permission` (`id`, `available`, `name`, `parent_id`, `parent_ids`, `permission`, `resource_type`, `url`) values('3','','用户删除','1','0/1','userInfo:del','button','userInfo/userDel');
