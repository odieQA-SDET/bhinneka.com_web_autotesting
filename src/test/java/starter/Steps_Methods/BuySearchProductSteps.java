package starter.Steps_Methods;

import starter.Pages_Object.BuySearchProductObject;

public class BuySearchProductSteps {
    BuySearchProductObject HomeProductPages;

    public void inputProduct() {
        HomeProductPages.inputProductLaptop();
    }
    public void openDetailProductPage() {
        HomeProductPages.clickCardsProducts();
    }
    public void setProduct() {
        HomeProductPages.setInputadd();
    }
    public void clickTambahKeranjangbutton() {
        HomeProductPages.clickKeranjangTambah();
    }
    public void popupberhasiltambahkeranjang() {
        HomeProductPages.Popupvisible();
    }
    public void clickLanjutkeKeranjang() {
        HomeProductPages.clickAlertLanjutKeranjang();
    }
    public void CartKeranjangBelanja() {
        HomeProductPages.KeranjangBelanjaPages();
    }
    public void clickMenuTreeIcon() {
        HomeProductPages.clickmenuTreeIcon();
    }
    public void clickMainCategory(){
        HomeProductPages.ClickMaincategory();
    }
    public void clickprintersub() {
        HomeProductPages.ClickPrinterSubCategory();
    }
    public void clickboxmerek() {
        HomeProductPages.ClickBoxMerek();
    }
    public void clickboxlokasi() {
        HomeProductPages.ClickBoxLokasi();
    }

    public void inputharga() {
        HomeProductPages.InputHarga();
    }



    public void openproductpagedetail() {
        HomeProductPages.OpenProductPageDetail();
    }

    public void clicktambahkeranjangcategory() {
        HomeProductPages.ClickTambahKeranjangCategory();
    }
    public void popuplanjutkeranjangcategory() {
        HomeProductPages.PopUplanjutkeranjangcategory();
    }

    public void clicklanjutkeranjangcategory() {
        HomeProductPages.ClickLanjutKeranjangCategory();
    }

    public void Cartcategoryfilter() {
        HomeProductPages.CartCategoryFilter();
    }

    public void backtohomepage() {
        HomeProductPages.BackToHomePage();
    }

    public void imageflashsale() {
        HomeProductPages.ImageFlashSale();
    }

    public void clickedlihatsemuabutton() {
        HomeProductPages.ClickedLihatSemuaButton();
    }

    public void clickedtissueimage() {
        HomeProductPages.ClickedTissueImage();
    }

    public void clickedtbhkekeranjang() {
        HomeProductPages.ClickedTbhKeKeranjang();
    }

    public void popuptampilberhasil() {
        HomeProductPages.PopUpTampilBerhasil();
    }

    public void clickedlanjutkekeranjang() {
        HomeProductPages.ClickedLanjutKeKeranjang();
    }

    public void keranjangbelanjaflashsale() {
        HomeProductPages.KeranjangBelanjaFlashSale();
    }

    public void ultramilkflashsale() {
        HomeProductPages.UltraMilkFlashSale();
    }

    public void tambahkekekeranjangbutton() {
        HomeProductPages.TambahkeKeranjang();
    }

    public void pupupboxbelanjasuccess() {
        HomeProductPages.PopUpBelanjaSuccess();
    }

    public void clikedlanjutkeKeranjang() {
        HomeProductPages.ClickedLanjutKeranjang();
    }

    public void endtestingscriptbelanja() {
        HomeProductPages.EndTestingScriptBelanja();
    }

}
