/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
        Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
        For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
        Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

        I can be placed before V (5) and X (10) to make 4 and 9.
        X can be placed before L (50) and C (100) to make 40 and 90.
        C can be placed before D (500) and M (1000) to make 400 and 900.
        Given an integer, convert it to a roman numeral.

        Example 1:
        Input: num = 3
        Output: "III"
        Explanation: 3 is represented as 3 ones.

        Example 2:
        Input: num = 58
        Output: "LVIII"
        Explanation: L = 50, V = 5, III = 3.

        Example 3:
        Input: num = 1994
        Output: "MCMXCIV"
        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

        Constraints:
        1 <= num <= 3999*/
package com.leetcode;


import java.util.HashMap;

//working Solution -> approach 1 ,
//In progress -> approach 2
public class IntegerToRoman12 {
    private String res="";
    private int number = 0;
//    Approach 2 ->
    public String intToRoman(int num) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1000,"M");
        map.put(900,"CM");
        map.put(500,"D");
        map.put(400,"CD");
        map.put(100,"C");
        map.put(90,"XC");
        map.put(50,"L");
        map.put(40,"XL");
        map.put(10,"X");
        map.put(9,"IX");
        map.put(5,"V");
        map.put(4,"IV");
        map.put(1,"I");
        return res;
    }


    //Approach 1 ->
    /*public String intToRoman(int num) {
        number = num;
        while(number >= 1)
            checkNumber(number);
        return res;
    }*/
    private void checkNumber(int num) {
        if(number>=1000) {
            res = res + 'M';
            number = number - 1000;
        }
        else if(number>=500) {
            if(number>=900) {
                res = res + "CM";
                number = number - 900;
            } else {
                res = res + 'D';
                number = number - 500;
            }
        }
        else if(number>=100) {
            if(number>=400) {
                res = res + "CD";
                number = number - 400;
            } else {
                res = res + 'C';
                number = number - 100;
            }
        }
        else if(number>=50) {
            if(number>=90) {
                res = res + "XC";
                number = number - 90;
            } else {
                res = res + 'L';
                number = number - 50;
            }
        }
        else if(number>=10) {
            if(number>=40) {
                res = res + "XL";
                number = number - 40;
            } else {
                res = res + 'X';
                number = number - 10;
            }
        }
        else if(number>=5) {
            if(number>=9) {
                res = res + "IX";
                number = number - 90;
            } else {
                res = res + 'V';
                number = number - 5;
            }
        }
        else if(number>=1) {
            if(number>=4) {
                res = res + "IV";
                number = number - 4;
            } else {
                res = res + 'I';
                number = number - 1;
            }
        }
    }
}
