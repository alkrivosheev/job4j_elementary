package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static int max(int left, int right, int first) {
        int result = max(left, right);
        result = result >= first ? result : first;
        return result;
    }

    public static int max(int left, int right, int first, int second) {
        int result = max(left, right, first);
        result = result >= second ? result : second;
        return result;
    }
}
