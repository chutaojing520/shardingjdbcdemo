package com.xiaowu.shardingjdbcdemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiaowu.shardingjdbcdemo.dao.CourseMapper;
import com.xiaowu.shardingjdbcdemo.dao.DataDictMapper;
import com.xiaowu.shardingjdbcdemo.dao.UserMapper;
import com.xiaowu.shardingjdbcdemo.dto.Course;
import com.xiaowu.shardingjdbcdemo.dto.DataDict;
import com.xiaowu.shardingjdbcdemo.dto.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingjdbcdemoApplicationTests {
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DataDictMapper dataDictMapper;
    
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
    
    /**
     * 垂直分库新增测试
     */
    public void insertUser() {
        String[] users = {"xiaowu", "xiaoming", "xiangwang", "xiaoli", "xiaohong"};
        for (int i = 0; i < users.length; i++) {
            User user = new User();
            user.setUserName(users[i]);
            user.setUserStatus("E");
            userMapper.insert(user);
        }
    }
    
    /**
     * 垂直分库查询测试
     */
    public void queryUserById() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        User paramUser = new User();
        paramUser.setUserId(557645247316754433L);
        queryWrapper.setEntity(paramUser);
        User user = userMapper.selectOne(queryWrapper);
        System.out.println(user);
    }
    
    /**
     * 公共表新增测试
     */
    public void insertDataDict() {
        String[] citys = {"合肥", "南京", "杭州", "上海", "福州"};
        for (int i = 0; i < citys.length; i++) {
            DataDict dataDict = new DataDict();
            dataDict.setDictCnname("城市名称");
            dataDict.setDictName(citys[i]);
            dataDict.setDictValue(i + "");
            dataDict.setDictStatus("E");
            dataDictMapper.insert(dataDict);
        }
    }
    
    /**
     * 公共表删除测试
     */
    @Test
    public void deleteDataDictById() {
        QueryWrapper<DataDict> queryWrapper = new QueryWrapper<>();
        DataDict paramDataDict = new DataDict();
        paramDataDict.setDictId(557667931048116225L);
        queryWrapper.setEntity(paramDataDict);
        dataDictMapper.delete(queryWrapper);
    }
    
    /**
     * 公共表查询测试
     */
    public void queryDataDictById() {
        QueryWrapper<DataDict> queryWrapper = new QueryWrapper<>();
        DataDict paramDataDict = new DataDict();
        paramDataDict.setDictId(557667931048116225L);
        queryWrapper.setEntity(paramDataDict);
        List<DataDict> dataDictList = dataDictMapper.selectList(queryWrapper);
        System.out.println(dataDictList);
    }
    
}
