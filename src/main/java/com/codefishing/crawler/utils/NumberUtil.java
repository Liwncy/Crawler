package com.codefishing.crawler.utils;


public class NumberUtil {

    /**
     * 补零
     */
    public static String zeroFormat(String i, String j) {
        int iLength = i.length();
        int jLength = j.length();
        if (iLength < jLength) {
            return zeroFormat("0" + i, j);
        }
        return i;
    }
}
