/*add wujiafeng 2020/01/15 课程表 start*/
CREATE TABLE IF NOT EXISTS `course_1`(
   `course_id` BIGINT comment '主键',
   `course_name` VARCHAR(2000) NOT NULL comment '课程名称',
   `user_id` BIGINT NOT NULL comment '用户id',
   `course_status` VARCHAR(1) NOT NULL comment '课程状态',
   PRIMARY KEY ( `course_id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*add wujiafeng 2020/01/15 课程表 end*/

/*add wujiafeng 2020/01/15 课程表2 start*/
CREATE TABLE IF NOT EXISTS `course_2`(
   `course_id` BIGINT  comment '主键',
   `course_name` VARCHAR(2000) NOT NULL comment '课程名称',
   `user_id` BIGINT NOT NULL comment '用户id',
   `course_status` VARCHAR(1) NOT NULL comment '课程状态',
   PRIMARY KEY ( `course_id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*add wujiafeng 2020/01/15 课程表2 end*/

/*add wujiafeng 2020/01/17 用户表 start*/
CREATE TABLE IF NOT EXISTS `user`(
   `user_id` BIGINT  comment '主键',
   `user_name` VARCHAR(200) NOT NULL comment '用户名称',
   `user_status` VARCHAR(1) NOT NULL comment '用户状态',
   PRIMARY KEY ( `user_id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*add wujiafeng 2020/01/17 用户表 end*/

/*add wujiafeng 2020/01/17 数据字典表 start*/
CREATE TABLE IF NOT EXISTS `sttc_dict`(
   `dict_id` BIGINT  comment '主键',
   `dict_cnname` VARCHAR(2000) NOT NULL comment '数据字典中文名称',
   `dict_name` VARCHAR(2000) NOT NULL comment '数据字典名称',
   `dict_value` VARCHAR(2000) NOT NULL comment '数据字典值',
   `dict_status` VARCHAR(1) NOT NULL comment '数据字典状态',
   PRIMARY KEY ( `dict_id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*add wujiafeng 2020/01/17 数据字典表 end*/