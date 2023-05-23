package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Святослав Зимин";
        names[1] = "Ярослав Уиллис";
        names[2] = "Федор Левин";
        names[3] = "Антон Хлынов";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
