package app;

import pilha.PilhaLista;
import pilha.PilhaVetor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		PilhaLista<Integer> pilha = new PilhaLista<Integer>();
		//PilhaVetor<Integer> pilha = new PilhaVetor<Integer>(5);
		
        pilha.push(15);
        pilha.push(30);
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
        System.out.println("Topo: "+pilha.top());
				
	}
	
}
