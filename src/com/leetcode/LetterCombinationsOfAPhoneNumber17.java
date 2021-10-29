package com.leetcode;

/*Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
        A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

        Example 1:
        Input: digits = "23"
        Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

        Example 2:
        Input: digits = ""
        Output: []

        Example 3:
        Input: digits = "2"
        Output: ["a","b","c"]


        Constraints:
            0 <= digits.length <= 4
            digits[i] is a digit in the range ['2', '9'].*/

/*Solution is accepted but its a very bad solution
Feedback 1 : Insted of getListForDigits(), you could have used string array[] = {"0","1","abc","def","ghi" ..}  like this
Feedback 2 : you should have used DFS or recursive approach*/

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber17 {
    public static void main(String[] args) {
        System.out.println("res is -> "+letterCombinations("234"));
    }

    private static List<String> letterCombinations(String digits) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> clone = new ArrayList<>();
        if(digits.length()==0) return list;

        String res = "";
        for(int i=0;i<digits.length();i++) {
            //read the digit and get the list
            res = getListForDigit(digits.substring(i,i+1));
            if(list == null || list.size()<2) {
                for(int k=0;k<res.length();k++) {
                    String ss = "";
                    ss=ss+res.charAt(k);
                    list.add(ss);
                }
            } else {
                clone.clear();
                for (int j = 0; j < list.size(); j++) {
                    for (int k = 0; k < res.length(); k++) {
                        clone.add(list.get(j)+res.charAt(k));
                    }
                }
                list.clear();
                for(int l=0;l<clone.size();l++) list.add(clone.get(l));
            }
        }

        //append the arraylist to the result
        return list;
    }

    private static String getListForDigit(String c) {
        int digit = Integer.parseInt(c);
        String res = new String();

        //logic for getting the set of characters
        int temp = 3 * (digit - 2);
        if(digit>7) temp = temp+1;
        res += (char) ('a' + (char) temp);
        res += (char) ('a' + (char) temp+1);
        res += (char) ('a' + (char) temp+2);
        if(digit == 7 || digit ==9){
            res += (char) ('a' + (char) temp+3);
        }
        return res;
    }
}