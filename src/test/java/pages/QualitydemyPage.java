package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitydemyPage {
   public QualitydemyPage(){
       PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy(id="login-email")
    public WebElement kullaniciEmailKutusu;

    @FindBy(id="login-password")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButonu;

    @FindBy(linkText = "My courses")
    public WebElement basariliGirisCoursesLinki;

    @FindBy(xpath = "//a[text()='Accept']")
    public WebElement cookie;

    @FindBy(xpath = "//*[@placeholder='Search for courses']")
    public WebElement aramaKutusu;

    @FindBy(xpath = "(//a[@class='course-title'])[5]")
    public WebElement ucAylikJavaKursu;

    @FindBy(xpath = "//button[@onclick='handleAddToWishlist(this)']")
    public WebElement addWislistButton;

    @FindBy(xpath = "//*[@class='btn btn-add-wishlist active']")
    public WebElement addedWishlistButton;


}
