package Orange.Steps;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import com.ibm.icu.text.SimpleDateFormat;
import net.thucydides.core.annotations.Step;

public class Questions {

    private WebDriver driver;

    public Questions(WebDriver driver) {
        this.driver = driver;
    }


    @Step
    public void screenShot() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String filename = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        File dest = new File("C:\\Users\\blanc\\Documents\\Capturas\\curso\\" + filename + ".png");
        try {
            FileUtils.copyFile(scr, dest);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }

    }

    @Step
    public void tiempoSegundos(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void scrollTable() {
        WebElement table = driver.findElement(By.xpath("//div[@role= 'table']"));
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("arguments[0].scrollIntoView(true)", table);

    }

    public void scrollSearchEmployee(String employee) {
        WebElement table = driver.findElement(By.xpath("//div[@role= 'table']//div[@class = 'oxd-table-body']//div/div//div[text()='" + employee + ""+" "+"']"));
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("arguments[0].scrollIntoView(true)", table);

    }
}