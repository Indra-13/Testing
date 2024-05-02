package com.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Model2 {
    @Test
    public void Testcase() throws Exception {
        // Set the path to ChromeDriver
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // 3. Open https://www.shoppersstop.com/
        driver.get("https://www.shoppersstop.com/");

        // 4. Click on the profile image
        WebElement profileImage = driver
                .findElement(By.xpath("/html/body/main/header/div[1]/div/div[2]/div[2]/ul/li[4]/a/i"));
        profileImage.click();

        // 5. Maximize the page
        driver.manage().window().maximize();

        // 6. Get the title of the page
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // 7. Get the page source code
        String pageSource = driver.getPageSource();

        // 8. Get the length of the source code
        int sourceLength = pageSource.length();
        System.out.println("Page Source Length: " + sourceLength);

        // 9. Navigate to https://www.google.com
        driver.get("https://www.google.com");

        // 10. Navigate back to the previous page of shoppersstop
        driver.navigate().back();

        // 11. Verify the current URL matches with the URL of step 3
        String currentURL = driver.getCurrentUrl();
        String expectedURL = "https://www.shoppersstop.com/";
        if (currentURL.equals(expectedURL)) {
            System.out.println("Current URL matches with the URL of step 3.");
        } else {
            System.out.println("Current URL does not match with the URL of step 3.");
        }

        // 12. Close the browser
        driver.quit();
    }
}