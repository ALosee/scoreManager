package com.jsy.scoremanager.interceptors;

import com.jsy.scoremanager.domain.Admin;
import com.jsy.scoremanager.domain.Student;
import com.jsy.scoremanager.domain.Teacher;
import com.jsy.scoremanager.util.Const;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jiang
 * @date 2022/4/20 9:16
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Admin user = (Admin) request.getSession().getAttribute(Const.ADMIN);
        Teacher teacher = (Teacher) request.getSession().getAttribute(Const.TEACHER);
        Student student = (Student) request.getSession().getAttribute(Const.STUDENT);
        if(!StringUtils.isEmpty(user) || !StringUtils.isEmpty(teacher) || !StringUtils.isEmpty(student)){
            return true;
        }
        response.sendRedirect(request.getContextPath() + "/system/login");
        return false;

    }
}
