package App;

import BubbleSort.bubbleSort;
import MergeSort.mergesort;
import QuickSort.quickSort;

public class Main {

	public static void main(String[] args) {
		
		int[] vetor = {15, 5, 7, 8, 2, 3, 1, 12, 0};
		
		//bubbleSort.Ordenar(vetor);
		//bubbleSort.OrdenarRecursivo(vetor);
		//quickSort.Ordenar(vetor);
		//mergesort.Ordenar(vetor);
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		}

	}


}
