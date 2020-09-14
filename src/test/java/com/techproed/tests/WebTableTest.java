package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableTest extends TestBase {
    // her test methodundan önce çalışır.
    @BeforeMethod
    public void beforeMethod(){
        driver.get("http://fhctrip-qa.com/admin/HotelroomAdmin");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!" + Keys.ENTER);
    }
    @Test
    public void sutunyaxdirma(){
        List<WebElement>besincisutun=driver.findElements(By.xpath("//tbody/tr/td[5]"));

        System.out.println(besincisutun);
    }
@Test
public void hucreyazdirma(){
        WebElement hucre=driver.findElement(By.xpath("//tbody/tr[2]/td[3]"));
        System.out.println(hucre.getText());
}
    //@Test
    public void basliklar(){
    }
    // her test methodundan sonra çalışır.
    @AfterMethod
    public void afterMethod(){
    }




}
