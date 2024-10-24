package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ElementLocate extends BrowserSetup{
    @Test
    public void testElement() throws InterruptedException {
        browser.manage().window().maximize();
        browser.get("https://google.com");
        WebElement search_field;
        search_field = browser.findElement(By.id("APjFqb"));
        search_field.sendKeys("facebook");

        WebElement search_button;
        search_button = browser.findElement(By.className("iblpc"));
        search_button.submit();

        WebElement goto_fb;
        goto_fb = browser.findElement(By.className("byrV5b"));
        goto_fb.click();

        WebElement email;
        email = browser.findElement(By.id("email"));
        email.sendKeys("saiful8494");

        WebElement password;
        password = browser.findElement(By.id("pass"));
        password.sendKeys("12345");

        WebElement submit_btn;
        submit_btn = browser.findElement(By.id("loginbutton"));
        submit_btn.click();
        Thread.sleep(4000);
//        System.out.println(search_button.getText());
    }
}
