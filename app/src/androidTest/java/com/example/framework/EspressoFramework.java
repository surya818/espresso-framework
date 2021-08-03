package com.example.framework;

import androidx.test.espresso.NoMatchingViewException;
import androidx.test.espresso.assertion.ViewAssertions;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withSubstring;

public class EspressoFramework {

    public static void enterText(int view, String text) {
        onView(withId(view)).perform(typeText(text),closeSoftKeyboard());
    }

    public static void clickButton(int view) {
        onView(withId(view)).perform(click());
    }

    public static void findTextOnView(int view, String text) {
        onView(withId(view)).check(matches(withSubstring(text)));
    }

    public static boolean elementExistsInView(int elementId){
        try {
            onView(withId(elementId)).check(matches(isDisplayed()));
        } catch (NoMatchingViewException e) {
            return false;
        }
        return true;
    }

}
