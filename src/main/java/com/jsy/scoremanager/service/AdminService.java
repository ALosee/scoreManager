package com.jsy.scoremanager.service;


import com.jsy.scoremanager.domain.Admin;

public interface AdminService {

    Admin findByAdmin(Admin admin);


    int editPswdByAdmin(Admin admin);
}
