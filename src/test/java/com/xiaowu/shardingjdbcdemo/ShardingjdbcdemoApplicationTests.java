package com.xiaowu.shardingjdbcdemo;

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
    
    @Test
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
    
}
