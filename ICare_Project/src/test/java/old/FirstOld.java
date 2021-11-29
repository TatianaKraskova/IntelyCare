//package Old;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class FirstOld {
//
//    @Test
//    public void testMainPage() throws InterruptedException {
//
//        System.setProperty("webdriver.chrome.driver", "/Users/tatiana.kraskova/Projects/chromedriver");
//
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        driver.get("http://34.234.125.71/apply/career.html");
//
//        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
//        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
//        WebElement submit = driver.findElement(By.xpath("//*[@type='submit']"));
//
//        email.sendKeys("testJava16@mailinator.com");
//        password.sendKeys("Test@123");
//        submit.click();
//
//        String actualUrl = "http://34.234.125.71/apply/career.html";
//        String expectedUrl = driver.getCurrentUrl();
//
//        Assert.assertEquals(expectedUrl, actualUrl);
//
//        WebDriverWait wait = new WebDriverWait(driver,120);
//        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[contains(text(),'Hi there!')]"), "Hi there!"));
//
//        WebElement firstName = driver.findElement(By.name("firstName"));
//        WebElement lastName = driver.findElement(By.name("lastName"));
//        WebElement mobileNumber = driver.findElement(By.name("mobile"));
//        WebElement zipCode = driver.findElement(By.id("input_5"));
//        WebElement type = driver.findElement(By.xpath("//md-radio-button[@value='CNA']"));
//        WebElement dayShiftType = driver.findElement(By.xpath("//md-checkbox[@aria-label='Day Checkbox']"));
//        WebElement eveningShiftType = driver.findElement(By.xpath("//md-checkbox[@aria-label='Evening Checkbox']"));
//        WebElement workExperience = driver.findElement(By.xpath("//md-radio-button[@value='6_Months']"));
//        WebElement termsServprivacyPolicy = driver.findElement(By.xpath("//md-checkbox[@aria-label='Checkbox 1']"));
//        WebElement continueButton = driver.findElement(By.xpath("//button[@id='AP_Basic_Info_continue']"));
//
//        firstName.sendKeys("Test_Name");
//        lastName.sendKeys("Test_Last_Name");
//        mobileNumber.sendKeys("9789789999");
//        zipCode.sendKeys("01824");
//        type.click();
//        dayShiftType.click();
//        eveningShiftType.click();
//        workExperience.click();
//        termsServprivacyPolicy.click();
//        continueButton.click();
//
//    }
//}
//
