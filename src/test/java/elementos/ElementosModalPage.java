package elementos;

import org.openqa.selenium.By;

public class ElementosModalPage {
	
	public By btnSmall = By.id("showSmallModal");
	public By btnLarge = By.id("showLargeModal");
	public By btnFecharSmall = By.id("closeSmallModal");
	public By btnFecharLarge = By.id("closeLargeModal");
	public By msgSmall = By.xpath("//div[text()='This is a small modal. It has very less content']");
	public By msgLarge = By.xpath("//p[@class]");
	
	
	
}
