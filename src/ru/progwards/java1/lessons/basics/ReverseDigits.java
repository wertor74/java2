package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        int int3 = number / 100;
        int int4 = number % 100;
        int int2 = int4 / 10;
        int int1 = int4 % 10;
        int result = int1 * 100 + int2 * 10 + int3;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(reverseDigits(123));
    }
}