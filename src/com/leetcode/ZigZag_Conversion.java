package com.leetcode;

import java.util.ArrayList;

public class ZigZag_Conversion {
    public static void main(String[] args) {
        System.out.println("ans is "+convert("abc",1));
    }
    private static String convert(String s, int numRows) {
        //initialize the array
        ArrayList<ArrayList> arrayLists =  new ArrayList<>();
        for(int i=0;i<numRows;i++) {
            ArrayList<Character> objName = new ArrayList<>();
            arrayLists.add(objName);
        }

        if(s.length()<3 || numRows ==1) {
            return s;
        }
//        wriiting the loginc
        int count =1;
        boolean forward = true;
        for(int i=0;i<s.length();i++) {
            if(forward) {
                arrayLists.get(count-1).add(s.charAt(i));
                count++;
                if(count>numRows) {
                    count = count-2;
                    forward = false;
                    }
            } else {
                arrayLists.get(count-1).add(s.charAt(i));
                count --;
                if(count <= 0) {
                    forward = true;
                    count = count+2;
                }
            }
        }

        //printing the values
        String res = "";
        for(int i=0;i<numRows;i++) {
            StringBuilder builder = new StringBuilder(arrayLists.get(i).size());
            for(Object ch: arrayLists.get(i))
            {
                builder.append(ch);
            }
            res = res+ builder.toString();
        }
        return res;
    }
}