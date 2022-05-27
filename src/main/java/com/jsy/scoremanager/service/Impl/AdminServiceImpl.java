package com.jsy.scoremanager.service.Impl;

import com.jsy.scoremanager.domain.Admin;
import com.jsy.scoremanager.mapper.AdminMapper;
import com.jsy.scoremanager.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin findByAdmin(Admin admin) {
        return adminMapper.findByAdmin(admin);
    }

    @Override
    public int editPswdByAdmin(Admin admin) {
        return adminMapper.editPswdByAdmin(admin);
    }

}
