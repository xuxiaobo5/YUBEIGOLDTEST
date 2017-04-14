package com.yubeigold.test.BasicTest.Pages;

import com.yubeigold.test.BasicTest.UiHelper.UiHelper;
import org.openqa.selenium.WebElement;

/**
 * Created by xuxiaobo on 2017/4/10 0007.
 */

public class PageMyTab {
    private UiHelper helper;

    public PageMyTab(UiHelper helper){
        this.helper = helper;
    }


    //点击“点击登录”按钮
    public void clickToLogin(){
        WebElement clickTologinBtn = (WebElement)helper.findById("com.jyj.yubeitd:id/iv_person_user_head");
        clickTologinBtn.click();
    }

    //输入手机号和密码，点击登录按钮
    public void enterTelNumAndPwd(String num, String pwd){
        //输入手机号
        WebElement telNumET =(WebElement)helper.findById("com.jyj.yubeitd:id/et_login_mobile");
        telNumET.clear();
        telNumET.sendKeys(num);
        //输入密码
        WebElement pwdET =(WebElement)helper.findById("com.jyj.yubeitd:id/et_login_pwd") ;
        pwdET.clear();
        pwdET.sendKeys(pwd);
        //点击登录按钮
        WebElement loginBtn =(WebElement)helper.findById("com.jyj.yubeitd:id/btn_login_commit");
        loginBtn.click();
    }

    //点击我的收藏
    public void clickMyFav(){
        WebElement myFav = (WebElement)helper.findById("com.jyj.yubeitd:id/personal_item_collect");
        myFav.click();
    }

    //点击消息提醒
    public void clickMyMsg(){
        WebElement myMsg = (WebElement)helper.findById("com.jyj.yubeitd:id/personal_item_message");
        myMsg.click();
    }

    //点击我的客服
    public void clickMyCustomerSer(){
        WebElement myCustomerSer = (WebElement)helper.findElementsByIdAndIndex("com.jyj.yubeitd:id/rl_personal_item",0);
        myCustomerSer.click();
    }

    //点击系统设置
    public void clickSysSetting(){
        WebElement sysSetting = (WebElement)helper.findElementsByIdAndIndex("com.jyj.yubeitd:id/rl_personal_item",1);
        sysSetting.click();
    }

    //点击推荐给朋友
    public void clickShareToFriends(){
        WebElement shareToFriends = (WebElement)helper.findElementsByIdAndIndex("com.jyj.yubeitd:id/rl_personal_item",2);
        shareToFriends.click();
    }

    //分享到微信
    public void shareToWechat(){
        WebElement weChat = helper.findById("com.jyj.yubeitd:id/rl_share_wechat");
        weChat.click();
    }

    //分享到朋友圈
    public void shareToMoments(){
        WebElement moments = helper.findById("com.jyj.yubeitd:id/rl_share_wechat_circle");
        moments.click();
    }

    //分享到微博
    public void shareToSina(){
        WebElement sina = helper.findById("com.jyj.yubeitd:id/rl_share_sina");
        sina.click();
    }

    //分享到QQ
    public void shreToQQ(){
        WebElement qq = helper.findById("com.jyj.yubeitd:id/rl_share_qq");
        qq.click();
    }

    //分享到空间
    public void shareToQQzone(){
        WebElement qqZone = helper.findById("com.jyj.yubeitd:id/rl_share_qqzone");
        qqZone.click();
    }
}
