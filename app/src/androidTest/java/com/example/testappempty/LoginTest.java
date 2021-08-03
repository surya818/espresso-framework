package com.example.testappempty;

import android.content.Context;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.pageobjects.HomePageObject;
import com.example.pageobjects.LoginPageObject;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;


@RunWith(AndroidJUnit4.class)
public class LoginTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void loginWithPageObjectModel() {
        LoginPageObject loginPage = new LoginPageObject();
        loginPage.findCopyrightText();
        HomePageObject homePage = loginPage.login("surya.rekha@electrolux.com", "lafoot");
        Assert.assertTrue("Read more button does not exist",homePage.readMoreButtonExists());
        homePage.clickReadMore();

    }

    private void sleep(int time) {
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}