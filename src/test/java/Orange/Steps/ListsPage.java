package Orange.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ListsPage {

    private WebDriver driver;

    public ListsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void listJobTitle(String jobTitle) {
        Actions actions = new Actions(driver);
        WebElement jobList = driver.findElement(By.xpath("//form/div[1]/div/div[6]/div/div[2]/div/div/div[2]"));
        actions.moveToElement(jobList).click().build().perform();

        WebElement selectJob = jobList.findElement(By.xpath("//*[text()='"+jobTitle+"']"));
        selectJob.isEnabled();
        selectJob.click();
    }

}
