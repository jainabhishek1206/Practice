package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public static void main(String[] args) {
        System.out.println("res is -> "+numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> items =  new HashSet<>();
        for(String s : emails) {
            //seperate the strings
            String arr[] = s.split("@");
            //remove the . from the first set of string
            arr[0] = arr[0].replace(".","");
            //remove the characters atter at from the first string
            if(arr[0].contains("+")) {
                String a[] = arr[0].split("\\+");
                arr[0]=a[0];
            }
            items.add(arr[0]+arr[1]);
            System.out.println("res "+arr[0]+"@"+arr[1]);

        }
        return items.size();
    }
}
