import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ContentPage extends PageFactory {

    @FindBy(css = "[class*='gb-header__content']")
    private WebElement header;

    @FindBy(css = "[class='site-footer__content']")
    private WebElement footer;

    @FindBy(css = "[id=\"top-menu\"] h2")
    private WebElement namePage;

    @FindBy(css = "[class=\"gb-empopup-close\"]")
    private WebElement buttonClosePopUp1;

    @FindBy(css = "button [class=\"svg-icon icon-popup-close-button \"]")
    private WebElement buttonClosePopUp2;



    @FindBy(css = "[id=\"nav\"] [href=\"/courses\"]")
    private WebElement buttonCourses;

    @FindBy(css = "[id = \"cour-link\"][href = \"#cour-new\"]")
    private WebElement buttoncourses2;

    @FindBy(xpath = "//*[@id=\"filter-0\"]")
    private WebElement freecourses;


    @FindBy(xpath = "//*[@id=\"filter-9\"]")
    private WebElement freecoursestesting;

    @FindBy(xpath = ".//*[text()='Тестирование ПО. Уровень 1']")
    private WebElement testing1;

    @FindBy(xpath = ".//*[text()='Тестирование ПО. Уровень 2']")
    private WebElement testing2;





    private Navigation navigation;
    private WebDriver driver;

    public ContentPage(WebDriver driver) {
        initElements(driver, this);
        navigation = new Navigation(driver);
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public void checkNamePage(String expectedNamePage) {
        Assertions.assertEquals(expectedNamePage, namePage.getText());

    }








    public WebElement getButtonClosePopUp1() {
        return buttonClosePopUp1;
    }

    public WebElement getButtonClosePopUp2() {
        return buttonClosePopUp2;
    }

    public WebElement getHeader() {
        return header;
    }

    public WebElement getFooter() {
        return footer;
    }
}