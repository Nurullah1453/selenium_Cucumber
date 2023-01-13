package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniversityPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Set;

public class WebUniversityStepdefinitions {
    WebUniversityPage webUniversityPage=new WebUniversityPage();
    String ilkSayfaWHD;

    @Then("Login Portal elementine kadar asagi iner")
    public void login_portal_elementine_kadar_asagi_iner() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }
    @Then("Login Portal a tiklar")
    public void login_portal_a_tiklar() {
        ilkSayfaWHD=Driver.getDriver().getWindowHandle();
        webUniversityPage.loginPortalButonu.click();

    }
    @Then("Acilan yeni window a gecer")
    public void acilan_yeni_window_a_gecer() {
        //yeni window acilmadan ilk sayfanın window handle degerini kaydetmeliyiz

        Set<String> windowHandlesSeti = Driver.getDriver().getWindowHandles();

        String ikinciSayfaWHD="";

        for (String each:windowHandlesSeti
             ) {
            if (!each.equals(ilkSayfaWHD)){
                ikinciSayfaWHD=each;
            }
        }

        Driver.getDriver().switchTo().window(ikinciSayfaWHD);

    }
    @Then("username kutusuna deger yazar")
    public void username_kutusuna_deger_yazar() {
        webUniversityPage.userNameKutusu.sendKeys(ConfigReader.getProperty("wduUsernameDeger"));
    }
    @Then("password kutusuna deger yazar")
    public void password_kutusuna_deger_yazar() {
        webUniversityPage.passwordKutusu.sendKeys(ConfigReader.getProperty("wduPasswordDeger"));
    }
    @Then("webUniversity login butonuna basar")
    public void web_university_login_butonuna_basar() {
        webUniversityPage.loginButonu.click();
    }
    @Then("Popup’ta cikan yazinin validation failed oldugunu test eder")
    public void popup_ta_cikan_yazinin_validation_failed_oldugunu_test_eder() {
        String actualYazı=Driver.getDriver().switchTo().alert().getText();
        String expectedYazı="validation failed";
        Assert.assertTrue(actualYazı.equals(expectedYazı));

    }
    @Then("Ok diyerek Popup’i kapatir")
    public void ok_diyerek_popup_i_kapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }
    @Then("Ilk sayfaya geri doner")
    public void ılk_sayfaya_geri_doner() {
        Driver.getDriver().switchTo().window(ilkSayfaWHD);
    }
    @Then("Ilk sayfaya donuldugunu test eder")
    public void ılk_sayfaya_donuldugunu_test_eder() {
        Assert.assertTrue(webUniversityPage.contactUsLinki.isDisplayed());
    }

}
