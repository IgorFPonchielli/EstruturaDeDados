package BubbleSort;

public class bubbleSort {

	public static int[] Ordenar(int[] vetor) {

		int n = vetor.length;

		for (int i = n - 1; i != 0; i--) {
			boolean troca = false;
			for (int j = 0; j != i; j++) {
				if (vetor[j] > vetor[j + 1]) {
					int temp = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = temp;
					troca = true;
				}
			}
			if (!troca) {
				return vetor;
			}
		}
		return vetor;
	}

	public static int[] OrdenarRecursivo(int[] vetor) {
		return OrdenarRecursivo(vetor.length, vetor);

	}

	private static int[] OrdenarRecursivo(int n, int[] vetor) {

		int j;
		boolean troca = false;

		for (j = 0; j != n - 1; j++) {
			if (vetor[j] > vetor[j + 1]) {
				int temp = vetor[j];
				vetor[j] = vetor[j + 1];
				vetor[j + 1] = temp;
				troca = true;
			}
		}
		if (troca) {
			OrdenarRecursivo(n - 1, vetor);
		}

		return vetor;

	}

}
