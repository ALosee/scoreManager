package com.jsy.scoremanager.mapper;

import com.jsy.scoremanager.domain.Clazz;
import com.jsy.scoremanager.domain.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jiang
 * @date 2022/5/28 14:09
 */
@SpringBootTest
public class CourseMapperTest {
    @Autowired
    private CourseMapper courseMapper;
    @Test
    void testQueryList(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","大学");
        map.put("teacherId","9");
        map.put("startIndex",0);
        map.put("pagesize",3);
        List<Course> courses = courseMapper.queryList(map);
        courses.forEach(System.out::println);
    }
    @Test
    void testQueryCount(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","大学");
        map.put("teacherId","9");
        Integer count = courseMapper.queryCount(map);
        System.out.println(count);
    }
    @Test
    void testAddCourse(){
        Course course = new Course();
        course.setName("数据结构");
        course.setTeacherId(9);
        course.setCourseDate("周一上午8点");
        course.setMaxNum(50);
        course.setInfo("数据机构");
        int i = courseMapper.addCourse(course);
        System.out.println(i);
    }
    @Test
    void testEditCourse(){
        Course course = new Course();
        course.setId(4);
        course.setName("数据结构");
        course.setTeacherId(9);
        course.setCourseDate("周一上午10点");
        course.setMaxNum(50);
        course.setInfo("数据机构");
        int i = courseMapper.editCourse(course);
        System.out.println(i);
    }
    @Test
    void testDeleteCourse(){
        List<Integer> list = new ArrayList<>();
        list.add(4);
        int i = courseMapper.deleteCourse(list);
        System.out.println(i);
    }
}
