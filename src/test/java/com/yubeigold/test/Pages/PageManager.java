package com.yubeigold.test.Pages;

import com.yubeigold.test.UiHelper.UiHelper;

/**
 * Created by xuxiaobo on 2017/4/10 0006.
 */

public class PageManager {
    private UiHelper helper;
    private PageNavigation pageNavigation;
    private PageHome pageHome;
    private PageMyTab pageMyTab;

    public PageManager(UiHelper helper){
        this.helper = helper;
    }

    public PageNavigation getPageNavigation(){
        if (pageNavigation == null){
            pageNavigation = new PageNavigation(helper);
        }return pageNavigation;
    }

    public PageHome getPageHome(){
        if (pageHome == null){
            pageHome = new PageHome(helper);
        }return pageHome;
    }

    public PageMyTab getPageMyTab(){
        if (pageMyTab == null){
            pageMyTab = new PageMyTab(helper);
        }return  pageMyTab;
    }

}
