package com.api.demo.controller;

import com.api.demo.entity.ElecUser;
import com.api.demo.service.ElemUserService;
import com.api.demo.utils.Encryption;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private ElemUserService elemUserService;
    @Autowired
    public LoginController(ElemUserService elemUserService) {
        this.elemUserService = elemUserService;
    }

    @RequestMapping("/login")
    public String login(String name,String password){
        if(StringUtils.isBlank(name)||StringUtils.isBlank(password)){
            return "";
        }
       String nameTrim= name.trim();
       String passwordTrim= password.trim();

        if(nameTrim.length()>50||nameTrim.length()==0){
                return "/WEB-INF/menu/index.jsp";
        }
        if(passwordTrim.length()>50||passwordTrim.length()==0){
            return "/WEB-INF/menu/index.jsp";
        }
        String pwd= Encryption.encryPwd(passwordTrim);
        ElecUser elecUser = elemUserService.queryUser(nameTrim, pwd);

        System.out.println("hahahah");
        System.out.println("hahahah");
        return elecUser==null?"/WEB-INF/menu/index.jsp":"/WEB-INF/menu/home.jsp";
    }
}
