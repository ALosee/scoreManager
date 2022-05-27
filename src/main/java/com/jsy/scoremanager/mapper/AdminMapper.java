package com.jsy.scoremanager.mapper;

import com.jsy.scoremanager.domain.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AdminMapper {

    Admin findByAdmin(Admin admin);


    int editPswdByAdmin(Admin admin);
}
