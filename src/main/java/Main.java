import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Main {
    public static WebDriver driver = new ChromeDriver();
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\min_ok\\IdeaProjects\\TestSel1\\drivers\\chromedriver.exe");

        Duration duration1 = Duration.ofSeconds(10);
        Duration duration2 = Duration.ofSeconds(5);
//        driver.manage().timeouts().implicitlyWait(duration1);

        driver.navigate().to("https://uk.wikipedia.org/");
        driver.manage().window().maximize();
        /*WebElement el6 = driver.findElement(By.xpath("//span[text()='LG']/preceding-sibling::span"));
        el6.click();*/

       /* WebDriverWait wait = new WebDriverWait(driver, duration2);

        WebElement el7 = driver.findElement(By.xpath("//li/a[text()='Electronics']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(el7).build().perform();
        WebElement el8 = driver.findElement(By.xpath("//li/a[text()='Video Games']"));
        el8.click();*/
       /* String wind = driver.getWindowHandle();
        System.out.println(wind);*/

//        driver.navigate().back();
        WebElement el1 = driver.findElement(By.xpath("//input[@type='search']"));
       /* Set<String> windowHandles = driver.getWindowHandles();
        Iterator <String> iter = windowHandles.iterator();
        String parent = iter.next();
        String child = iter.next();*/
        el1.sendKeys(Keys.chord(Keys.SHIFT, "trump"));

//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='mw-heading mw-heading1']")));

//        WebElement el6 = driver.findElement(By.xpath("//div[@class='mw-heading mw-heading1']"));
      /*  el1.click();
        WebElement el2 = driver.findElement(By.xpath("//td/ul/li/a[@title='Портал:Вміст/Огляд']"));
        System.out.println(el2.getText());
        el2.click();
        WebElement el3 = driver.findElement(By.xpath("//input[@type='search']"));
        el3.sendKeys("Trump");
        WebElement el4 = driver.findElement(By.xpath("//input[@type='submit']"));
        el4.submit();
        WebElement el5 = driver.findElement(By.xpath("//input[@name='search']"));
        System.out.println(el5.getAttribute("value"));
        System.out.println("-------------------------------");
        System.out.println(el5.getAttribute("title"));
        el5.clear();*/
        Main m = new Main();
        m.screen();
        el1.sendKeys(Keys.ENTER);
        m.screen();
        driver.quit();

    }

    public void screen() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("hh_mm_ss");
        String fileName = format.format(date) + ".png";
        File file1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(file1, new File(".//screenshot//" + fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
