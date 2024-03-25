package pages;

import elementos.ElementosModalPage;
import metodos.Metodos;

public class ModalPages {
	
	ElementosModalPage elemento = new ElementosModalPage();
	Metodos metodos = new Metodos ();
	
	public  void modalPequeno() throws InterruptedException {
		metodos.clicar(elemento.btnSmall, "Clicando no botão Small Modal");
		Thread.sleep(3000);
		metodos.prtscn("Small Modal");
		metodos.validarTexto(elemento.msgSmall,"This is a small modal. It has very less content", "Validando texto modal pequeno");
		metodos.clicar(elemento.btnFecharSmall, "Fechando small modal" );
	}

	public void modalGrande() throws InterruptedException {
		metodos.clicar(elemento.btnLarge, "Clicando no notão Large Modal");
		Thread.sleep(3000);
		metodos.prtscn("Large Modal");
		metodos.validarTexto(elemento.msgLarge, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.", "Validando texto modal grande.");
		metodos.clicar(elemento.btnFecharLarge, "Fechando large modal");
			
		}
	}
	
	

