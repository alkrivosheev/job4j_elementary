package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] digits = new int[] {5, 3, 2, 1, 4};
        int temp = digits[0];
        digits[0] = digits[3];
        digits[3] = temp;
        temp = digits[1];
        digits[1] = digits[2];
        digits[2] = temp;
        temp = digits[3];
        digits[3] = digits[4];
        digits[4] = temp;

        for (int index = 0; index < digits.length; index++) {
            System.out.println(digits[index]);
        }
    }
}
