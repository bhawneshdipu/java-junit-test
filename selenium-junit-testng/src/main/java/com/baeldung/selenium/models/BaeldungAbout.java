package com.dipu.selenium.models;

import com.dipu.selenium.config.SeleniumConfig;
import com.dipu.selenium.pages.BaeldungAboutPage;
import org.openqa.selenium.support.PageFactory;

public class BaeldungAbout {

    private SeleniumConfig config;

    public BaeldungAbout(SeleniumConfig config) {
        this.config = config;
        PageFactory.initElements(config.getDriver(), BaeldungAboutPage.class);
    }

    public void navigateTo() {
        config.navigateTo("http://www.baeldung.com/about/");
    }

    public String getPageTitle() {
        return BaeldungAboutPage.title.getText();
    }
}
