import java.util.Arrays;

public class ArvoreComArray<T> {

	private int h;
	private int counter = 0;
	private T[] array;

	public ArvoreComArray(int h) {
		this.h = h;
		this.array = (T[]) new Object[getQuantidadeMaxNos()];
	}

	public boolean insere(T value) {

		for (int i = 0; i < getQuantidadeMaxNos(); i++) {
			if (this.array[i] == null) {
				this.array[i] = value;
				counter++;
				return true;
			}
		}

		return false;
	}

	public boolean insere(T value, int posPai, boolean sobrescrever) {
		int filhoE = (posPai * 2) + 1;
		int filhoD = (posPai * 2) + 2;

		if (this.array[posPai] != null) {
			if (!sobrescrever) {
				if (this.array[filhoE] == null) {
					this.array[filhoE] = value;
				} else {
					this.array[filhoD] = value;
				}
			} else {
				this.array[posPai] = value;
			}
			counter++;
			return true;
		}
		return false;
	}

	public boolean vazia() {
		return array[0] == null;
	}

	public boolean cheia() {
		return counter == getQuantidadeMaxNos();
	}

	public boolean pertence(T value) {
		
		for (int i = 0; i < getQuantidadeMaxNos(); i++) {
			if (this.array[i] == value) {
				return true;
			}
		}
		return false;
	}

	public int getQuantidadeMaxNos() {
		return (int) (Math.pow(2, h + 1) - 1);
	}

	public int getAlturaAtual() {
		return h;
	}

	public void liberarRecursos() {
		this.array = (T[]) new Object[getQuantidadeMaxNos()];
		counter = 0;
	}

	@Override
	public String toString() {
		return toStringPreOrdem();
	}

	private String toStringPorNivel() {
		return "";
	}

	private String toStringPreOrdem() {
		String s = new String("");
		return s;
	}

	private String toStringOrdem() {
		return "";
	}

	private String toStringPosOrdem() {
		return "";
	}

}
