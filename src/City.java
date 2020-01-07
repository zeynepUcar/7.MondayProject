import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class City {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/AKMERCAN/Desktop/Selenium/Chrome Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://test-basqar.mersys.io/");

        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//a[@aria-label='dismiss cookie message']")).click();

        driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys("admin");

        driver.findElement(By.xpath("//input[@id='mat-input-3']")).sendKeys("admin");


        driver.findElement(By.xpath("//button[@color='accent']")).click();



        WebDriverWait wait= new WebDriverWait(driver,10);

        WebElement setup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='nav-link-title ng-tns-c27-13 ng-star-inserted']")));
        setup.click();


        WebElement parameters = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Parameters']")));
        parameters.click();

        WebElement cities = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Cities']")));
        cities.click();

        WebElement plusSign = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-icon='plus']")));
        plusSign.click();

        WebElement nameOfCity=driver.findElement(By.xpath("//input[@id='ms-text-field-1']"));
        String cityName= "Mersin";
        nameOfCity.sendKeys(cityName);

        WebElement countyDrop = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@aria-label='Country']")));
        countyDrop.click();

        WebElement choiseOfCounty = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' Turkey ']")));
        choiseOfCounty.click();

        WebElement saveButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Save')]")));
        saveButton.click();

        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ms-text-field-0']")));
        searchBox.click();
        searchBox.sendKeys(cityName);

        WebElement searchClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' Search ']")));
        searchClick.click();

//        WebElement editButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("tbody > tr:first-child [data-icon='edit']")));
//        editButton.click();

        WebElement editClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector( "tbody > tr:first-child ms-edit-button" )));
        editClick.click();




    }
}
