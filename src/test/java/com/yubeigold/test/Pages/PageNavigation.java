package com.yubeigold.test.Pages;
import com.yubeigold.test.UiHelper.UiHelper;
import org.openqa.selenium.WebElement;

/**
 * Created by xuxiaobo on 2017/4/10 0005.
 */

public class PageNavigation {
    private UiHelper helper;

    public PageNavigation(UiHelper helper){
        this.helper = helper;
        helper.waitForViewById("com.jyj.yubeitd:id/ll_tab_item");
    }

    //点击“首页”Tab页
    public void clickHomeTab(){
        WebElement getHomeTab = (WebElement)helper.findElementsByIdAndIndex("com.jyj.yubeitd:id/ll_tab_item",0);
        getHomeTab.click();
    }

    //点击“资讯”Tab页
    public void clickInfoTab(){
        WebElement getInfoTab = (WebElement) helper.findElementsByIdAndIndex("com.jyj.yubeitd:id/ll_tab_item",1);
        getInfoTab.click();
    }

    //点击“交易”Tab页
    public void clickTradeTab(){
        WebElement getTradeTab = (WebElement) helper.findElementsByIdAndIndex("com.jyj.yubeitd:id/ll_tab_item",2);
        getTradeTab.click();
    }

    //点击“直播”Tab页
    public void clickBroadCastTab(){
        WebElement getBroadCastTab = (WebElement) helper.findElementsByIdAndIndex("com.jyj.yubeitd:id/ll_tab_item",3);
        getBroadCastTab.click();
    }

    //点击“我的”Tab页
    public void clickMyTab(){
        WebElement getMyTab = (WebElement) helper.findElementsByIdAndIndex("com.jyj.yubeitd:id/ll_tab_item",4);
        getMyTab.click();
    }
}
