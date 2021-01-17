package com.xiaowu.shardingjdbcdemo.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 吴家峰
 * @version 1.0 2021-01-16:14:31
 * @see
 * @since 1.0
 */
@Data
public class Course {
    //主键
    private Long courseId;
    //课程名称
    private String courseName;
    //用户id
    private Integer userId;
    //课程状态
    private String courseStatus;
}
