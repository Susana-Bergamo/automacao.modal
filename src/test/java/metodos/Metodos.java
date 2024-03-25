package metodos;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import drivers.Drivers;

public class Metodos extends Drivers {

	public void clicar(By elemento, String passo) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());
		}
	}
		
	public void validarTexto(By element, String textoEsperado, String passo) {
		try {
			assertTrue(driver.findElement(element).getText().contains(textoEsperado));
		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());
		}
	}
	
	public void prtscn(String nomeDoArquivo) {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./evidencias/modal/" + nomeDoArquivo +".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
