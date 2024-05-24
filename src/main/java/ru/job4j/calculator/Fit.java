package ru.job4j.calculator;

public class Fit {

    /**
     * Calculates the ideal weight based on height and a base value.
     *
     * @param height the height of the person
     * @param base the base value to be subtracted from height
     * @return the ideal weight
     */
    private static double calculateWeight(short height, int base) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than zero");
        }
        return (height - base) * 1.15;
    }

    /**
     * Calculates the ideal weight for a man based on his height.
     *
     * @param heightMan the height of the man
     * @return the ideal weight
     */
    public static double manWeight(short heightMan) {
        return calculateWeight(heightMan, 100);
    }

    /**
     * Calculates the ideal weight for a woman based on her height.
     *
     * @param heightWoman the height of the woman
     * @return the ideal weight
     */
    public static double womanWeight(short heightWoman) {
        return calculateWeight(heightWoman, 110);
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 170;
        double man = Fit.manWeight(heightMan);
        System.out.println("Man 187 is " + man);
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Woman 170 is " + woman);
    }
}