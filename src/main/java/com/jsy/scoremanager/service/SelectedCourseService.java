package com.jsy.scoremanager.service;


import com.jsy.scoremanager.domain.SelectedCourse;
import com.jsy.scoremanager.util.PageBean;

import java.util.List;
import java.util.Map;

public interface SelectedCourseService {
    PageBean<SelectedCourse> queryPage(Map<String, Object> paramMap);

    int addSelectedCourse(SelectedCourse selectedCourse);

    int deleteSelectedCourse(Integer id);

    boolean isStudentId(int id);

    List<SelectedCourse> getAllBySid(int studentid);
}
