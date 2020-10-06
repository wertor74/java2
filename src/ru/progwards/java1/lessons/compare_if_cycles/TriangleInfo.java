package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c) {
        boolean res_tre = false;
        if (a + b > c)
            res_tre = true;
    return res_tre;
    }
    public static boolean isRightTriangle(int a, int b, int c) {
        boolean res_pif = false;
        if (a > b && a > c) {
            if (a * a == b * b + c * c)
                res_pif = true;
        } else if (b > a && b > c) {
            if (b * b == a * a + c * c)
                res_pif = true;
        } else {
            if (c * c == a * a + b * b)
                res_pif = true;
        }
    return res_pif;
    }
    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        boolean res_ravn = false;
        if (a + b > c && a == b || b == c || a == c)
                res_ravn = true;
    return res_ravn;
    }
    public static void main(String[] args) {
        System.out.println(isIsoscelesTriangle(5, 3,3));
    }
}
