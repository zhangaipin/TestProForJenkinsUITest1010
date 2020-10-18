import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.TimeUnit;

/**
 * @DATE 2020/10/12 22:41
 * @Description 访问百度页面测试
 */
public class PrintBaiduUI {
    public static final Logger Log = LoggerFactory.getLogger(PrintBaiduUI.class);
    @Test
    void testMethod(){
        Log.info("开始了自动化测试");
        System.setProperty("webdriver.chrome.driver", "F:\\MyStudy\\SeleniumUIDependentFiles\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Log.info("调用了ChromeDriver驱动，启动浏览器");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.baidu.com");
        Log.info("调用了get方法，打开了百度页面");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
        Log.info("测试结束，关闭浏览器");
    }

}
