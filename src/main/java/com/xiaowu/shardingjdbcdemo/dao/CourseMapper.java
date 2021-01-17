package com.xiaowu.shardingjdbcdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaowu.shardingjdbcdemo.dto.Course;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 吴家峰
 * @version 1.0 2021-01-16:14:31
 * @see
 * @since 1.0
 */
@Repository
public interface CourseMapper extends BaseMapper<Course> {
}
