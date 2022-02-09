package starter.Pages_Object;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuySearchProductObject extends PageObject {

    @FindBy(xpath = "//input[@placeholder = 'Cari produk asli...']")
    WebElement inputLaptop;
    public void inputProductLaptop(){
    inputLaptop.sendKeys("KAIN LAP");
    inputLaptop.sendKeys(Keys.ENTER);
    }

    @FindBy(xpath= "//*[contains(@class, 'css-1reb8g2')]/div/div/a")
    WebElement clickProducts;
    public void clickCardsProducts() {
        clickProducts.click();
    //    JavascriptExecutor executor = (JavascriptExecutor) getDriver();
    //    executor.executeScript("windows.scrollBy(0,1250)");
   /*     JavascriptExecutor executor = (JavascriptExecutor)getDriver();
        executor.executeScript("arguments[0].click()", clickProducts);
*/

    }

    @FindBy(xpath="//*[contains(@class, 'css-obl4w6')]")
    WebElement SetInputMount;
    public void setInputadd() {
        SetInputMount.click();
    }

     @FindBy(xpath="//button[@class='css-1t6w53m'] ")
     WebElement clickkeranjang;
     public void clickKeranjangTambah() {
        clickkeranjang.click();
    }

    @FindBy(xpath = "//div[@class='css-16gw2yf']")
    WebElement popupVisible;
    public void Popupvisible() {
        popupVisible.isDisplayed();
    }

    @FindBy(xpath="//span[normalize-space()='Lanjut ke Keranjang']")
    WebElement clickPopupVisible;
    public void clickAlertLanjutKeranjang() {
        clickPopupVisible.click();
    }

    @FindBy(xpath = "//h1[contains(text(),'Keranjang Belanja')]")
    WebElement cartPages;
    public void KeranjangBelanjaPages() {
        cartPages.getText();
    }

    @FindBy(id = "Layer_1")
    WebElement Menutreeicon;
    public void clickmenuTreeIcon() {
        Menutreeicon.click();
    }

    @FindBy(xpath = "//span[normalize-space()='Office & Store Supplies']")
    WebElement Maincategory;
    public void ClickMaincategory(){
        Maincategory.click();
    }

    @FindBy(xpath = "//div[2]/a[. = 'Printer']")
    WebElement PrinterSubcategory;
    public void ClickPrinterSubCategory() {
        PrinterSubcategory.click();
    }

    @FindBy(xpath = "//*[contains(@class, 'css-1e4fvq')]//span[text()='EPSON']")
    WebElement Clickboxmerek;
    public void ClickBoxMerek() {
        Clickboxmerek.click();
    }

    @FindBy(xpath = "//div[@class='css-1e4fvq e1uu5jkk4']//span[@class='css-1dqm2ay e1uu5jkk35'][contains(text(),'Jakarta Pusat')]")
    WebElement Clickboxlokasi;
    public void ClickBoxLokasi() {
        Clickboxlokasi.isDisplayed();
        Clickboxlokasi.click();
    }

    @FindBy(xpath ="//div[@class='css-79elbk e1uu5jkk0']//div[@class='css-1cj4rh1 e1uu5jkk12']//div[2]//input[1]")
    WebElement Inputharga;
    public void InputHarga() {
      //  Inputharga.clear();
        Inputharga.sendKeys("2500000");
        Inputharga.sendKeys(Keys.ENTER);
    }

    @FindBy(xpath ="//div[@class='css-1reb8g2 e1uu5jkk5']//div[2]//div[1]//a[1]")
    WebElement ProductDetail;
    public void OpenProductPageDetail() {
      //  ProductDetail.isSelected();
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("scroll(12500,0)");
        ProductDetail.click();
    }

    @FindBy(xpath = "//button[@class='css-1t6w53m']")
    WebElement TambahKeranjangButton;
    public void ClickTambahKeranjangCategory() {
        TambahKeranjangButton.click();
    }

    @FindBy(xpath = "//h4[contains(text(),'Produk Berhasil Ditambahkan')]")
    WebElement PopUpBerhasilDitambahkan;
    public void PopUplanjutkeranjangcategory() {
        PopUpBerhasilDitambahkan.getText();
    }

    @FindBy(xpath = "//div[@class='css-1yt4s5m']//button[@class='css-9vi8jg']")
    WebElement ClickLanjut;
    public void ClickLanjutKeranjangCategory() {
        ClickLanjut.click();

    }
    @FindBy(xpath = "//button[@class='css-lurryv']")
    WebElement categorycartfilter;
    public void CartCategoryFilter() {
        categorycartfilter.getText();
    }

    @FindBy(xpath = "//div[@class='css-1c6lmah']//a//img")
    WebElement gotohomepage;
    public void BackToHomePage() {
        gotohomepage.click();
    }

    @FindBy(xpath = "//div[@class='css-ps1hhe']")
    WebElement imageflashsale;
    public void ImageFlashSale() {
        imageflashsale.isDisplayed();
    }

    @FindBy(xpath = "//a[@class='css-1iazn6']")
    WebElement lihatsemuabutton;
    public void ClickedLihatSemuaButton() {
        lihatsemuabutton.click();
    }

    @FindBy(xpath = "//div[@class='css-1reb8g2 e1uu5jkk5']//div[1]//div[1]//a[1]")
    WebElement clickedtissue;
    public void ClickedTissueImage() {
        clickedtissue.click();
    }

    @FindBy(xpath = "//button[@class='css-1t6w53m']")
    WebElement clickedkekeranjang;
    public void ClickedTbhKeKeranjang() {
        clickedkekeranjang.click();
    }

    @FindBy(xpath = "//h4[contains(text(),'Produk Berhasil Ditambahkan')]")
    WebElement pupuptampil;
    public void PopUpTampilBerhasil() {
        pupuptampil.getText();
    }

    @FindBy(xpath = "//div[@class='css-1yt4s5m']//button[@class='css-9vi8jg']")
    WebElement clickedlanjut;
    public void ClickedLanjutKeKeranjang() {
        clickedlanjut.click();
    }

    @FindBy(xpath = "//h1[contains(text(),'Keranjang Belanja')]")
    WebElement keranjangflashsale;
    public void KeranjangBelanjaFlashSale() {
        keranjangflashsale.getText();
    }

    @FindBy(xpath = "//div[@class='css-18899pv']//div[6]//a[1]")
    WebElement ultramilk;
    public void UltraMilkFlashSale() {
        ultramilk.click();
    }

    @FindBy(xpath = "//button[@class='css-1t6w53m']")
    WebElement tambahkeKeranjang;
    public void TambahkeKeranjang() {
        tambahkeKeranjang.click();
    }

    @FindBy(xpath = "//h4[contains(text(),'Produk Berhasil Ditambahkan')]")
    WebElement pupupsuccess;
    public void PopUpBelanjaSuccess() {
        pupupsuccess.getText();
    }

    @FindBy(xpath = "//div[@class='css-1yt4s5m']//button[@class='css-9vi8jg']")
    WebElement lanjutkekeranjang;
    public void ClickedLanjutKeranjang() {
        lanjutkekeranjang.click();

    }

    @FindBy(xpath = "//h1[contains(text(),'Keranjang Belanja')]")
    WebElement endtampilcart;
    public void EndTestingScriptBelanja() {
        endtampilcart.isDisplayed();
    }


}


