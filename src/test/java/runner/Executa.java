package runner;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executa extends Drivers{
	
	public  void iniciarTeste() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/modal-dialogs");
		driver.manage().window().maximize();
	}
	
	public  void finalizarTeste() {
		driver.quit();
	}

}
