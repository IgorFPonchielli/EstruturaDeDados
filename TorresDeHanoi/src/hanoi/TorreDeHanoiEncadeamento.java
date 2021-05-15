package hanoi;

import java.util.Scanner;

import pilha.PilhaLista;
import pilha.PilhaVetor;

public class TorreDeHanoiEncadeamento extends MenuTorreDeHanoi {

	private static int nDiscos = 5;
	private static PilhaLista<Integer>[] torre = new PilhaLista[3];

	public static void jogarTorreDeHanoi() {
		torre[0] = new PilhaLista<Integer>();
		torre[1] = new PilhaLista<Integer>();
		torre[2] = new PilhaLista<Integer>();

		initTorreA();
		iniciarJogo();
	}

	private static void initTorreA() {
		for (int i = nDiscos; i > 0; i--) {
			try {
				torre[0].push(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void mover(PilhaLista<Integer> torreOrigem, PilhaLista<Integer> torreDestino) throws Exception {
		int discoMovido = 0;
		if (!torreOrigem.vazia()) {
			if (torreDestino.vazia()) {
				discoMovido = torreOrigem.pop();

			} else if (torreOrigem.top() < torreDestino.top() || torreDestino.top() == null) {
				discoMovido = torreOrigem.pop();
			}
		}

		if (discoMovido == 0) {
			errorMessage();
		} else {
			torreDestino.push(discoMovido);
		}
	}

	private static void errorMessage() {
		System.out.println("\n----- Operação Invalida! -----\n");
	}

	private static void iniciarJogo() {

		Scanner scanner = new Scanner(System.in);
		PilhaLista<Integer> torreOrigem = null;
		PilhaLista<Integer> torreDestino = null;
		boolean torreInvalida;
		while (!vitoria()) {
			do {
				display();
				System.out.println("Mover disco da torre:");
				torreOrigem = selecionaTorre(scanner.next());
				System.out.println("para a torre: ");
				torreDestino = selecionaTorre(scanner.next());
				torreInvalida = (torreOrigem == null || torreDestino == null);

				if (torreInvalida) {
					errorMessage();
				}

			} while (torreInvalida);

			try {
				mover(torreOrigem, torreDestino);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		display();
		System.out.println("\n# Parabens você venceu! #");
	}

	private static boolean vitoria() {

		if (torre[0].vazia() && (torre[1].vazia() || torre[2].vazia())) {
			return true;
		}

		return false;
	}

	private static PilhaLista<Integer> selecionaTorre(String torreOpcao) {

		switch (torreOpcao) {
		case "A":
			return torre[0];
		case "B":
			return torre[1];
		case "C":
			return torre[2];
		default:
			break;
		}
		return null;
	}

	private static void display() {
		System.out.println("-------------------");
		for (int i = 0; i < nDiscos; i++){
			String A = " ", B = " ", C = " ";

			try {
				A = String.valueOf(torre[0].getIndex(i));
			} catch (Exception e) {
				A = "_";
			}
			try {
				B = String.valueOf(torre[1].getIndex(i));
			} catch (Exception e) {
				B = "_";
			}
			try {
				C = String.valueOf(torre[2].getIndex(i));
			} catch (Exception e) {
				C = "_";
			}
			System.out.println("|  " + A + "  |  " + B + "  |  " + C + "  |");
		}

		System.out.println("-------------------");
		System.out.println("|  A  |  B  |  C  |");
		System.out.println("\n");
	}

}
