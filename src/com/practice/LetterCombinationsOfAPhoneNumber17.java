package com.practice;

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

/*Solution is accepted*/

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber17 {
    static ArrayList<String> res = new ArrayList<>();
    static String[] keypad = new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        System.out.println("res is -> "+letterCombinations(""));
    }

    private static List<String> letterCombinations(String digits) {
        String[] keypad = new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.length()==0) return res;
        solution(0,"",digits);
        return res;
    }
    public static void solution(int index, String str, String digits) {
        if(index == digits.length())  {
            res.add(str);
            return;
        }
        for(char c: keypad[Integer.parseInt(digits.substring(index,index+1))].toCharArray()) {
            solution(index+1,str+c,digits);
        }
    }
}