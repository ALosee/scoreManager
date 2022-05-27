package com.jsy.scoremanager.service.Impl;

import com.jsy.scoremanager.domain.Attendance;
import com.jsy.scoremanager.mapper.AttendanceMapper;
import com.jsy.scoremanager.service.AttendanceService;
import com.jsy.scoremanager.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceMapper attendanceMapper;

    @Override
    public PageBean<Attendance> queryPage(Map<String, Object> paramMap) {
        PageBean<Attendance> pageBean = new PageBean<>((Integer) paramMap.get("pageno"),(Integer) paramMap.get("pagesize"));

        Integer startIndex = pageBean.getStartIndex();
        paramMap.put("startIndex",startIndex);
        List<Attendance> datas = attendanceMapper.queryList(paramMap);
        pageBean.setDatas(datas);

        Integer totalsize = attendanceMapper.queryCount(paramMap);
        pageBean.setTotalsize(totalsize);
        return pageBean;
    }

    @Override
    public boolean isAttendance(Attendance attendance) {
        Attendance at = attendanceMapper.isAttendance(attendance);
        if(at != null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int addAtendance(Attendance attendance) {
        return attendanceMapper.addAtendance(attendance);
    }

    @Override
    public int deleteAttendance(Integer id) {
        return attendanceMapper.deleteAttendance(id);
    }
}
