import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MERSYS {

    private static long TimeOut;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/AKMERCAN/Desktop/Selenium/Chrome Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://test-basqar.mersys.io/");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@aria-label='dismiss cookie message']")).click();

        driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='mat-input-3']")).sendKeys("admin");
        driver.findElement(By.xpath("//button[@color='accent']")).click();
        Thread.sleep(1000);

        //click setup
        driver.findElement(By.xpath("//span[@class='nav-link-title ng-tns-c27-13 ng-star-inserted']")).click();
        Thread.sleep(1000);
        //find parameter
        driver.findElement(By.xpath("//span[text()='Parameters']")).click();
        Thread.sleep(1000);
        //find natnionality
        driver.findElement(By.xpath("//span[text()='Nationalities']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(@class,'mat-mini-fab')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='ms-text-field-1']")).sendKeys("zeynep");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@aria-describedby='cdk-describedby-message-8']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='ms-text-field-2']")).sendKeys("ucar"); //just add ucar to zeynep
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@aria-describedby='cdk-describedby-message-13']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()=' Yes ']")).click();

        //searching my name is still here or not

        driver.findElement(By.xpath("//input[@id='ms-text-field-0']")).sendKeys("zeynepucar");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[text()=' Search ']")).click();
        Thread.sleep(1000);

         String zero = driver.findElement(By.xpath("//div[text()='0 of 0']")).getText();
       // String zero = driver.findElement(By.xpath("mat-paginator-range-label")).getText();
        System.out.println(zero);
        Thread.sleep(1000);

        if (zero.equals("0 of 0")){
            System.out.println("there is no username");
        }else {
            System.out.println("sorry you failed");
        }



    }
}
