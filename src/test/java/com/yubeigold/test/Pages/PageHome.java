package com.yubeigold.test.Pages;
import com.yubeigold.test.UiHelper.UiHelper;
import org.openqa.selenium.WebElement;


/**
 * Created by xuxiaobo on 2017/4/10 0006.
 */

public class PageHome {
    private UiHelper helper;

    public PageHome(UiHelper helper){
        this.helper = helper;
        helper.waitForViewById("com.jyj.yubeitd:id/main_floating_close");
    }

    //关闭首页弹窗广告
    public void closeStartAdv(){
        WebElement startAdv = helper.findById("com.jyj.yubeitd:id/main_floating_close");
        startAdv.click();
    }

    public void swipeTest(){
        helper.swipeToUp();
    }

    public void clickMoreStrategy(){
        WebElement moreStrategy = helper.findById("com.jyj.yubeitd:id/load_more_home");
        moreStrategy.click();
    }
}
