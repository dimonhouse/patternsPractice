package com.udemy.seleniumdesign.test;

import com.google.common.util.concurrent.Uninterruptibles;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setupDriver(){
        this.driver = WebDriverManager.chromedriver().create();
    }

    @AfterTest
    public void quitDriver(){
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        this.driver.quit();
    }

}
