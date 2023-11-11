package pages;

import org.openqa.selenium.By;

import Utility.BaseTest;

public class HomePage extends BaseTest {

    public static String hamburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String signIn_link_xpath = "//*[@id=\"menu\"]/a[2]/li";


    public static void click_hamburger_menu() throws InterruptedException {
        Thread.sleep(1000);
       driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }

    public static void click_signIn_link() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(signIn_link_xpath)).click();
    }

}