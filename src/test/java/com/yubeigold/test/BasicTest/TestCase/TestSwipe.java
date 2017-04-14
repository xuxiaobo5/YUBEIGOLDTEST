package com.yubeigold.test.BasicTest.TestCase;

import com.yubeigold.test.BasicTest.TestBase.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.SwipeElementDirection;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017/4/13 0013.
 */
public class TestSwipe extends TestBase {

    @Test
    public void testSwipe() throws Exception {
        pm.getPageNavigation().clickMyTab();
        pm.getPageNavigation().clickHomeTab();
        pm.getPageHome().swipeTest();
        Thread.sleep(10000);

    }
}
