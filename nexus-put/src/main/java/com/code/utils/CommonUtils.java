package com.code.utils;

import org.springframework.stereotype.Component;

@Component
public class CommonUtils {
    public static int allAdd(int ...data){
        int rtnData = 0;
        for(int i : data){
            rtnData += i;
        }
        System.out.println("rtnData = " + rtnData);
        return rtnData;
    }
}
