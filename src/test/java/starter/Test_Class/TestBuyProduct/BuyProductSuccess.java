package starter.Test_Class.TestBuyProduct;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps_Methods.BuySearchProductSteps;

public class BuyProductSuccess {
    @Steps
    BuySearchProductSteps buySteps;

    @When("I have inputed {string} at search product")
    public void iHaveInputedAtSearchProduct(String string) {

            buySteps.inputProduct();
    }


    @When("I have selected and clicked the {string} that I need")
    public void i_have_selected_and_clicked_the_product_that_I_need(String string) {
        // Write code here that turns the phrase above into concrete actions
        buySteps.openDetailProductPage();

    }

    @When("I went to detail product page")
    public void i_went_to_detail_product_page() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I have set {string} the mount of product that I bought")
    public void iHaveSetClickaddTheMountOfProductThatIBought(String string) {
        buySteps.setProduct();
    }


    @When("I clicked {string} button in detail page of cart")
    public void i_clicked_button_in_detail_page_of_cart(String string) {
        // Write code here that turns the phrase above into concrete actions
        buySteps.clickTambahKeranjangbutton();

    }

    @When("I clicked {string} button on pop up box of Tambahkan ke keranjang")
    public void i_Clicked_button_on_pop_up_box_of_Tambahkan_ke_keranjang(String string) {
        // Write code here that turns the phrase above into concrete actions
        buySteps.popupberhasiltambahkeranjang();
        buySteps.clickLanjutkeKeranjang();
    }

    @When("I went to keranjang belanja page")
    public void iWentToKeranjangBelanjaPage() {
        buySteps.CartKeranjangBelanja();
    }

    @When("I clicked Mouseover {string} button Icon to buy category based")
    public void iClickedMouseoverMenuTreeButtonIconToBuyCategoryBased(String string) {
        buySteps.clickMenuTreeIcon();
    }

    @When("I cLicked {string} maincategory")
    public void iCLickedOfficeStoreSuppliesMaincategory(String string) {
        buySteps.clickMainCategory();
    }

    @When("I choosen and clicked {string} subcategory")
    public void iChoosenAndClickedPrinterSubcategory(String string) {
        buySteps.clickprintersub();
    }

    @When("I clicked {string} radio button of the filter of Merek")
    public void iClickedEPSONRadioButtonOfTheFilterOfMerek(String string) {
        buySteps.clickboxmerek();
    }

    @When("I clicked {string} radio button of the filter of Lokasi")
    public void iClickedJakartaPusatRadioButtonOfTheFilterOfLokasi(String string) {
        buySteps.clickboxlokasi();
    }

    @When("I inputed {string} box of the filter of Harga with Maximum Price")
    public void iInputedBoxOfTheFilterOfHargaWithMaximumPrice(String string) {
          buySteps.inputharga();
    }

    @When("I clicked the {string} that I filtered")
    public void iClickedTheProductThatIFiltered(String string) {
        buySteps.openproductpagedetail();
    }

    @When("I went to detail product page next")
    public void iWentToDetailProductPageNext() {

    }

    @When("I clicked {string} button in detail page")
    public void iClickedTambahKeKeranjangButtonInDetailPage(String string) {
        buySteps.clicktambahkeranjangcategory();
    }

    @When("I clicked {string} button on pop up box of keranjang")
    public void iClickedKembaliBelanjaAtauLanjutKeKeranjangButtonOnPopUpBoxOfKeranjang(String string) {
        buySteps.popuplanjutkeranjangcategory();
        buySteps.clicklanjutkeranjangcategory();
    }

    @When("I went to keranjang belanja category based by filter")
    public void iWentToKeranjangBelanjaCategoryBasedByFilter() {
        buySteps.Cartcategoryfilter();
    }

    @When("I clicked {string} Icon to buy flash sale products")
    public void iClickedLogoOfBHINNEKAIconToBuyFlashSaleProducts(String string) {
        buySteps.backtohomepage();
        buySteps.imageflashsale();
    }

    @When("I cLicked {string} button of flash sale")
    public void iCLickedLihatSemuaButtonOfFlashSale() {
        buySteps.clickedlihatsemuabutton();
    }

    @When("I choosen and clicked {string} Image")
    public void iChoosenAndClickedTissueImage() {
        buySteps.clickedtissueimage();
    }

    @When("I clicked {string} button in detail page of Tissue")
    public void iClickedTambahKeKeranjangButtonInDetailPageOftissue() {
        buySteps.clickedtbhkekeranjang();
    }

    @When("I clicked {string} button of pop up box to checkout")
    public void iClickedKembaliBelanjaAtauLanjutKeKeranjangButtonOfPopUpBoxToCheckout() {
        buySteps.popuptampilberhasil();
        buySteps.clickedlanjutkekeranjang();
    }

    @When("I went to keranjang belanja flash sale based")
    public void iWentToKeranjangBelanjaFlashSaleBased() {
        buySteps.keranjangbelanjaflashsale();
    }

    @When("I choosen and clicked {string} Image of flash sale")
    public void iChoosenAndClickedUltraMilkImageOfFlashSale() {
        buySteps.ultramilkflashsale();
    }

    @When("I clicked {string} button in detail page of Ultra Milk")
    public void iClickedTambahKeKeranjangButtonInDetailPageOfUltraMilk() {
        buySteps.tambahkekekeranjangbutton();
    }

    @When("I clicked {string} button of pop up box")
    public void iClickedKembaliBelanjaAtauLanjutKeKeranjangButtonOfPopUpBox() {
        buySteps.pupupboxbelanjasuccess();
        buySteps.clikedlanjutkeKeranjang();
    }

    @And("I went to keranjang belanja flash sale based more")
    public void iWentToKeranjangBelanjaFlashSaleBasedMore() {
        buySteps.endtestingscriptbelanja();
    }

    @Then("I got the Stop Testing of Document Requirement Based and Logout")
    public void iGotTheStopTestingOfDocumentRequirementBasedAndLogout() {

    }
}