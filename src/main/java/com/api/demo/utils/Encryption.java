package com.api.demo.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class Encryption {
    public static String encryPwd(String pwd){
        return DigestUtils.md5Hex(pwd);
    }
}
