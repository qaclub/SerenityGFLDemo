package com.geeksforless.website.pages;

import java.util.List;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://geeksforless.com/")
public class HomePage extends PageObject {

	@FindBy(css = "ul.sequence-pagination li")
    public List<WebElementFacade> serviceSliderPageButtons;
	
	@FindBy(css = "div.bx-controls-direction a.bx-prev")
	public WebElementFacade partnerSliderNavLeftButton;
	
	@FindBy(css = "div.bx-controls-direction a.bx-next")
	public WebElementFacade partnerSliderNavRightButton;
	
	@FindBy(css = "ul.sequence-canvas li.animate-in h2")
	public WebElementFacade serviceSliderHeaderTitle;
	
}