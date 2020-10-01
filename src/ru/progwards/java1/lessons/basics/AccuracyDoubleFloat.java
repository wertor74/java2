package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static final float PI = 3.14F;
    private static double radius = 6371.2;
    public static double volumeBallDouble(double radius) {
        double v_dbl = (4 / 3 * Astronomy.PI) * (radius * radius * radius);
        return v_dbl;
    }
    public static float volumeBallFloat(float radius) {
        float v_flt = (4 / 3 * PI) * (radius * radius * radius);
        return v_flt;
    }
    public static double calculateAccuracy(double radius) {
        double v_calc = volumeBallDouble(radius) - volumeBallFloat((float) radius);
        return v_calc;
    }
    public static void main(String[] args) {
        System.out.println("Объём Земли (double) = " + volumeBallDouble(radius) + " куб.км.");
        System.out.println("Объём Земли (float) = " + volumeBallFloat((float) radius) + " куб.км.");
        System.out.println("Разница между объёмом Земли (double) и объёмом Земли (float) = " + calculateAccuracy(radius) + " куб.км.");
    }
}
