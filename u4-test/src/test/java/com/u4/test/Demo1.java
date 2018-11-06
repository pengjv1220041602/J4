package com.u4.test;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Demo1 {

    @Test
    public void test1 () {
//        Assert.assertEquals("message", "3", "2");
//        Assert.assertEquals(1,3);
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("1");
        list.add("1");
        list.add("1");

        list2.add("1");
        list2.add("1");
        list2.add("1");

        List<Car> lc1 = new ArrayList<>();
        List<Car> lc2 = new ArrayList<>();

        lc1.add(new Car());
        lc2.add(new Car());
//        Assert.assertEquals(lc1, lc2);
//        Assert.assertSame("error333",  new String("22"),new String("22"));
//        Assert.assertTrue("now condition is false", true);
//        Assert.assertTrue("now condition is false", new Car() .equals( new Car()));
//        Assert.assertTrue("now condition is false", new Car() .equals( new Car()));
        Assert.assertNotNull("this Object is null", new Car());
        System.out.println("111111111111");
    }



class Car {
        private String id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}

}
