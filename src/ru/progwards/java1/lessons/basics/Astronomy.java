package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static final double PI = 3.14;

    public static Double sphereSquare(Double r) {
        double s = 4 * PI * r * r;
        return s;
    }
    public static Double earthSquare() {
        double s_earth = sphereSquare(6371.2);
        return s_earth;
    }
    public static Double mercurySquare() {
        double s_mercury = sphereSquare(2439.7);
        return s_mercury;
    }
    public static Double jupiterSquare() {
        double s_jupiter = sphereSquare(71492.0);
        return s_jupiter;
    }
    public static Double earthVsMercury() {
        double s_earthVsMercury = earthSquare() / mercurySquare();
        return s_earthVsMercury;
    }
    public static Double earthVsJupiter() {
        double s_earthVsJupiter = earthSquare() / jupiterSquare();
        return s_earthVsJupiter;
    }
    public static void main(String[] args) {
        System.out.println("Площадь поверхности Земли = " + earthSquare() + " кв.км.");
        System.out.println("Площадь поверхности Юпитера = " + mercurySquare() + " кв.км.");
        System.out.println("Площадь поверхности Меркурия = " + jupiterSquare() + " кв.км.");
        System.out.println("Отношение площади поверхности Земли к площади поверхности Меркурия = " + earthVsMercury() + " кв.км.");
        System.out.println("Отношение площади поверхности Земли к площади поверхности Юпитера = " + earthVsJupiter() + " кв.км.");
    }
}
