package com.jsy.scoremanager.service;

import com.jsy.scoremanager.domain.Clazz;
import com.jsy.scoremanager.util.PageBean;

import java.util.List;
import java.util.Map;

public interface ClazzService {
    PageBean<Clazz> queryPage(Map<String, Object> paramMap);

    int addClazz(Clazz clazz);

    int deleteClazz(List<Integer> ids);

    int editClazz(Clazz clazz);

    Clazz findByName(String clazzName);

}
