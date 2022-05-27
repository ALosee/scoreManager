package com.jsy.scoremanager.mapper;


import com.jsy.scoremanager.domain.SelectedCourse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SelectedCourseMapper {
    List<SelectedCourse> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

    int addSelectedCourse(SelectedCourse selectedCourse);

    SelectedCourse findBySelectedCourse(SelectedCourse selectedCourse);

    SelectedCourse findById(Integer id);

    int deleteSelectedCourse(Integer id);

    List<SelectedCourse> isStudentId(int id);

    List<SelectedCourse> getAllBySid(int studentid);
}
