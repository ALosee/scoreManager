package com.jsy.scoremanager.mapper;

import com.jsy.scoremanager.domain.Leave;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface LeaveMapper {
    List<Leave> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

    int addLeave(Leave leave);

    int editLeave(Leave leave);

    int checkLeave(Leave leave);

    int deleteLeave(Integer id);
}
