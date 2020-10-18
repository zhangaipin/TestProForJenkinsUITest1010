package my.test.baidu;

import my.test.BasePage;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @DATE 2020/10/13 23:41
 * @Description
 */
public class BaiDuBasePage extends BasePage {
    public BaiDuBasePage(){
        super("https://www.baidu.com");
    }
    public BaiDuBasePage(ChromeDriver driver){
        super(driver);
    }

}
