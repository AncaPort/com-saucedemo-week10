import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Project-4 - ProjectName : com-saucedemo
 * BaseUrl = https://www.saucedemo.com/
 * 1. Setup Multi browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Navigate to baseUrl
 * 11. Refresh the page.
 * 12. Close the browser.
 */
public class MultiBrowser {

    static String browser = "firefox";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        //1. Setup Multi browser.
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new ChromeDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        //2. Open URL.
        driver.get(baseUrl);

        //3. Print the title of the page.
        System.out.println("The title of the page : " + driver.getTitle());

        //4. Print the current url.
        System.out.println("The current url : " + driver.getCurrentUrl());

        //5. Print the page source.
        System.out.println("The page source is : " + driver.getPageSource());

        //6. Enter the email to email field.
        driver.findElement(By.id("user-name")).sendKeys("visual_user");

        //7. Enter the password to password field.
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //8. Click on Login Button.
        driver.findElement(By.id("login-button")).click();

        //9. Print the current url.
        System.out.println("The current url: " + driver.getCurrentUrl());

        //10. Navigate to baseUrl
        driver.navigate().back();

        //11. Refresh the page.
        driver.navigate().refresh();

        //12. Close the browser.
        driver.quit();
    }

}
