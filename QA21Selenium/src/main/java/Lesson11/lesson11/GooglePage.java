package Lesson11.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends Page {
  @FindBy(name = "q")
  WebElement q;

  @FindBy(id="result-stats")
  WebElement result;

  private String url;

  public void setUrl(String url) {
    this.url = url;
  }

  public GooglePage(WebDriver webDriver) {
    super(webDriver);
  }

  public String getInfo(String text){
    webDriver.get(this.url);
    //q = webDriver.findElement(By.name("q"));
    q.sendKeys(text);
    q.submit();
    //result = webDriver.findElement(By.id("result-stats"));
    return result.getText();
  }
}
