package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepdefinitions {

    GooglePage googlePage = new GooglePage();
    String paraDegeri="";
    @Given("Kullanici google sayfasina gider")
    public void kullanici_google_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
    }

    @Then("Kullanici cookies i kabul eder")
    public void kullanici_cookies_i_kabul_eder() {
        googlePage.googleCookiesAccept.click();
    }

    @Then("Arama Kutusuna karsilastirma yapmak istedigi para birimlerini girer")
    public void arama_kutusuna_karsilastirma_yapmak_istedigi_para_birimlerini_girer() {
        googlePage.googleAramaKutusu.sendKeys("Euro to Dollar"+ Keys.ENTER);
    }

    @Then("Para birimlerinin karsilastirmasini alir")
    public void para_birimlerinin_karsilastirmasini_alir() {
       paraDegeri = googlePage.karsilastirilanDeger.getText();
        System.out.println("Para Degeri: "+paraDegeri);

    }


    @And("Verilen degerlerin ikiden kucuk oldugunu dogrular")
    public void verilenDegerlerinIkidenKucukOldugunuDogrular() {
        paraDegeri=paraDegeri.replace(",",".");
        Assert.assertTrue(Double.parseDouble(paraDegeri)<2.0);
    }

    @Then("Arama Kutusuna karsilastirma yapmak istedigi para birimlerini girer{int}")
    public void aramaKutusunaKarsilastirmaYapmakIstedigiParaBirimleriniGirer(int arg0) {
        googlePage.googleAramaKutusu.sendKeys("Dollar to Euro"+ Keys.ENTER);
    }
}
