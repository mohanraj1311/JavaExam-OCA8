package com.company.interview;

public class FindInteger {

    private static int findConsecutiveInteger(String input){
        int ans = 0;
        int i =0;
        int n = input.length();
        char[] listOfChars = input.toCharArray();

        while(i < n && !(listOfChars[i] >='0' && listOfChars[i]<='9')){
            i++;
        }
        int sign = 1;
        if(i!=0 && listOfChars[i-1]=='-')
            sign = -1;
        while(i < n && (listOfChars[i] >='0' && listOfChars[i]<='9')){
            ans = (ans*10) + (listOfChars[i] -'0');
            i++;
        }
        return ans * sign;
    }

    public static void main(String[] args) {
        String input = "abc-012e42";
        System.out.println(findConsecutiveInteger(input));

    }
}
