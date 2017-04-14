package com.yubeigold.test.TestCase;

import com.yubeigold.test.TestBase.TestBase;
import org.testng.annotations.Test;

/**
 * Created by xuxiaobo on 2017/4/10 0007.
 */

public class TestBaseLoginSuccessful extends TestBase {

    @Test
    public void testLoginSuccessful() throws Exception {
        //pm.getPageHome().closeStartAdv();
        pm.getPageNavigation().clickMyTab();
        pm.getPageMyTab().clickToLogin();
        pm.getPageMyTab().enterTelNumAndPwd("13728722559","123456");
    }
}
