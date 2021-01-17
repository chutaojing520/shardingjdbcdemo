package com.xiaowu.shardingjdbcdemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiaowu.shardingjdbcdemo.dao.CourseMapper;
import com.xiaowu.shardingjdbcdemo.dto.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingjdbcdemoApplicationTests {
    @Autowired
    private CourseMapper courseMapper;
    
    /**
     * 水平分表新增数据测试
     */
    public void insertCourse() {
        String[] books = {"java", "python", "go", "c", "c++", "groovy", "scala", "es", "html"};
        for (int i = 0; i < books.length; i++) {
            Course course = new Course();
            course.setCourseName(books[i]);
            course.setUserId(i);
            course.setCourseStatus("E");
            courseMapper.insert(course);
        }
    }
    
    /**
     * 水平分表查询测试
     */
    public void queryCourseById() {
        QueryWrapper<Course> queryWrapper = new QueryWrapper<>();
        Course paramCourse = new Course();
        paramCourse.setCourseId(557523697011785728L);
        queryWrapper.setEntity(paramCourse);
        Course course = courseMapper.selectOne(queryWrapper);
        System.out.println(course);
    }
    /**
     * 水平分表分库新增数据测试
     */
    public void insertCourseForDatabase() {
        String[] books = {"java", "python", "go", "c", "c++", "groovy", "scala", "es", "html"};
        for (int i = 0; i < books.length; i++) {
            Course course = new Course();
            course.setCourseName(books[i]);
            course.setUserId(i);
            course.setCourseStatus("E");
            courseMapper.insert(course);
        }
    }
    
    /**
     * 水平分表分库查询测试
     */
    @Test
    public void queryCourseByIdForDatabase() {
        QueryWrapper<Course> queryWrapper = new QueryWrapper<>();
        Course paramCourse = new Course();
        paramCourse.setCourseId(557602035675955200L);
        //没有userid条件则到所有数据库里查,有了则会根据规则计算去那个数据库查
        paramCourse.setUserId(3);
        queryWrapper.setEntity(paramCourse);
        Course course = courseMapper.selectOne(queryWrapper);
        System.out.println(course);
    }
    
}
