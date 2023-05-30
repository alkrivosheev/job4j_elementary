package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = i * i;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] ints = calculate(4);
        for (int index = 0; index < ints.length; index++) {
            System.out.println(ints[index]);
        }
    }
}
