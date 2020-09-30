package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number){
        int int3 = number / 100;
        int int4 = number % 100;
        int int2 = int4 / 10;
        int int1 = int4 % 10;
        String str_result = (String.valueOf (int1) + String.valueOf(int2) + String.valueOf(int3));
        int result = Integer.parseInt (str_result);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(reverseDigits(123));
        }
}
