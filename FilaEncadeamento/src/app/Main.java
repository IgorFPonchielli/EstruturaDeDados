package app;

import classes.FilaLista;

public class Main {

	public static void main(String[] args) {
		
		FilaLista fila = new FilaLista();
		
		fila.insere(0);		
		fila.insere(1);
		fila.insere(2);
		fila.insere(3);	
		fila.insere(4);
		fila.insere(9);
		fila.insere(6);
		fila.insere(7);
		fila.insere(8);
		fila.insere(9);
		
		fila.retira();
		fila.retira();
		fila.retira();
		
		//fila.libera();
		
		fila.insere(7);
		fila.insere(9);

			for (int i = 0; i < fila.toArray().length; i++) {
				System.out.println(fila.toArray()[i]);
			}
			
	}

}


