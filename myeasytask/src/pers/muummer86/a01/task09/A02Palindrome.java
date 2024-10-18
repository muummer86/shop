package pers.muummer86.a01.task09;

public class A02Palindrome {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int tempNum = x;
        int sum = 0;
        while (tempNum > 0) {
            sum = sum * 10 + tempNum % 10;
            tempNum = tempNum / 10;
        }


        return x == sum;
    }
}
