//package Old;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class TestSecondOld extends Base {
//
//    @Test
//    public void testMainPage() {
//
//        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
//        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
//        WebElement submit = driver.findElement(By.xpath("//*[@type='submit']"));
//
//        email.sendKeys("testJava2@mailinator.com");
//        password.sendKeys("Test@123");
//        submit.click();
//
//        String actualUrl = "http://34.234.125.71/apply/career.html";
//        String expectedUrl = driver.getCurrentUrl();
//
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//}