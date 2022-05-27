package com.jsy.scoremanager.service;

import com.jsy.scoremanager.domain.Teacher;
import com.jsy.scoremanager.util.PageBean;

import java.util.List;
import java.util.Map;

public interface TeacherService {
    PageBean<Teacher> queryPage(Map<String, Object> paramMap);

    int deleteTeacher(List<Integer> ids);

    int addTeacher(Teacher teacher);

    Teacher findById(Integer tid);

    int editTeacher(Teacher teacher);

    Teacher findByTeacher(Teacher teacher);

    int editPswdByTeacher(Teacher teacher);
}
