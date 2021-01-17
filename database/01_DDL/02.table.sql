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