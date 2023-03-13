import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class LogIn {
    WebDriver wd;

    @Test
    public void test1(){

        WebElement el1 = wd.findElement(By.tagName("div"));
        WebElement el2 = wd.findElement(By.id("user"));
        WebElement el3 = wd.findElement(By.className("form-field"));
        WebElement el4 = wd.findElement(By.linkText("log in"));

        // css/xPath
        WebElement els1 = wd.findElement(By.cssSelector("#user"));
        WebElement elx1 = wd.findElement(By.xpath("//*[@id='user']"));
        WebElement els2 = wd.findElement(By.cssSelector(".form-field"));
        WebElement elx2 = wd.findElement(By.xpath("//*[@class='form-field']"));
        WebElement els3 = wd.findElement(By.cssSelector("[data-testid='bignav']"));
        WebElement elx3 = wd.findElement(By.xpath("[//*[@data-testid='bignav']"));
        WebElement els4 = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement elx4 = wd.findElement(By.xpath("//*[@href='/login']"));
        WebElement els5 = wd.findElement(By.cssSelector("a[href='/login']"));
        WebElement elx5 = wd.findElement(By.xpath("//a[@href='/login']"));

        //login css
        WebElement log1 = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement logX1 = wd.findElement(By.xpath("//*[@href='/login']"));
        WebElement log2 = wd.findElement(By.cssSelector("#user"));
        WebElement logX2 = wd.findElement(By.xpath("//*[@id='user']"));
        WebElement log3 = wd.findElement(By.cssSelector("#login"));
        WebElement logX3 = wd.findElement(By.xpath("//*[@id ='login']"));
        WebElement log4 = wd.findElement(By.cssSelector("#password"));
        WebElement logX4 = wd.findElement(By.xpath("//*[@id='password']"));
        WebElement log5 = wd.findElement(By.cssSelector("#login-submit"));
        WebElement logX5 = wd.findElement(By.xpath("//*[@id='login-submit']"));
        //assert
        WebElement al1 = wd.findElement(By.cssSelector("[data-testid='header-member-menu-button']"));
        WebElement alX1 = wd.findElement(By.xpath("//*[@data-testid='header-member-menu-button']"));
        WebElement al2 = wd.findElement(By.cssSelector(".js-open-header-member-menu"));
        WebElement alX2 = wd.findElement(By.xpath("//*[@class='js-open-header-member-menu']"));

        //logout
        WebElement l7 = wd.findElement(By.cssSelector("[data-testid='header-member-menu-button']"));
        WebElement lX7 = wd.findElement(By.xpath("//*[@data-testid='header-member-menu-button']"));
        WebElement l8 = wd.findElement(By.cssSelector("[data-testid='account-menu-logout']"));
        WebElement lX8 = wd.findElement(By.xpath("//*[@data-testid='account-menu-logout']"));
        WebElement l9 = wd.findElement(By.cssSelector("#logout-submit"));
        WebElement lX9 = wd.findElement(By.xpath("//*[@id ='logout-submit']"));
        WebElement l91 = wd.findElement(By.cssSelector("[data-testid='logout-button']"));
        WebElement lX91 = wd.findElement(By.xpath("//*[@data-testid='logout-button']"));

        //ends contains start css
        WebElement s1 = wd.findElement(By.cssSelector("[aria-label = 'Atlassian Trello']"));
        WebElement s2 = wd.findElement(By.cssSelector("[aria-label $= 'llo']")); //ends
        WebElement s3 = wd.findElement(By.cssSelector("[aria-label ^= 'Atlas']")); //starts
        WebElement s4 = wd.findElement(By.cssSelector("[aria-label *= 'Tre']")); //contains

        //starts-contains xPath
        WebElement x1 = wd.findElement(By.xpath("//*[@aria-label='Atlassian Trello']"));
        WebElement x2 = wd.findElement(By.xpath("//*[contains(@aria-label,'rello')]"));
        WebElement x3 = wd.findElement(By.xpath("//*[starts-with(@aria-label,'Atla')]"));

    }

}
