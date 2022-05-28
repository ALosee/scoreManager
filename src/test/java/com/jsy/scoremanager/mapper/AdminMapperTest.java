package com.jsy.scoremanager.mapper;

import com.jsy.scoremanager.domain.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author jiang
 * @date 2022/5/28 10:18
 */
@SpringBootTest
public class AdminMapperTest {
    @Autowired
    private AdminMapper adminMapper;

    @Test
    void testFindByAdmin() {
        Admin admin = new Admin();
        admin.setId(1L);
        admin.setUsername("admin");
        admin.setPassword("123456");
        Admin byAdmin = adminMapper.findByAdmin(admin);
        if (byAdmin != null)
            System.out.println(byAdmin);
        else
            System.out.println("未找到");
    }
    @Test
    void testEditPswdByAdmin(){
        Admin admin = new Admin();
        admin.setId(1L);
        admin.setUsername("admin");
        admin.setPassword("1234567");
        Admin byAdmin = adminMapper.findByAdmin(admin);
        adminMapper.editPswdByAdmin(admin);
    }
}
