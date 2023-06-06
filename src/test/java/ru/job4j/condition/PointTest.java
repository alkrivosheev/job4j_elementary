package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to40then4() {
        double expected = 4;
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when60to29then9point84() {
        double expected = 9.84;
        Point a = new Point(6, 0);
        Point b = new Point(2, 9);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when148to1013then6point4() {
        double expected = 6.4;
        Point a = new Point(14, 8);
        Point b = new Point(10, 13);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to200then2() {
        double expected = 2;
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 0, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to400then4() {
        double expected = 4;
        Point a = new Point(0, 0, 0);
        Point b = new Point(4, 0, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when601to297then11point53() {
        double expected = 11.53;
        Point a = new Point(6, 0, 1);
        Point b = new Point(2, 9, 7);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1486to101318then13point60() {
        double expected = 13.60;
        Point a = new Point(14, 8, 6);
        Point b = new Point(10, 13, 18);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}