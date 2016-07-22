package com.geeksforless.website.viewer;

import com.geeksforless.website.steps.ViewerSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.TestData;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class) 
public class ServiceSliderTest {
	
    @Managed
    WebDriver browserDriver;

    @Steps
    ViewerSteps viewer;

    private final int serviceSliderButtonClicked;                   
    private final String expectedHeaderTitle;
    
    @Before
    public void open_browser() {
    	viewer.open_home_page();
    	browserDriver.manage().window().maximize();
    }
    
    @TestData                                                   
    public static Collection<Object[]> testData(){
        return Arrays.asList(new Object[][]{
                {0,  "Programmers"},
                {1,  "Web Developers"},
                {2, "Quality Assurance"},
                {3, "System Administrators"},
                {4, "Tech Support"},
                {5, "Call Center"}
        });
    }
    
    public ServiceSliderTest (int serviceSliderButtonClicked, String expectedHeaderTitle) {
    	this.serviceSliderButtonClicked = serviceSliderButtonClicked;
    	this.expectedHeaderTitle = expectedHeaderTitle;
    }
    
    @Test
    public void userShouldBeAbleToViewDifferentSlidesForDifferentServices() {
    	viewer.click_on_service_slider_button_with_index(serviceSliderButtonClicked);
    	viewer.verify_that_slider_title_is_changed(serviceSliderButtonClicked, expectedHeaderTitle);
    }

}
