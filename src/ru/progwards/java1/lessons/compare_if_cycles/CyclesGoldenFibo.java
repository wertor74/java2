package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {
        boolean res_cont = false;
        int count = 0;
        if (number == 0) {
            if (number == digit)
                res_cont = true;
        }
        for (int i = 1; 1 <= (number / i); i *= 10) { // узнаём разряд number, передаём его в count и проверяем первую цифру из number
            count = i;
            if (number / i == digit) {
                res_cont = true;
                break;
            }
        }
        for (; count > 1; count /= 10) { // проверяем остальные цифры number
            int res = number % count;
            if (res / (count / 10) == digit) {
                res_cont = true;
                break;
            }
        }
    return res_cont;
    }
    public static int fiboNumber(int n) {
        int fibo = 0;
        int fibo1 = 1;
        int fibo2 = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1)
                fibo = fibo1;
            else if (i == 2)
                fibo = fibo2;
            else {
                fibo = fibo1 + fibo2;
                fibo1 = fibo2;
                fibo2 = fibo;
            }
        }
    return fibo;
    }
    public static boolean isGoldenTriangle(int a, int b, int c) {
        boolean res_goldtri = false;
        double d1 = 1.61703;
        double d2 = 1.61903;
        double d3 = 0.0;
        if (a + b > c && a == b || b == c || a == c) {
            if (a == b) {
                d3 = (double)a / (double)c;
                if (d3 >= d1 && d3 <= d2)
                    res_goldtri = true;
            } else if (b == c) {
                d3 = (double)b / (double)a;
                if (d3 >= d1 && d3 <= d2)
                    res_goldtri = true;
            } else {
                d3 = (double)a / (double)b;
                if (d3 >= d1 && d3 <= d2)
                    res_goldtri = true;
            }
        }
        System.out.println(d3);
        return res_goldtri;
    }
    public static void main(String[] args) {
        int fibo = 0;
        int fibo1 = 1;
        int fibo2 = 1;
        for (int i = 1; i <= 15; i++) {
            if (i == 1) {
                fibo = fibo1;
                System.out.print(fibo + ", ");
            } else if (i == 2) {
                fibo = fibo2;
                System.out.print(fibo + ", ");
            } else {
                fibo = fibo1 + fibo2;
                if (i == 15)
                    System.out.println(fibo + ".");
                else System.out.print(fibo + ", ");
                fibo1 = fibo2;
                fibo2 = fibo;
            }
        }
        for (int a = 1; a < 100; a++) {
            for (int c = 1; c < 100; c++) {
                double d1 = 1.61703;
                double d2 = 1.61903;
                double d3 = (double)c / (double)a;
                if (d3 >= d1 && d3 <= d2) {
                    System.out.print("Длина основания = " + a + ", длина рёбер = ");
                    System.out.println(c);
                }
            }
        }
    }
}
