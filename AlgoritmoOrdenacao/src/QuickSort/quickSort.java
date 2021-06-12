package QuickSort;

public class quickSort {

	public static int[] Ordenar(int[] vetor) {
		
		quicksort(vetor, 0, vetor.length - 1);
		
		return vetor;
	}
	
	private static void troca(int[] vetor, int i, int j) {
		int temp = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = temp;
	}
	
	private static int divicao(int[] vetor, int pivo, int tam) {
		
		int i = pivo - 1;
		int j = tam + 1;
		pivo = vetor[(pivo + tam)/2];
		
		while(i < j) {
			do {
				j = j - 1;
			} while (vetor[j] > pivo);
			do {
				i = i + 1;
			} while (vetor[i] < pivo);
			if (i < j) {
				troca(vetor, i, j);
			}
		}
		return j;
	}
	
	private static void quicksort(int[] vetor, int pivo, int tam) {
		
		int divicao;
		
		if (pivo < tam) {
			divicao = divicao(vetor, pivo, tam);
			quicksort(vetor, pivo, divicao);
			quicksort(vetor, divicao + 1, tam);
		}
	}
}
