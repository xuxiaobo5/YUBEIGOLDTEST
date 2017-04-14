package com.yubeigold.test.TestCase;

import com.yubeigold.test.TestBase.TestBase;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017/4/13 0013.
 */
public class TestShare extends TestBase{
    @Test
    public void testName() throws Exception {
        pm.getPageNavigation().clickMyTab();
        pm.getPageNavigation().clickHomeTab();
        pm.getPageHome().clickMoreStrategy();
    }
}
