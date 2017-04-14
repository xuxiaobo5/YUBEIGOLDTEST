package com.yubeigold.test.BasicTest.UiHelper;

import io.appium.java_client.AppiumDriver;
import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by xuxiaobo on 2017/4/10 0005.
 */

public class UiHelper {
    private AppiumDriver driver;

    public UiHelper(AppiumDriver driver){
        this.driver = driver;
    }

    //通过ID来查找元素
    public WebElement findById(String id){
        return driver.findElement(By.id(id));
    }

    //通过Name来查找元素
    public WebElement findByName(String name){
        return driver.findElement(By.name(name));
    }

    //通过ClassName来查找元素
    public WebElement findbyClassName(String classname){
        return driver.findElement(By.className(classname));
    }

    //通过Xpath来查找元素
    public WebElement findByXpath(String xpath){
        return driver.findElement(By.xpath(xpath));
    }

    //通过CSS Selector来查找元素
    public WebElement findByCSS(String CSS){
        return driver.findElement(By.cssSelector(CSS));
    }

    //通过链接文本来查找元素
    public WebElement findByLinkText(String text){
        return driver.findElement(By.linkText(text));
    }

    //通过部分链接文本来查找元素
    public WebElement findByPartialLinkText(String text){
        return driver.findElement(By.partialLinkText(text));
    }

    //通过ID和索引查找所有元素
    public WebElement findElementsByIdAndIndex(String id,int index){
        return (WebElement) driver.findElements(By.id(id)).get(index);
    }

    //向上滑动手机
    public void swipeToUp(){
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width/2,height*3/4,width/2,height/4,500);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //向下滑动手机
    public void swipeToDown(){
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width/2,height/4,width/2,height*3/4,500);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //向左滑动手机
    public void swipeToLeft(){
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width*3/4,height/2,width/4,height/2,500);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //向右滑动手机
    public void swipeToRight(){
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width/4,height/2,width*3/4,height/2,500);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //通过ID等待元素出现
    public void waitForViewById(String id){
        long timeout = System.currentTimeMillis() + 10000;
        while (System.currentTimeMillis() < timeout && (driver.findElements(By.id(id)).size() == 0));
    }

}