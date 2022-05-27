package com.jsy.scoremanager.service;

import com.jsy.scoremanager.domain.Attendance;
import com.jsy.scoremanager.util.PageBean;

import java.util.Map;

public interface AttendanceService {
    PageBean<Attendance> queryPage(Map<String, Object> paramMap);

    boolean isAttendance(Attendance attendance);

    int addAtendance(Attendance attendance);

    int deleteAttendance(Integer id);
}
