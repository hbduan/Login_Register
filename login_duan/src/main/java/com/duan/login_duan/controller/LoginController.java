package com.duan.login_duan.controller;

import com.duan.login_duan.dao.LoginMapper;
import com.duan.login_duan.domain.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @创建人 Missbear
 * @创建时间 2018.9.28
 * @描述
 */
@Controller
@RequestMapping("")
public class LoginController {

    @Autowired
    private LoginMapper loginMapper;

    @RequestMapping(value="/login",method= RequestMethod.GET)
    public String login(){
        return "/login";
    }

    @RequestMapping(value="/login_success",method= RequestMethod.GET)
    public String login_success(){
        return "/login_success";
    }

    @ResponseBody
    @RequestMapping(value="/login_check",method= RequestMethod.POST)
    public String login_check(HttpServletRequest request)throws ServletException,IOException {
        String res = "";
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        List<UserBean> list=new ArrayList<UserBean>();
        list=loginMapper.LoginDao(userName,password);
        if(list.size()==0)
        {
            res = "[{msg:'fail',failInfo:'错误，请重试 '}]";
        }
        else
        {
            String username=list.get(0).getUserName();
            res = "[{msg:'success',username:'" + username + "'}]";
        }
        return res;
    }
}
