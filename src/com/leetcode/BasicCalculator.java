package com.leetcode;

/*Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.
        Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().

        Example 1:
        Input: s = "1 + 1"
        Output: 2

        Example 2:
        Input: s = " 2-1 + 2 "
        Output: 3

        Example 3:
        Input: s = "(1+(4+5+2)-3)+(6+8)"
        Output: 23*/

public class BasicCalculator {

    public static void main(String[] args) {
//        System.out.println("result is "+calculate("(1+(4+5+2)-3)+(6+8)"));
        System.out.println("result is "+calculate("2-1+2"));
        System.out.println("result is "+calculate("1+1"));
    }

    private static int calculate(String s) {
        int  res = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == ' ') {
                continue;
            }

            else if(s.charAt(i) == '+' || s.charAt(i) == '-') {
                //get the value of operator here
                boolean plusOperator = s.charAt(i) == '+' ? true:false;
                int num = 0;
                i = i+1;
                do {
                    if(num != 0) num = num*10;
                    num = num + Integer.parseInt(String.valueOf(s.charAt(i)));
                    if(i+1<s.length()) {
                        i = i+1;
                    } else {
                        if(plusOperator) res =  res + s.charAt(i);
                        else res = res - num;
                        break;
                    }
                }while(!(s.charAt(i)==')' || s.charAt(i)=='(' || s.charAt(i)!=s.charAt(' ')));
                i=i-1;
                if(plusOperator) res = res + num;
                else res = res - num;
            }

            else {
                int num = 0;
                do {
                    if(num != 0) num = num * 10;
                    num = num + Integer.parseInt(String.valueOf(s.charAt(i)));
                    i = i+1;
                    boolean value = s.charAt(i)!=')' && s.charAt(i)!='(' && s.charAt(i)!='+' && s.charAt(i)!='-' && s.charAt(i)!=s.charAt(' ');
                    System.out.println("variable "+value);
                }while(!(s.charAt(i)==')' || s.charAt(i)=='(' || s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)!=s.charAt(' ')));
                if(res == 0) res = num;
                i = i-1;
            }
            System.out.println("res is" +res);
        }
        return res;
    }
}