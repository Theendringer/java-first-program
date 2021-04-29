package com.h2;

public class Utilities {

    public static long getLongValue(String in) throws IllegalAccessException {
        Long out = Long.MIN_VALUE;
        try {
            out = Long.parseLong(in);
        } catch (NumberFormatException e) {
            throw new IllegalAccessException(in + " cannot be converted into a 'long' value. Exiting program.");
        }
        return out;
    }

    public static int getInValue(String in) throws IllegalAccessException {
        int out = Integer.MIN_VALUE;
        try {
            out = Integer.parseInt(in);
        } catch (NumberFormatException e) {
            throw new IllegalAccessException(in + " cannot be converted 'int' value. Exiting program.");
        }
        return out;
    }

    public static float getFloatValue(String in) throws IllegalAccessException {
        float out = Float.MIN_VALUE;
        try {
            out = Float.parseFloat(in);
        } catch (NumberFormatException e) {
            throw new IllegalAccessException(in + " cannot be converted 'int' value. Exiting program.");
        }
        return out;
    }
}
