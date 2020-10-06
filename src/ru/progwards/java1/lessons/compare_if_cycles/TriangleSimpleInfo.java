package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c) {
        int res_max = 0;
        if (a >= b)
            res_max = a;
        else
            res_max = b;
        if (c >= res_max)
            res_max = c;
    return res_max;
    }
    public static int minSide(int a, int b, int c) {
        int res_min = 0;
        if (a <= b)
            res_min = a;
        else
            res_min = b;
        if (c <= res_min)
            res_min = c;
    return res_min;
    }
    public static boolean isEquilateralTriangle(int a, int b, int c) {
        boolean res_ravn = false;
        if (a==b && b==c)
            res_ravn = true;
    return res_ravn;
    }
    public static void main(String[] args) {
        System.out.println(isEquilateralTriangle (18, 18, 18));
    }
}

