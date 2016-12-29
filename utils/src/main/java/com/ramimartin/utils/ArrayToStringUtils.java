package com.ramimartin.utils;


public final class ArrayToStringUtils {


    private ArrayToStringUtils() {

    }

    public static String toString(Integer[] array, String beginWith, String endWith, String separator) {
        StringBuilder sb = new StringBuilder(beginWith);
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i != array.length - 1) {
                sb.append(separator);
            }

        }
        sb.append(endWith);
        return sb.toString();
    }
}
