package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends Utility {
    By userNameField = By.xpath("//input[@id='user-name']");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");

    By productsText = By.xpath("//span[@class='title']");
    By countProductsOnList = By.xpath("//div[@class='inventory_list']//div//div//div[@class='inventory_item_name']");
    public void enterUserName(String userName) {
        sendTextToElement(userNameField, userName);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getProductsText(){
        return getTextFromElement(productsText);
    }
    public int getCountProductsOnList(){
        List<WebElement> productsList = driver.findElements(countProductsOnList);
        return productsList.size();
    }


}
