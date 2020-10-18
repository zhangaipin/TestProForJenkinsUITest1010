package my.test.baidu;

import org.openqa.selenium.By;
/**
 * @DATE 2020/10/13 23:49
 * @Description 百度一下 主页面
 */
public class BaiDuMainPage extends BaiDuBasePage{
    public void pageGetSomeThing(){
        String text = getTextBy(By.id("s-usersetting-top"));
        Log.info("获取的文本内容为：" + text);
    }
}
