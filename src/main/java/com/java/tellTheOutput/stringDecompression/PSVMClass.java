package com.java.tellTheOutput.stringDecompression;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PSVMClass {

    public static void main(String[] args) {

        String str = "w4a3d1e1x6";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                System.out.println((c - '0') + "-" + str.charAt(i - 1));
                map.put(str.charAt(i - 1), (c - '0'));
            }
        }
        System.out.println("LinkedHashMap: " + map);

        StringBuilder strBuilder = new StringBuilder();
        for (Map.Entry m : map.entrySet()) {
            Integer key = (Integer) m.getValue();
            while (key != 0) {
                strBuilder.append(m.getKey());
                key--;
            }
        }
        System.out.println("Output String: " + strBuilder);
    }

}
