package com.jsy.scoremanager.mapper;

import com.jsy.scoremanager.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TeacherMapper {
    List<Teacher> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

    int deleteTeacher(List<Integer> ids);

    int addTeacher(Teacher teacher);

    Teacher findById(Integer tid);

    int editTeacher(Teacher teacher);

    Teacher findByTeacher(Teacher teacher);

    int editPswdByTeacher(Teacher teacher);
}
