package ru.job4j.loop;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactorialTest {

    @Test
    public void when1then1() {
        int n = 1;
        int result = Factorial.calc(n);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when0then1() {
        int n = 0;
        int result = Factorial.calc(n);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when8then40320() {
        int n = 8;
        int result = Factorial.calc(n);
        int expected = 40320;
        assertThat(result).isEqualTo(expected);
    }
}