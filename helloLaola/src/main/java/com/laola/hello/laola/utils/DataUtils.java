package com.laola.hello.laola.utils;

public class DataUtils {
    public static String carryDigit(String strDig,Float Multiple){
        if (null == strDig){
            return "";
        }
        float v = Float.parseFloat(strDig);
        v = v/Multiple;

        return String.valueOf(v);
    }

    public static void main(String[] args) {
        String s = carryDigit("10", 100F);
        System.out.println(s);
    }
}
