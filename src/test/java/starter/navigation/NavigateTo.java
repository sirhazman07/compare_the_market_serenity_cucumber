package starter.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    DuckDuckGoHomePage duckDuckGoHomePage;
    CarInsuranceHomePage carInsuranceHomePage;
    CarInsuranceQuoteRequestPage carInsuranceQuoteRequestPage;

    @Step("Open the DuckDuckGo home page")
    public void theDuckDuckGoHomePage() {
        duckDuckGoHomePage.open();
    }

    @Step("Open the compare the market car insurance home page")
    public void theCompareTheMarketHomePage() {
        carInsuranceHomePage.open();
    }

    @Step("Open the quote request form page")
    public void theCompareTheMarketQuoteRequestPage() {
        carInsuranceQuoteRequestPage.open();
    }
}
