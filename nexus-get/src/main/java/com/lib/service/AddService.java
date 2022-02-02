package com.lib.service;

import com.code.utils.CommonUtils;
import org.springframework.stereotype.Service;

@Service
public class AddService {
    public int add(int a, int b){
        int result = CommonUtils.allAdd(a,b);
        return result;
    }
}
