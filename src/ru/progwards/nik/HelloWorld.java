package ru.progwards.nik;

public class HelloWorld {
    static double fractional(double num) {
        Double double1 = num;
        Integer int1 = double1.intValue();
        double result1 = double1 - int1;
        return result1;
    }

    public static void main (String[] args) {
        System.out.println(fractional (1.53));
    }

}
