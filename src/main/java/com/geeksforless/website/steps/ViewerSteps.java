package com.geeksforless.website.steps;

import com.geeksforless.website.pages.HomePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.interactions.Actions;

public class ViewerSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = -508402045095492650L;
	
	private HomePage homePage;
	
	@Step
	public void open_home_page() {
		homePage.open();
	}
	
	@Step
	public void click_on_the_right_button_of_partner_slider() {
		homePage.partnerSliderNavRightButton.click();
	}
	
	@Step
	public void click_on_the_left_button_of_partner_slider() {
		homePage.partnerSliderNavLeftButton.click();
	}
	
	
}