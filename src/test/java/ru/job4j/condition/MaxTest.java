package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To3Then5() {
        int left = 5;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax8To8Then8() {
        int left = 8;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2To3Then3() {
        int left = 1;
        int right = 2;
        int first = 3;
        int result = Max.max(left, right, first);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To3To8Then8() {
        int left = 5;
        int right = 3;
        int first = 8;
        int result = Max.max(left, right, first);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax8To8To8Then8() {
        int left = 8;
        int right = 8;
        int first = 8;
        int result = Max.max(left, right, first);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2To3To6Then6() {
        int left = 1;
        int right = 2;
        int first = 3;
        int second = 6;
        int result = Max.max(left, right, first, second);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To3To8To2Then8() {
        int left = 5;
        int right = 3;
        int first = 8;
        int second = 2;
        int result = Max.max(left, right, first, second);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax8To8To8To8Then8() {
        int left = 8;
        int right = 8;
        int first = 8;
        int second = 8;
        int result = Max.max(left, right, first, second);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }
}