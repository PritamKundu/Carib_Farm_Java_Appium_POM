package Test;
import Base.Base;
import Page.CaribFarm_Post_Page;
import Page.CaribFarm_Upload_Post_Page;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class CaribFarm_Upload_Post_Test extends Base {
    Base base = new Base();
    CaribFarm_Upload_Post_Page upload_post;
    CaribFarm_Post_Page post;

    public CaribFarm_Upload_Post_Test() throws MalformedURLException, InterruptedException {
        base.setDriver();
        upload_post = new CaribFarm_Upload_Post_Page(Base.driver);
        post = new CaribFarm_Post_Page(Base.driver);
            post.enterEmail("mehew76780@xegge.com");
            post.enterPassword("1@2#3$4%");
            post.clickLogIn();
    }

    @Test(priority = 1)
    public void verifyAddPost_Button() throws MalformedURLException, InterruptedException {
        upload_post.clickAddPost();
    }

    @Test(priority = 2)
    public void verifyAddNewPost_Text() throws InterruptedException {
        upload_post.verifyAddNewPost("Add New Post");
    }

    @Test(priority = 3)
    public void verifyDescription() throws InterruptedException {
        upload_post.enterDescription("Farming");
    }

    @Test(priority = 4)
    public void verifyImage_Upload() throws InterruptedException {
        upload_post.imageUpload();
    }

    @Test(priority = 5)
    public void verifyGallery() throws InterruptedException {
        upload_post.clickGallery();
    }

    @Test(priority = 6)
    public void selectImage() throws InterruptedException {
        upload_post.selectImage();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        upload_post.selectImage();
    }

    @Test(priority = 7)
    public void clickUpload() throws InterruptedException {
        upload_post.upload();
    }
}




