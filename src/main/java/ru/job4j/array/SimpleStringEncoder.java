package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        result += input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else if (symbol != input.charAt(i) && counter > 1) {
                result += counter + Character.toString(input.charAt(i));
                counter = 1;
            } else if (symbol != input.charAt(i) && counter == 1) {
                result += input.charAt(i);
            }
            symbol = input.charAt(i);
        }
        if (counter != 1) {
            result += counter;
        }
        return result;
    }
}
