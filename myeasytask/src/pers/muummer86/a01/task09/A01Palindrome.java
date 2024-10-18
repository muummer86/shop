package pers.muummer86.a01.task09;

public class A01Palindrome {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(int x) {
        return new StringBuilder().append(x).reverse().toString().equals(String.valueOf(x));
    }
}
