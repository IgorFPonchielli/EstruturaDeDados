package app;

import hanoi.TorreDeHanoiEncadeamento;
import hanoi.TorreDeHanoiVetor;
import pilha.PilhaLista;
import pilha.PilhaVetor;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println(" _______                        ");
		System.out.println("|__   __|___  _ __  _ __ ___ ");
		System.out.println("   | |  / _ \\| '__/| '__/ _ \\");
		System.out.println("   | | | (_) | |   | | /  __/");
		System.out.println("   |_|  \\___/|_|   |_| \\____|");		
		System.out.println("	     _      ");
		System.out.println("	  __| | ___ ");
		System.out.println("	 / _` |/ _ \\");
		System.out.println("	| (_| |  __/");
		System.out.println("	 \\__,_|\\___|");		
		System.out.println("		 _   _                   _ ");
		System.out.println("		| |_| | __ _ _ __   ___ (_)");
		System.out.println("		|  _  |/ _` | '_ \\ / _ \\| |");
		System.out.println("		| | | | (_| | | | | (_) | |");
		System.out.println("		|_| |_|\\__,_|_| |_|\\___/|_|");
		
		if (args[0].equals("contigua")) {
			TorreDeHanoiVetor.jogarTorreDeHanoi();
		}
		
		if (args[0].equals("dinamica")) {
			TorreDeHanoiEncadeamento.jogarTorreDeHanoi();
		}
		
		if (args[0].equals("sobre")) {
			System.out.println("\nNomes:");
			System.out.println("Igor Ponchielli e Rafael Lenzi");
		}

				
		//PilhaLista<Integer> pilha = new PilhaLista<Integer>();
		/*PilhaVetor<Integer> pilha = new PilhaVetor<Integer>(5);
		
        pilha.push(11);
        pilha.push(32);
        pilha.push(73);
        pilha.push(74);
        pilha.push(75);
        System.out.println("Removido: "+pilha.pop());
        System.out.println("Removido: "+pilha.pop());
        pilha.push(10);
        System.out.println("Topo: "+pilha.top());
        System.out.println("Removido: "+pilha.pop());
        System.out.println("Removido: "+pilha.pop());
        pilha.push(30);
        pilha.libera();
        pilha.push(16);
        pilha.push(15);
        System.out.println("Topo: "+pilha.top());*/
				
	}
	
}
