package my.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.TimeUnit;

/**
 * @DATE 2020/10/13 23:35
 * @Description PO测试 base
 */
public class BasePage {
    public static final Logger Log = LoggerFactory.getLogger(BasePage.class);
    RemoteWebDriver driver;
    WebDriverWait wait;
    String BaseURL;

    public BasePage(String BaseURL){
        this.BaseURL = BaseURL;
        System.setProperty("webdriver.chrome.driver", "F:\\MyStudy\\SeleniumUIDependentFiles\\WebDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        Log.info("调用了ChromeDriver驱动，启动浏览器");
        driver.get(BaseURL);
        Log.info("调用了get方法，打开了百度页面");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        selenium 4.0 use duration
//        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait=new WebDriverWait(driver, 10);
    }

    public BasePage(RemoteWebDriver driver){
        this.driver = driver;
        //添加显示等待（最长超时时间：10秒；检测的间隔时间：默认为0.5秒这里设置为：1000ms）
        wait = new WebDriverWait(driver, 10, 1000);
    }

    public void quit() {
        driver.quit();
        Log.info("浏览器关闭");
    }

    public void clickBy(By by){
        //todo: 异常处理
        wait.until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).click();
    }

    public String getTextBy(By by){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return driver.findElement(by).getText();
    }

    public void sendKeysBy(By by, String content){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        driver.findElement(by).sendKeys(content);
    }

    public void uploadBy(By by, String path){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        driver.findElement(by).sendKeys(path);
    }

}
