package MergeSort;

public class mergesort {

	public static int[] Ordenar(int[] vetor) {
		merge(vetor, 0, vetor.length - 1);
		return vetor;
	}

	private static void merge(int[] vetor, int inicio, int fim) {

		int meio;
		if (inicio < fim) {
			meio = (inicio + fim) / 2;
			merge(vetor, inicio, meio);
			merge(vetor, meio + 1, fim);
			intercala(vetor, inicio, meio, fim);
		}

	}

	private static void intercala(int[] vetor, int inicio, int meio, int fim) {

		int temp[] = new int[vetor.length];
		int inicioEsquerda = inicio; // primeiro indice do lado esquedo da divicao
		int inicioDireita = meio + 1; // primeiro indice do lado direito da divicao
		int posLivre = inicio;

		while (inicioEsquerda <= meio && inicioDireita <= fim) {
			if (vetor[inicioEsquerda] <= vetor[inicioDireita]) {
				temp[posLivre] = vetor[inicioEsquerda];
				inicioEsquerda = inicioEsquerda + 1;
			} else {
				temp[posLivre] = vetor[inicioDireita];
				inicioDireita = inicioDireita + 1;
			}
			posLivre = posLivre + 1;
		}

		// se ainda houver numeros no primeira metado vetor
		// que não foram intercalados
		for (int i = inicioEsquerda; i <= meio; i++) {
			temp[posLivre] = vetor[i];
			posLivre = posLivre + 1;
		}

		// se ainda houver numeros no segunda metado vetor
		// que não foram intercalados
		for (int i = inicioDireita; i <= fim; i++) {
			temp[posLivre] = vetor[i];
			posLivre = posLivre + 1;
		}
		
		//retorna os valores do vetor temporario ao vetor principal
		for (int i = inicio; i <= fim; i++) {
			vetor[i] = temp[i];
		}

	}

}
