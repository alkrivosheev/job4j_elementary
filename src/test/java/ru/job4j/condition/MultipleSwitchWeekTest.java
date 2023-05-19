package ru.job4j.condition;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMonThen1() {
        String day = "Monday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMonRUThen1() {
        String day = "Понедельник";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFrRUThen1() {
        String day = "Пятница";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNonThenMines1() {
        String day = "День";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}