package com.techproed.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityTest {

    @Test(priority = 2)
    public void amazonTest(){
        System.out.println("amazonTest");
    }

    @Test(priority = 3)
    public void googleTest(){
        System.out.println("googleTest");

    }

    @Test(priority = 5)
    public void facebookTest(){
        System.out.println("facebookTest");

    }

    @Test(priority = 6)
    public void appleTest(){
        System.out.println("appleTest");

    }
    @BeforeMethod
    public void beforem(){
        System.out.println("bu ne simdi before mu");
    }
}
