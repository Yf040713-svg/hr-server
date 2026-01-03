package com.yf.hr.hrserver.util;

public class TimeUtil {

    public String now() {
        return java.time.LocalDateTime.now().toString();
    }
}