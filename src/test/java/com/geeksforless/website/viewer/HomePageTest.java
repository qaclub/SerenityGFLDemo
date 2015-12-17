package com.geeksforless.website.viewer;

import com.geeksforless.website.steps.ViewerSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.TestData;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class) 
public class HomePageTest {
	
	@Managed
    WebDriver browserDriver;

    @Steps
    ViewerSteps viewer;

    @Before
    public void open_browser() {
    	viewer.open_home_page();
    	browserDriver.manage().window().maximize();
    }
    
    @Test
    public void userShouldBeAbleToViewListOfPartnersByClickingOnSliderButtons() {
        viewer.click_on_the_right_button_of_partner_slider();
    }
    
}
