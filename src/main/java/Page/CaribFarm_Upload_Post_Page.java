package Page;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class CaribFarm_Upload_Post_Page extends PageObjectManager {

    private String addPost = "community.farmer.caribfarm:id/main_item_add_post";
    private String addNewPost = "android.widget.TextView";
    private String descriptionBox = "community.farmer.caribfarm:id/descriptionEt";
    private String imageUpload = "community.farmer.caribfarm:id/pickImageFab";
    private String gallery = "//android.widget.TextView[@text='Gallery']";
    private String image = "android.view.View";
    private String upload = "community.farmer.caribfarm:id/uploadBtn";

    public CaribFarm_Upload_Post_Page(WebDriver driver) {
        super(driver);
    }

    public void clickAddPost() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        isElementDisplayed("id", addPost);
        clickElement("id", addPost);
    }

    public void verifyAddNewPost(String add_new_post) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        isElementDisplayed("classname", addNewPost);
        Assert.assertEquals(getElement("classname", addNewPost).getText(), add_new_post);
    }


    public void enterDescription(String description) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        isElementDisplayed("id", descriptionBox);
        SendKeysToInputField("id", descriptionBox, description);
    }

    public void imageUpload() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        isElementDisplayed("id", imageUpload);
        clickElement("id", imageUpload);
    }

    public void clickGallery() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        isElementDisplayed("xpath", gallery);
        clickElement("xpath", gallery);
    }

    public void selectImage() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickElement("classname", image);
    }

    public void upload(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickElement("id", upload);
    }
}



