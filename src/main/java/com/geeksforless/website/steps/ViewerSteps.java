package com.geeksforless.website.steps;

import com.geeksforless.website.pages.HomePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

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
	
	@Step("Click on Service slider button #{0}")
	public void click_on_service_slider_button_with_index(int index) {
		homePage.serviceSliderPageButtons.get(index).click();
	}
	
	@Step("Verify that Sliders title is changed to '{0}'")
	public void verify_that_slider_title_is_changed(int index, String title) {
		homePage.serviceSliderHeaderTitles.get(index).shouldContainText(title);
		homePage.serviceSliderHeaderTitles.get(index).shouldBeVisible();
	}
	
}