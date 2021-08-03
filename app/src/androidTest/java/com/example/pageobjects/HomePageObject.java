package com.example.pageobjects;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.NoMatchingViewException;

import com.example.testappempty.R;

import static com.example.framework.EspressoFramework.clickButton;
import static com.example.framework.EspressoFramework.elementExistsInView;
import static com.example.framework.EspressoFramework.enterText;
import static com.example.framework.EspressoFramework.findTextOnView;


public class HomePageObject extends BasePageObject {

    public static final int btnReadMore = R.id.button2;

    public boolean readMoreButtonExists(){
       return elementExistsInView(btnReadMore);
    }

    public void clickReadMore(){
        clickButton(btnReadMore);
    }




}
