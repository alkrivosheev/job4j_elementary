package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            if (i == 0 || i == 1) {
                result = 1;
            } else {
                result = result * i;
            }
        }
        return result;
    }
}
