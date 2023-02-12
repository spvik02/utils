package ru.clevertec;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str){
        return NumberUtils.isParsable(str) && NumberUtils.toDouble(str) > NumberUtils.DOUBLE_ZERO;
    }
}
