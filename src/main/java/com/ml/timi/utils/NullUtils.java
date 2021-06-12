package com.ml.timi.utils;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Description:  空值判断工具
 * Copyright (C), 2021 2021/6/12 1:31
 * Author:        Lin
 * History:       <author>          <time>          <version>          <desc>
 */
public class NullUtils {
    /**
     * 对象 = null
     * @param obj
     * @return ture
     */
    public static boolean isNull(Object obj) {
        return obj == null;
    }

    /**
     * 对象 != null
     * @param obj
     * @return false
     */
    public static boolean isNotNull(Object obj) {
        return !isNull(obj);
    }

    /**
     * 对象 = null  、大小 = 0
     * @param obj
     * @return ture
     */
    public static boolean isEmpty(Object obj) {
        if (obj == null) return true;
        else if (obj instanceof CharSequence) return ((CharSequence) obj).length() == 0;
        else if (obj instanceof Collection) return ((Collection) obj).isEmpty();
        else if (obj instanceof Map) return ((Map) obj).isEmpty();
        else if (obj.getClass().isArray()) return Array.getLength(obj) == 0;

        return false;
    }

    public static boolean isNotEmpty(Object obj) {
        return !isEmpty(obj);
    }

    public static String isEmpty(String string) {
        return NullUtils.isNotEmpty(string) == true ? string.trim() : "";
    }



}
