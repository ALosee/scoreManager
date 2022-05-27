package com.jsy.scoremanager.mapper;

import com.jsy.scoremanager.domain.Attendance;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AttendanceMapper {
    List<Attendance> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

    int addAtendance(Attendance attendance);

    Attendance isAttendance(Attendance attendance);

    int deleteAttendance(Integer id);
}
