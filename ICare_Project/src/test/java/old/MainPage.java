//package Old;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class MainPage {
//
//        System.setProperty("webdriver.chrome.driver", "/Users/tatiana.kraskova/Projects/chromedriver");
//    WebDriver driver = new ChromeDriver();
//        //driver.manage().window().maximize();
//
//    public void emailAddress() {
//        driver.findElement(By.xpath("//*[@type='email']")).sendKeys("testJava@mailinator.com");
//    }
//
//    public void createPassword() {
//        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Test@123");
//    }
//
//    public void createAccount() {
//        driver.findElement(By.xpath("//*[@type='submit']")).click();
//    }
//
//    public void firstName() {
//        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("TestName");
//    }
//
//    public void lastName() {
//        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("TestLastName");
//    }
//
//    public void mobileNumber() {
//        driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9789789999");
//    }
//
//    public void zipCode() {
//        driver.findElement(By.xpath("//*[contains(text(),'Zip Code')]")).sendKeys("01824");
//    }
//
//    public void type() {
//        driver.findElement(By.xpath("//md-radio-button[@value='CNA']")).click();
//    }
//
//    public void dayShiftType(){
//        driver.findElement(By.xpath("//md-checkbox[@aria-label='Day Checkbox']")).click();
//    }
//
//    public void eveningShiftType(){
//        driver.findElement(By.xpath("//md-checkbox[@aria-label='Evening Checkbox']")).click();
//    }
//
//    public void workExperience(){
//        driver.findElement(By.xpath("//md-radio-button[@value='6_Months']")).click();
//    }
//
//    public void termsServprivacyPolicy(){
//        driver.findElement(By.xpath("//md-checkbox[@aria-label='Checkbox 1']")).click();
//    }
//
//    public void continueButton(){
//        driver.findElement(By.xpath("//button[@id='AP_Basic_Info_continue']")).click();
//    }
//
//}
