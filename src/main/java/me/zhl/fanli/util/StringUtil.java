package me.zhl.fanli.util;

import java.util.UUID;

public class StringUtil {
    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }


    public static String generateUUID32(){
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }
}
