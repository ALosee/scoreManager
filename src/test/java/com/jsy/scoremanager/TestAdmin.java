package com.jsy.scoremanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * @author jiang
 * @date 2022/5/28 10:02
 */
public class TestAdmin {
    @Test
    void testStuList() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/Google/Chrome/Application/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //登录
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement managerRadio = driver.findElement(By.id("radio-1"));
        WebElement code = driver.findElement(By.id("code"));
        WebElement submitBtn = driver.findElement(By.id("submitBtn"));
        username.sendKeys("admin");
        password.sendKeys("123456");
        code.sendKeys("6666");
        managerRadio.click();
        submitBtn.click();


        //学生列表
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[1]/div[2]/ul/li/div/a")).click();
        WebElement iframe_stuList = driver.findElement(By.xpath("//*[@id=\"tabs\"]/div[2]/div[2]/div/iframe"));
        driver.switchTo().frame(iframe_stuList);

        //添加
        driver.findElement(By.xpath("//*[@id=\"add\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"addForm\"]/table/tbody/tr[1]/td[2]/span/input[1]")).sendKeys("蒋思宇");
        driver.findElement(By.xpath("//*[@id=\"addForm\"]/table/tbody/tr[2]/td[2]/span/input[1]")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"addForm\"]/table/tbody/tr[4]/td[2]/span/input[1]")).sendKeys("15527239885");
        driver.findElement(By.xpath("//*[@id=\"addForm\"]/table/tbody/tr[5]/td[2]/span/input[1]")).sendKeys("1749035947");
        driver.findElement(By.xpath("/html/body/div[7]/div[3]/a[1]")).click();
        driver.findElement(By.xpath("/html/body/div[13]/div[2]/div[4]/a")).click();


        //查询
        driver.findElement(By.xpath("//*[@id=\"toolbar\"]/div[6]/span/input[1]")).sendKeys("蒋思宇");
        driver.findElement(By.xpath("//*[@id=\"search-btn\"]")).click();
        //勾选
        driver.findElement(By.xpath("//*[@id=\"datagrid-row-r1-2-0\"]/td[1]/div/input")).click();
        //修改
        driver.findElement(By.xpath("//*[@id=\"edit\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"editForm\"]/table/tbody/tr[1]/td[2]/span/input[1]")).sendKeys("蒋思宇1111");
        driver.findElement(By.xpath("/html/body/div[10]/div[3]/a[1]")).click();
        driver.findElement(By.xpath("/html/body/div[13]/div[2]/div[4]/a")).click();


        //查询
        driver.findElement(By.xpath("//*[@id=\"toolbar\"]/div[6]/span/input[1]")).sendKeys("蒋思宇1111");
        driver.findElement(By.xpath("//*[@id=\"search-btn\"]")).click();
        //勾选
        driver.findElement(By.xpath("//*[@id=\"datagrid-row-r1-2-0\"]/td[1]/div/input")).click();
        //删除
        driver.findElement(By.xpath("//*[@id=\"delete\"]")).click();
        driver.findElement(By.xpath("/html/body/div[13]/div[2]/div[4]/a[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[13]/div[2]/div[4]/a")).click();
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    void testMaxValue() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/Google/Chrome/Application/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //登录
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement managerRadio = driver.findElement(By.id("radio-1"));
        WebElement code = driver.findElement(By.id("code"));
        WebElement submitBtn = driver.findElement(By.id("submitBtn"));
        username.sendKeys("admin");
        password.sendKeys("123456");
        code.sendKeys("6666");
        managerRadio.click();
        submitBtn.click();

        /*
        //学生列表
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[1]/div[2]/ul/li/div/a")).click();
        WebElement iframe_stuList = driver.findElement(By.xpath("//*[@id=\"tabs\"]/div[2]/div[2]/div/iframe"));
        driver.switchTo().frame(iframe_stuList);
        //添加10个学生
        for (int i = 1; i <= 10; i++) {
            driver.findElement(By.xpath("//*[@id=\"add\"]")).click();
            driver.findElement(By.xpath("/html/body/div[7]/div[3]/a[2]")).click();//重置
            driver.findElement(By.xpath("//*[@id=\"addForm\"]/table/tbody/tr[1]/td[2]/span/input[1]")).sendKeys(String.valueOf(i));
            driver.findElement(By.xpath("//*[@id=\"addForm\"]/table/tbody/tr[2]/td[2]/span/input[1]")).sendKeys("123456");
            driver.findElement(By.xpath("/html/body/div[7]/div[3]/a[1]")).click();
            driver.findElement(By.xpath("/html/body/div[13]/div[2]/div[4]/a")).click();
        }
        */


        //选课列表
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[5]/div[1]/div[3]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[5]/div[2]/ul/li/div/a")).click();
        WebElement select_courseList = driver.findElement(By.xpath("//*[@id=\"tabs\"]/div[2]/div[2]/div/iframe"));
        driver.switchTo().frame(select_courseList);

        //添加
        for (int i = 1; i <= 10; i++) {
            driver.findElement(By.xpath("//*[@id=\"add\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"addForm\"]/table/tbody/tr[1]/td[2]/span/span/a")).click();
            driver.findElement(By.xpath("/html/body/div[8]/div/div[text()='"+String.valueOf(i)+"']")).click();
            driver.findElement(By.xpath("//*[@id=\"addForm\"]/table/tbody/tr[2]/td[2]/span/span/a")).click();
            driver.findElement(By.xpath("/html/body/div[7]/div/div[text()='数据结构']")).click();
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/a[1]")).click();
            driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[4]/a")).click();
        }
        //第11人选课失败
        driver.findElement(By.xpath("//*[@id=\"add\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"addForm\"]/table/tbody/tr[1]/td[2]/span/span/a")).click();
        driver.findElement(By.xpath("/html/body/div[8]/div/div[text()='11']")).click();
        driver.findElement(By.xpath("//*[@id=\"addForm\"]/table/tbody/tr[2]/td[2]/span/span/a")).click();
        driver.findElement(By.xpath("/html/body/div[7]/div/div[text()='数据结构']")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/a[1]")).click();

        //xx
        driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[4]/a")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[3]/a")).click();

        //退选
        for (int i = 1; i <= 10; i++) {
            driver.findElement(By.xpath("//*[@id=\"datagrid-row-r1-2-0\"]/td[1]/div/input")).click();
            driver.findElement(By.xpath("//*[@id=\"delete\"]")).click();
            driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[4]/a[1]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[4]/a")).click();
        }
    }


    @Test
    void testA() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/Google/Chrome/Application/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //登录
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement managerRadio = driver.findElement(By.id("radio-1"));
        WebElement code = driver.findElement(By.id("code"));
        WebElement submitBtn = driver.findElement(By.id("submitBtn"));
        username.sendKeys("admin");
        password.sendKeys("123456");
        code.sendKeys("6666");
        managerRadio.click();
        submitBtn.click();

        //学生列表
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[1]/div[2]/ul/li/div/a")).click();
        Thread.sleep(1000);

        //班级列表
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[2]/div[1]/div[3]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[2]/div[2]/ul/li/div/a")).click();
        Thread.sleep(1000);

        //教师列表
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[3]/div[1]/div[3]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[3]/div[2]/ul/li/div/a")).click();
        Thread.sleep(1000);

        //课程信息
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[4]/div[1]/div[3]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[4]/div[2]/ul/li/div/a")).click();
        Thread.sleep(1000);

        //选课信息
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[5]/div[1]/div[3]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[5]/div[2]/ul/li/div/a")).click();
        Thread.sleep(1000);

        //成绩信息
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[6]/div[1]/div[3]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[6]/div[2]/ul/li[1]/div/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[6]/div[2]/ul/li[2]/div/a")).click();
        Thread.sleep(1000);

        //修改密码
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[7]/div[1]/div[3]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[7]/div[2]/ul/li/div/a")).click();
        Thread.sleep(1000);
    }

}
