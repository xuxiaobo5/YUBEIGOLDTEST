package com.yubeigold.test.TestBase;

import com.yubeigold.test.Pages.PageManager;
import com.yubeigold.test.UiHelper.UiHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.net.URL;

/**
 * Created by xuxiaobo on 2017/4/10 0006.
 */

public class TestBase {
    private AppiumDriver driver;
    private UiHelper helper;
    protected PageManager pm;

    @BeforeMethod
    public void setUp() throws Exception {
        File classPath = new File(System.getProperty("user.dir"));
        File appDir = new File(classPath,"/app");
        File app = new File(appDir,"/yubeigold.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","AndroidTest");
        capabilities.setCapability("platformVersion","5.0");
        capabilities.setCapability("app",app.getAbsolutePath());
        capabilities.setCapability("appActivity","com.jyj.yubeitd.mainui.LauncherActivity");
        capabilities.setCapability("noSign",true);
        capabilities.setCapability("noRest",true);
        //capabilities.setCapability("unicodeKeyboard",true);
        //capabilities.setCapability("resetKeyboard",true);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4800/wd/hub"),capabilities);
        helper = new UiHelper(driver);
        pm = new PageManager(helper);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
