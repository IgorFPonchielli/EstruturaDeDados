
public class Main {

	public static void main(String[] args) {
		
		ArvoreComArray<String> arvore = new ArvoreComArray<>(2);
		
		
		System.out.println("Altura Atual: " + arvore.getAlturaAtual());
		System.out.println("Qtd Max de Nós: " + arvore.getQuantidadeMaxNos());
		
		arvore.insere("A");
		arvore.insere("B");
		arvore.insere("C");
		
		arvore.insere("F", 2, false);
		arvore.insere("B1", 1, true);
		
		arvore.insere("D");
		
		System.out.println("Arvore: " + arvore.toString());
		
		arvore.liberarRecursos();

	}

}
