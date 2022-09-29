package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
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
    public void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To5To3To8Then8() {
        int result = Max.max(1, 5, 3, 8);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To2To18hen2() {
        int first = 2;
        int second = 2;
        int third = 1;
        int result = Max.max(first, second, third);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
}