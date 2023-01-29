package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class QualitydemyStepdefinitions {
    QualitydemyPage qualitydemyPage=new QualitydemyPage();
    @Then("ilk sayfa login linkine click yapar")
    public void ilk_sayfa_login_linkine_click_yapar() {
        qualitydemyPage.ilkLoginLinki.click();
    }

    @Then("kullanici kutusuna {string} yazar")
    public void kullanici_kutusuna_yazar(String istenenUsername) {
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty(istenenUsername));
    }

    @Then("password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String istenenPassword) {
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty(istenenPassword));
    }

    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        qualitydemyPage.loginButonu.click();
    }

    @Then("basarili giris yapildigini test eder")
    public void basarili_giris_yapildigini_test_eder() {
        Assert.assertTrue(qualitydemyPage.basariliGirisCoursesLinki.isDisplayed());
    }

    @And("basarili giris yapilamadigini test eder")
    public void basariliGirisYapilamadiginiTestEder() {
        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());
    }

    @Then("cookie varsa kabul eder")
    public void cookieVarsaKabulEder() {
        if (qualitydemyPage.cookie.isDisplayed()){
            qualitydemyPage.cookie.click();
        }
    }

    @And("kullanici kutusuna manuel olarak {string} yazar")
    public void kullaniciKutusunaManuelOlarakYazar(String username) {
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(username);
    }

    @And("password kutusuna manuel olarak {string} yazar")
    public void passwordKutusunaManuelOlarakYazar(String password) {
        qualitydemyPage.passwordKutusu.sendKeys(password);
    }

    @Then("qd arama kutusuna {string} yazip gonderir")
    public void qdAramaKutusunaYazipGonderir(String aratilacakKelime) {
        qualitydemyPage.aramaKutusu.sendKeys(aratilacakKelime+ Keys.ENTER);
    }

    @When("java kursunu secerek sepete ekler")
    public void javaKursunuSecerekSepeteEkler() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();
        ReusableMethods.bekle(3);
        actions.click(qualitydemyPage.ucAylikJavaKursu).perform();
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(1);
        actions.click(qualitydemyPage.addWislistButton).perform();
    }

    @Then("urunun sepete eklendigi test edilir")
    public void urununSepeteEklendigiTestEdilir() {
        Assert.assertTrue(qualitydemyPage.addedWishlistButton.isDisplayed());
    }


    @Then("urunu listeden cikarir")
    public void urunuListedenCikarir() {
        ReusableMethods.bekle(2);
        qualitydemyPage.addedWishlistButton.click();
    }

    @When("urunun listeden cikarildigi test eder")
    public void urununListedenCikarildigiTestEder() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(qualitydemyPage.addWislistButton.isDisplayed());
    }
}
