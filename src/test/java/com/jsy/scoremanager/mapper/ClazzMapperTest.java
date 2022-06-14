package com.jsy.scoremanager.mapper;

import com.jsy.scoremanager.domain.Clazz;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jiang
 * @date 2022/5/28 10:26
 */
@SpringBootTest
public class ClazzMapperTest {
    @Autowired
    private ClazzMapper clazzMapper;

    @Test
    void testQueryList(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","软件");
        map.put("startIndex",0);
        map.put("pagesize",3);
        List<Clazz> clazzes = clazzMapper.queryList(map);
        clazzes.forEach(System.out::println);
    }
    @Test
    void QueryCount(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","软件");
        Integer count = clazzMapper.queryCount(map);
        System.out.println(count);
    }
    @Test
    void AddClazz(){
        Clazz clazz = new Clazz();
        clazz.setInfo("软件2班info");
        clazz.setName("软件2班");
        int i = clazzMapper.addClazz(clazz);
        System.out.println(i);
    }
    @Test
    void testEditClazz(){
        Clazz clazz = new Clazz();
        clazz.setId(7);
        clazz.setInfo("软件2班info...up");
        clazz.setName("软件2班");
        int i = clazzMapper.editClazz(clazz);
        System.out.println(i);
    }
    @Test
    void deleteClazz(){
        List<Integer> list = new ArrayList<>();
        list.add(6);
        int i = clazzMapper.deleteClazz(list);
        System.out.println(i);
    }
    @Test
    void testFindByName(){
        Clazz clazz = clazzMapper.findByName("软件一班");
        System.out.println(clazz);
    }
}
