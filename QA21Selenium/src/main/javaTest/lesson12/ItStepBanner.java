package lesson12;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ItStepBanner extends Page {

  @FindBy(xpath = "//*[@id=\"academy_page\"]/div[6]/div[1]/div[1]/div/div/h3")
  private WebElement h3;

  @FindBy(id="form-demo__fio")
  private WebElement fio;

  @FindBy(id="form-demo__email")
  private WebElement email;

  @FindBy(id="form-demo__phone")
  private WebElement phone;

  @FindBy(name = "SiteForm[policy]")
  private WebElement checkbox;

  @FindBy(xpath = "//*[@id=\"demo_form\"]/button")
  private WebElement btn;

  private String url;

  public void setUrl(String url) {
    this.url = url;
  }

  public ItStepBanner(WebDriver webDriver) {
    super(webDriver);
  }


  public String checkH3(){
    webDriver.get(url);
    WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofMinutes(5));
    WebElement until = wait.until(webDriver -> h3);
    return until.getText();
  }

  public void fillInputs(String fio, String email, String phone){
    webDriver.get(url);
    this.fio.sendKeys(fio);
    this.email.sendKeys(email);
    this.phone.sendKeys(phone);
    this.checkbox.click();
    this.btn.click();
  }


}
