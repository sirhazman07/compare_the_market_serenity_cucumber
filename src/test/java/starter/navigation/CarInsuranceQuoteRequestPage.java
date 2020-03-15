package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://www.comparethemarket.com.au/car-insurance/journey/start")

public class CarInsuranceQuoteRequestPage extends PageObject {

    @FindBy(id = "helpers.regoLabel")
    private WebElementFacade vehicleRegistrationNumber;

    @FindBy(id = "start.nextButton")
    private WebElementFacade vehicleRegistrationNextButton;

    @FindBy(className = "field_row__field_row_container__p74Go margin__margin_bottom_xxlarge__T4G2X text__text_align_left__3pLSB")
    private WebElementFacade vehicleRegistrationStateArea;

    //TODO: Add additional Selectors for each available state
    @FindBy(className = "badge__variant_inner_label_container_small_align_left__Sh6Ub badge__inner_label_container_base__2_IpD display__display_flex__2f-7x flex__align_self_stretch__3HdZD flex__align_items_center__3oW61 cursor__cursor_inherit__1mdKU flex__justify_content_start__3Wpeg padding__padding_top_small__7xEQm padding__padding_right_xsmall__189Hb padding__padding_bottom_small__5F0Xk padding__padding_left_small__3HZ4y")
    private WebElementFacade nswStateOptionButton;

    @FindBy(className = "field_row__field_row_container__p74Go margin__margin_bottom_xxlarge__T4G2X text__text_align_left__3pLSB")
    private WebElementFacade vehicleMakeArea;

    //TODO: Add additional Selectors for each available car make
    @FindBy(className = "badge__variant_inner_label_container_small_align_left__Sh6Ub badge__inner_label_container_base__2_IpD display__display_flex__2f-7x flex__align_self_stretch__3HdZD flex__align_items_center__3oW61 cursor__cursor_inherit__1mdKU flex__justify_content_start__3Wpeg padding__padding_top_small__7xEQm padding__padding_right_xsmall__189Hb padding__padding_bottom_small__5F0Xk padding__padding_left_small__3HZ4y")
    private WebElementFacade audiMakeoptionButton;

    @FindBy(id = "car_make.nextButton")
    private WebElementFacade carMakeNextButton;

    @FindBy(className = "field_row__field_row_container__p74Go margin__margin_bottom_xxlarge__T4G2X text__text_align_left__3pLSB")
    private WebElementFacade vehicleMakeYearArea;

    //TODO: Add additional Selectors for each available car make Year
    @FindBy(className = "badge__root__REBSg text__text_align_center__1fMlm text__text_overflow_ellipsis__oBcoK margin__margin_bottom_small__3DTkf overflow__overflow_hidden__11tfF behaviour__user_select_none__3I6-P position__pos_relative__qHQkT badge__variant_size_xs_50_sm_20__2JTrS badge__badge_primary_semi_rounded_valid__32DZt badge__base__FlZLA display__display_flex__2f-7x flex__align_items_center__3oW61 flex__justify_content_center__k46Dm badge__shape_set_semi_rounded_large__1mhlZ borders__border_radius_semi_rounded_large__VKGN8 badge__color_set_valid__3y3bM color__color_brand_base_0__2GvLT colors__bg_color_feature_1__3foow borders__border_width_default__38AIO borders__border_style_default__1y50J borders__border_color_default__1VoE5 shared__state_set_default__2MzXL cursor__cursor_pointer__1qPSx")
    private WebElementFacade vehicleMakeYear2020Option;

    @FindBy(className = "field_row__field_row_container__p74Go margin__margin_bottom_xxlarge__T4G2X text__text_align_left__3pLSB")
    private WebElementFacade vehicleModelArea;

    //TODO: Add additional Selectors for each available car make Model
    @FindBy(className = "badge__root__REBSg text__text_align_center__1fMlm text__text_overflow_ellipsis__oBcoK margin__margin_bottom_small__3DTkf overflow__overflow_hidden__11tfF behaviour__user_select_none__3I6-P position__pos_relative__qHQkT badge__variant_size_xs_50_sm_25__2017Y badge__badge_primary_semi_rounded__2Vqat badge__base__FlZLA display__display_flex__2f-7x flex__align_items_center__3oW61 flex__justify_content_center__k46Dm badge__shape_set_semi_rounded_large__1mhlZ borders__border_radius_semi_rounded_large__VKGN8 badge__color_set_primary_border__1tZfK color__color_brand_primary__fw5mt colors__bg_color_brand_base_0__1268q borders__border_width_default__38AIO borders__border_style_default__1y50J shared__state_set_default__2MzXL cursor__cursor_pointer__1qPSx")
    private WebElementFacade audiA1Option;

    @FindBy(className = "field_row__field_row_container__p74Go margin__margin_bottom_xxlarge__T4G2X text__text_align_left__3pLSB")
    private WebElementFacade vehicleModelSeriesArea;

    //TODO: Add additional Selectors for each available car make Model Series
    @FindBy(className = "badge__root__REBSg text__text_align_center__1fMlm text__text_overflow_ellipsis__oBcoK margin__margin_bottom_small__3DTkf overflow__overflow_hidden__11tfF behaviour__user_select_none__3I6-P position__pos_relative__qHQkT badge__variant_size_xs_100_sm_100__ZqW5J badge__badge_primary_semi_rounded__2Vqat badge__base__FlZLA display__display_flex__2f-7x flex__align_items_center__3oW61 flex__justify_content_center__k46Dm badge__shape_set_semi_rounded_large__1mhlZ borders__border_radius_semi_rounded_large__VKGN8 badge__color_set_primary_border__1tZfK color__color_brand_primary__fw5mt colors__bg_color_brand_base_0__1268q borders__border_width_default__38AIO borders__border_style_default__1y50J shared__state_set_default__2MzXL cursor__cursor_pointer__1qPSx")
    private WebElementFacade audioModelSeries30TFSIGB;







    @Step public void enterVehicleRegistrationNumber() {
        if (!vehicleRegistrationNumber.isVisible()) {
            clickOn(vehicleRegistrationNumber);
            typeInto(vehicleRegistrationNumber, "qqx321");
            clickOn(vehicleRegistrationNextButton);
        }
        vehicleRegistrationNumber.waitUntilVisible();
    }

    @Step public void selectVehicleRegistrationState() {
        if (!vehicleRegistrationStateArea.isVisible()) {
            clickOn(nswStateOptionButton);
        }
        vehicleRegistrationStateArea.waitUntilVisible();
    }

    @Step public void selectVehicleMake() {
        if (!vehicleMakeArea.isVisible()) {
            clickOn(audiMakeoptionButton);
        }
        vehicleMakeArea.waitUntilVisible();
    }

    @Step public void selectVehicleMakeYear() {
        if (!vehicleMakeYearArea.isVisible()) {
            clickOn(vehicleMakeYear2020Option);
        }
        vehicleMakeYearArea.waitUntilVisible();
    }

    @Step public void selectVehicleModel() {
        if (!vehicleModelArea.isVisible()) {
            clickOn(audiA1Option);
        }
        vehicleModelArea.waitUntilVisible();
    }

    @Step public void selectVehicleModelSeries() {
        if (!vehicleModelSeriesArea.isVisible()) {
            clickOn(audioModelSeries30TFSIGB);
        }
        vehicleModelSeriesArea.waitUntilVisible();
    }

}

