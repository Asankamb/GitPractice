import com.guru99.demo.HomeFactoryPage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.PageFactory;
import utils.TestApp;

public class MyStepdefs {

    HomeFactoryPage homePage;
    @Given("user is on Mercury Home Page -->Register Page")
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToUrl();
        homePage= PageFactory.initElements(TestApp.getInstance().getDriver(),HomeFactoryPage.class);
        homePage.clickOnRegisterMenu();
    }
}
