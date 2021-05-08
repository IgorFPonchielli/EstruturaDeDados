package hanoi;

import java.util.Scanner;

import pilha.PilhaVetor;

public class TorreDeHanoiVetor extends MenuTorreDeHanoi {

	private static int nDiscos = 5;
	private static PilhaVetor<Integer>[] torre = new PilhaVetor[3];

	public static void jogarTorreDeHanoi() {
		torre[0] = new PilhaVetor<Integer>(nDiscos);
		torre[1] = new PilhaVetor<Integer>(nDiscos);
		torre[2] = new PilhaVetor<Integer>(nDiscos);

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

	private static void mover(PilhaVetor<Integer> torreOrigem, PilhaVetor<Integer> torreDestino) throws Exception {
		int discoMovido = 0;
		if (!torreOrigem.vazia()) {
			if (torreDestino.vazia()) {
				discoMovido = torreOrigem.pop();

			} else if (torreOrigem.top() < torreDestino.top()) {
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
		PilhaVetor<Integer> torreOrigem = null;
		PilhaVetor<Integer> torreDestino = null;
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

	private static PilhaVetor<Integer> selecionaTorre(String torreOpcao) {

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
		System.out.println("\n#### --- TORRE DE HANOI --- ####");
		for (int i = nDiscos - 1; i >= 0; i--) {
			String A = " ", B = " ", C = " ";
			try {
				A = String.valueOf(torre[0].getIndex(i));
				if (A.equals("null")) {
					A = "_";
				}
				;
			} catch (Exception e) {
			}
			try {
				B = String.valueOf(torre[1].getIndex(i));
				if (B.equals("null")) {
					B = "_";
				}
				;
			} catch (Exception e) {
			}
			try {
				C = String.valueOf(torre[2].getIndex(i));
				if (C.equals("null")) {
					C = "_";
				}
				;
			} catch (Exception e) {
			}
			System.out.println("  " + A + "  |  " + B + "  |  " + C);
		}

		System.out.println("---------------");
		System.out.println("  A  |  B  |  C");
		System.out.println("\n");
	}

}
