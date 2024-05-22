package com.java.tellTheOutput.stringDecompression;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PSVMClass {

    public static void main(String[] args) {
        String str = "w4a3d1e1x6";
        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                int j = (c - '0');
                while (j != 0) {
                    strBuilder.append(str.charAt(i - 1));
                    j--;
                }
            }
        }
        System.out.println("Output String: " + strBuilder);
    }
}
