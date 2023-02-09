/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.mycompany;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author swetu
 */
public class MenudrinkTest {
     private WebDriver driver;
    private String baseUrl;
    private JavascriptExecutor js;
    public MenudrinkTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        js = (JavascriptExecutor) driver;
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
         driver.close();
       
    }
    
    @Test
  public void testcoke() throws Exception {
    driver.get("https://www.dominos.com/");
    driver.manage().window().maximize();  
    driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/nav/ul[1]/li[4]/a")).click();
    driver.findElement(By.linkText("Drinks")).click();
    driver.findElement(By.xpath("//*[@id=\"js-categoryArea\"]/section/div/div[1]/a")).click();
  }

   @Test
  public void testcokezero() throws Exception {
    driver.get("https://www.dominos.com/");
    driver.manage().window().maximize();  
    driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/nav/ul[1]/li[4]/a")).click();
    driver.findElement(By.linkText("Drinks")).click();
    driver.findElement(By.xpath("//*[@id=\"js-categoryArea\"]/section/div/div[2]/a")).click();
  }
  
   @Test
  public void testdietcoke() throws Exception {
    driver.get("https://www.dominos.com/");
    driver.manage().window().maximize();  
    driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/nav/ul[1]/li[4]/a")).click();
    driver.findElement(By.linkText("Drinks")).click();
    driver.findElement(By.xpath("//*[@id=\"js-categoryArea\"]/section/div/div[3]/a")).click();
  }
  
   @Test
  public void testsprite() throws Exception {
    driver.get("https://www.dominos.com/");
    driver.manage().window().maximize();  
    driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/nav/ul[1]/li[4]/a")).click();
    driver.findElement(By.linkText("Drinks")).click();
    driver.findElement(By.cssSelector("#js-categoryArea > section > div > div:nth-child(5) > a")).click();
  }
    
     @Test
  public void testwater() throws Exception {
    driver.get("https://www.dominos.com/");
    driver.manage().window().maximize();  
    driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/nav/ul[1]/li[4]/a")).click();
    driver.findElement(By.linkText("Drinks")).click();
    driver.findElement(By.xpath("//*[@id=\"js-categoryArea\"]/section/div/div[5]/a")).click();
  }
    
    @Test
  public void testfanta() throws Exception {
    driver.get("https://www.dominos.com/");
    driver.manage().window().maximize();  
    driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/nav/ul[1]/li[4]/a")).click();
    driver.findElement(By.linkText("Drinks")).click();
     js.executeScript("window.scrollTo(0, 250)");
    driver.findElement(By.xpath("//*[@id=\"js-categoryArea\"]/section/div/div[6]/a")).click();
  }
}
