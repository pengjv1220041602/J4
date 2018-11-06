package com.u4.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({Demo1.class, Demo3.class})
public class Demo2 {

    @Test
    public void test1 () {
        System.out.println("22222222");
    }
}
