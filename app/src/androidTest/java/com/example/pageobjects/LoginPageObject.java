package com.example.pageobjects;

import com.example.testappempty.*;

import static com.example.framework.EspressoFramework.*;


public class LoginPageObject extends BasePageObject {

    public static final int txtUsername = R.id.editTextTextPersonName;
    public static final int txtPassword = R.id.editTextTextPassword;
    public static final int btnSignIn = R.id.button;
    public static final int txtAreaCopyright = R.id.textView4;

    private static void enterUserName(String username){
        enterText(txtUsername,username);
    }

    private static void enterPassword(String password){
        enterText(txtPassword,password);
    }
    private static HomePageObject clickSignIn(){
        clickButton(btnSignIn);
        return new HomePageObject();
    }

    public void findCopyrightText(){
        findTextOnView(txtAreaCopyright,"Copyright reserved");
    }

    public HomePageObject login(String username, String password){
        enterUserName(username);
        enterPassword(password);
        return clickSignIn();
    }

}
