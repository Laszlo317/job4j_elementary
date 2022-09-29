package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static java.awt.geom.Point2D.distance;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenX15Y7toX26Y30Then25dot4() {
        Point p1 = new Point(15, 7);
        Point p2 = new Point(26, 30);
        double rsl = p1.distance(p2);
        double expected = 25.4;
        Assert.assertEquals(rsl, expected, 0.1);
    }

    @Test
    public void whenX6Y3oX6Y0Then3() {
        Point p1 = new Point(6, 3);
        Point p2 = new Point(6, 0);
        double rsl = p1.distance(p2);
        double expected = 3.0;
        Assert.assertEquals(rsl, expected, 0.1);
    }

    @Test
    public void whenX0Y9toXneg6Y8Then6dot1() {
        Point p1 = new Point(0, 9);
        Point p2 = new Point(-6, 8);
        double rsl = p1.distance(p2);
        double expected = 6.1;
        Assert.assertEquals(rsl, expected, 0.1);
    }
}