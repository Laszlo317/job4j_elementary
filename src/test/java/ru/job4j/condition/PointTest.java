package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static ru.job4j.condition.Point.distance;

public class PointTest {

    @Test
    public void whenX15Y7toX26Y30Then25dot4() {
        double rsl = distance(15, 7, 26, 30);
        double expected = 25.4;
        Assert.assertEquals(rsl, expected, 0.1);
    }

    @Test
    public void whenX6Y3oX6Y0Then25dot4() {
        double rsl = distance(6, 3, 6, 0);
        double expected = 3.0;
        Assert.assertEquals(rsl, expected, 0.1);
    }

    @Test
    public void whenX0Y9toXneg6Y8Then25dot4() {
        double rsl = distance(0, 9, -6, 8);
        double expected = 6.1;
        Assert.assertEquals(rsl, expected, 0.1);
    }
}