package registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageManager extends HomePage {
    public WebDriver driver;
    public StringBuffer verificationErrors = new StringBuffer();
    private PageManager page;
    private HomePage homePage = new HomePage();



    public void closePopup() {
        driver.findElement(By.xpath("//div[@id='app']/div/div/div/button")).click();
    }

    public void enter() {
        driver.findElement(By.xpath("//div[@id='app']/div/div/div/div[2]/div/span")).click();
    }

    public void register() {
        driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div/form/button")).click();
    }

    public void checkConsent() {
        driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div/form/div/label/span")).click();
    }

    public void confirmPassword() {
        driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div/form/label[3]/input")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div/form/label[3]/input")).clear();
        driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div/form/label[3]/input")).sendKeys("Test123");
    }

    public void fillPassword() {
        driver.findElement(By.xpath("//input[@type='password']")).click();
        driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test123");
    }

    public void fillEmailField() {
        driver.findElement(By.xpath("//input[@type='text']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).clear();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("al-tysevi4@yandex.ru");
    }

    public void saveResume() {
        driver.findElement(By.xpath("//div[@id='app']/div/main/div/div/div/div/div/div[3]/div/button[2]/span")).click();
    }

    public void clickEducationNextButton() {
        driver.findElement(By.xpath("//div[@id='app']/div/main/div/div/div/div/div/div[3]/div/button[2]/span")).click();
    }

    public void clickNextButton() {
        driver.findElement(By.xpath("//div[@id='app']/div/main/div/div/div/div/div/div[3]/div/button/span")).click();
    }

    public void tellAboutYourself() {
        driver.findElement(By.xpath("//div[@id='app']/div/main/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/form/div[3]/div/div/div/div/div/textarea")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/main/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/form/div[3]/div/div/div/div/div/textarea")).clear();
        driver.findElement(By.xpath("//div[@id='app']/div/main/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/form/div[3]/div/div/div/div/div/textarea")).sendKeys("10");
    }

    public void fillTelegram() {
        driver.findElement(By.xpath("//div[3]/div/div[2]/div/div/input")).click();
        driver.findElement(By.xpath("//div[3]/div/div[2]/div/div/input")).clear();
        driver.findElement(By.xpath("//div[3]/div/div[2]/div/div/input")).sendKeys("9");
    }

    public void fillSkype() {
        driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/input")).click();
        driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/input")).clear();
        driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/input")).sendKeys("8");
    }

    public void fillPhone() {
        driver.findElement(By.xpath("//div[2]/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[2]/div/div/div/div/input")).clear();
        driver.findElement(By.xpath("//div[2]/div/div/div/div/input")).sendKeys("7");
    }

    public void fillEmail() {
        driver.findElement(By.xpath("//div[2]/div/div/input")).click();
        driver.findElement(By.xpath("//div[2]/div/div/input")).clear();
        driver.findElement(By.xpath("//div[2]/div/div/input")).sendKeys("6");
    }

    public void fillCityName() {
        driver.findElement(By.xpath("//div[2]/div/div/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[2]/div/div/div/div/div/div/input")).clear();
        driver.findElement(By.xpath("//div[2]/div/div/div/div/div/div/input")).sendKeys("5");
    }

    public void fillSecondName() {
        driver.findElement(By.xpath("//div[3]/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[3]/div/div/div/input")).clear();
        driver.findElement(By.xpath("//div[3]/div/div/div/input")).sendKeys("4");
    }

    public void fillLastName() {
        driver.findElement(By.xpath("//div[@id='app']/div/main/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/form/div/div/div[2]/div/div/div")).click();
        driver.findElement(By.xpath("//div[2]/div/div/div/input")).clear();
        driver.findElement(By.xpath("//div[2]/div/div/div/input")).sendKeys("3");
    }

    public void fillFirstName() {
        driver.findElement(By.xpath("//div/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//div/div/div/div/div/input")).clear();
        driver.findElement(By.xpath("//div/div/div/div/div/input")).sendKeys("2");
    }

    public void fillResumeTitle() {
        driver.findElement(By.xpath("//div[@id='app']/div/main/div/div/div/div/div/div/div/form/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/main/div/div/div/div/div/div/div/form/div/div/div/div/input")).clear();
        driver.findElement(By.xpath("//div[@id='app']/div/main/div/div/div/div/div/div/div/form/div/div/div/div/input")).sendKeys("1");
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public void initRegistration() {
        driver.findElement(By.xpath("//div[@id='app']/div/header/div/div/div/button[2]")).click();
    }

    public void getTheSource() {
        driver.get("http://resumesimple.dev.hsworld.ru/");
    }

    public void goToResumeConstructor() throws InterruptedException {
        driver.findElement(By.linkText("Конструктор резюме")).click();
        Thread.sleep(10000);
    }

    public void signIn() throws InterruptedException {
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).clear();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("al-tysevi4@yandex.ru");
        driver.findElement(By.xpath("//input[@type='password']")).click();
        driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test123");
        driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div/form/button")).click();
        Thread.sleep(3000);
    }

    public void goToHomePage() {
        driver.get("http://resumesimple.dev.hsworld.ru/home");
    }
}
