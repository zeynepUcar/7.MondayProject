import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mersys2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/AKMERCAN/Desktop/Selenium/Chrome Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://test-basqar.mersys.io/");
        driver.manage().window().maximize();

//Got it
        driver.findElement(By.xpath("//a[@aria-label='dismiss cookie message']")).click();
        Thread.sleep(1000);
        //Login
        driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("admin");
        driver.findElement(By.xpath("//button[@color='accent']")).click();

        Thread.sleep(2000);

        //Setup
        driver.findElement(By.xpath("//span[@class='nav-link-title ng-tns-c27-13 ng-star-inserted']")).click();
        Thread.sleep(1000);

        //Parameters
        driver.findElement(By.xpath("//span[@class='nav-link-title ng-tns-c27-14 ng-star-inserted']")).click();
        Thread.sleep(1000);

        //Nationatiles
        driver.findElement(By.xpath("//span[text()='Nationalities']")).click();
        Thread.sleep(1000);

        //Add New
        driver.findElement(By.xpath("//button[@class='mat-mini-fab mat-button-base mat-accent']")).click();
        Thread.sleep(1000);

        //Writing name
        driver.findElement(By.xpath("//input[@id='ms-text-field-1']")).sendKeys("Zeynep");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(1000);

        //Search
        driver.findElement(By.xpath("//ms-text-field[@placeholder='GENERAL.FIELD.NAME']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='ms-text-field-0']")).sendKeys("Zeynep");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@color='accent']")).click();
        Thread.sleep(1000);

        //Edit
        driver.findElement(By.xpath("//button[@class='mat-button mat-button-base mat-accent ng-star-inserted']")).click();
        Thread.sleep(1000);

        //New Name
        driver.findElement(By.xpath("//input[@id='ms-text-field-2']")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='ms-text-field-2']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='ms-text-field-2']")).sendKeys("zucar");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='save-button mat-accent mat-button mat-raised-button mat-button-base ng-star-inserted']")).click();
        Thread.sleep(1000);

        //Yeni Search
        driver.findElement(By.xpath("//input[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-valid ng-dirty ng-touched']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-valid ng-dirty ng-touched']")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-valid ng-dirty ng-touched']")).sendKeys("zucar");
/*    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id='ms-text-field-0']")).sendKeys("Esmeyen");
    Thread.sleep(1000); */
        driver.findElement(By.xpath("//button[@color='accent']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='mat-button mat-button-base mat-warn ng-star-inserted']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='mat-button mat-raised-button mat-button-base mat-accent']")).click();
}}
