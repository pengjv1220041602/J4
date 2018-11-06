package com.u4.utils;

import java.util.UUID;

/**
 * @Author ZhPJ
 * @Date 2018/11/6 000618:02
 * @Version 1.0
 * @Description:
 */
public class UUIDUtils {

    public static String getUUID () {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
