package com.yubeigold.test.TestCase;

import com.yubeigold.test.TestBase.TestBase;
import org.testng.annotations.Test;

/**
 * Created by xuxiaobo on 2017/4/10 0006.
 */
public class TestBaseDemo extends TestBase {

    @Test
    public void testName() throws Exception {
        pm.getPageHome().closeStartAdv();
        pm.getPageNavigation().clickMyTab();
        pm.getPageNavigation().clickInfoTab();
        pm.getPageNavigation().clickHomeTab();
        Thread.sleep(5000);
    }
}
