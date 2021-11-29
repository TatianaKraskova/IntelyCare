//package Old;
//
//import com.intelycare.tk.Utils;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//public class Base {
//
////    public void testMainPage() {
////
////        System.setProperty("webdriver.chrome.driver", "/Users/tatiana.kraskova/Projects/chromedriver");
////
////        WebDriver driver = new ChromeDriver();
////        driver.manage().window().maximize();
////
////        driver.get("http://34.234.125.71/apply/career.html");
////    }
////}
//
//    final static String BASE_URL = "http://34.234.125.71/apply/career.html";
//    final static String CHROME_DRIVER_LOCATION = "/Users/tatiana.kraskova/Projects/chromedriver";
//
//    public static WebDriver initChromeDriver() {
//        System.setProperty("webdriver.chrome.driver", Base.CHROME_DRIVER_LOCATION);
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        return driver;
//    }
//}