package my.test.baidu;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @DATE 2020/10/14 0:11
 * @Description
 */
class BaiDuMainPageTest {
    public static final Logger Log = LoggerFactory.getLogger(BaiDuMainPageTest.class);
    static BaiDuMainPage baiDuMainPage;

    @BeforeAll
    static void setUp() {
        baiDuMainPage = new BaiDuMainPage();
    }

    @Test
    void getText(){
        baiDuMainPage.pageGetSomeThing();
    }
    @AfterAll
    static void tearDown() {
        baiDuMainPage.quit();

    }
}