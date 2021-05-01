package pilha;
import java.util.Arrays;

public class PilhaVetor<T> implements Pilha<T> {

	private int n;
	private int tam;
	private T[] vet;
		
	public PilhaVetor(int tamanho) {
		this.tam = tamanho;
		this.n = -1;
		this.vet = (T[]) new Object [this.tam];
	}
	@Override
	public void push(T v) throws Exception {
		try {
			n++;
			this.vet[n] = v;
		} catch (Exception e) {
			throw new Exception("Não foi possivel inserir valor na pilha");
		}
		
	}
	@Override
	public T pop() throws Exception {
		if (n == -1) {
            throw new Exception("Não há itens na pilha");
        }
        T v = this.vet[n];
        this.vet[n] = this.vet[n + 1];
        n--;
        return v;
	}
	@Override
	public T top() throws Exception {
		return this.vet[n];
	}
	@Override
	public boolean vazia() {		
		return (n == -1);
	}
	@Override
	public void libera() {
		this.vet = (T[]) new Object [tam];	
		n = -1;		
		
	}
	@Override
	public String toString() {
		return "PilhaVetor [n=" + n + ", tam=" + tam + ", vet=" + Arrays.toString(vet) + "]";
	}
		
}
