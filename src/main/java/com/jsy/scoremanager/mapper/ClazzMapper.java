package com.jsy.scoremanager.mapper;

import com.jsy.scoremanager.domain.Clazz;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ClazzMapper {
    List<Clazz> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

    int addClazz(Clazz clazz);

    int deleteClazz(List<Integer> ids);

    int editClazz(Clazz clazz);

    Clazz findByName(String clazzName);
}
