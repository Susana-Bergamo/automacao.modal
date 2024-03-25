package iniciar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.ModalPages;
import runner.Executa;

public class IniciarTeste {

	Executa executa = new Executa();
	ModalPages page = new ModalPages();

	@Before
	public void abrirNavegador() {
		executa.iniciarTeste();
	}

	 @After
	 public void fecharNavegor() {
	 executa.finalizarTeste();
	 }

	@Test
	public void smallModal() throws InterruptedException {
		page.modalPequeno();
	}

	@Test
	public void largeModal() throws InterruptedException {
		page.modalGrande();
	}
	
}
