package com.jsy.scoremanager.mapper;

import com.jsy.scoremanager.domain.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CourseMapper {
    List<Course> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

    int addCourse(Course course);

    int editCourse(Course course);

    int deleteCourse(List<Integer> ids);

    int addStudentNum(Integer courseId);

    void deleteStudentNum(Integer courseId);

    List<Course> getCourseById(List<Integer> ids);

    int findByName(String name);
}
