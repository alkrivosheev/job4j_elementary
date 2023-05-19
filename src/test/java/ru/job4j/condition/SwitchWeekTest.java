package ru.job4j.condition;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SwitchWeekTest {

    @Test
    public void whenNumber1ThenMon() {
        int day = 1;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Понедельник";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumber8ThenErr() {
        int day = 8;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Ошибка";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumber7ThenSun() {
        int day = 7;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Воскресенье";
        assertThat(result).isEqualTo(expected);
    }
}