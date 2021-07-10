package app;

import lists.ListaComArray;

public class Main {

	public static void main(String[] args) {
		
		ListaComArray<Integer> lista = new ListaComArray<>();
		
		lista.add(0);		
		lista.add(1);
		lista.add(2);
		lista.add(3);	
		lista.add(4);
		lista.add(9);
		lista.add(6);
		lista.add(7);
		lista.add(8);
		lista.add(9);
		
		lista.add(9, 100);

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

	}

}
