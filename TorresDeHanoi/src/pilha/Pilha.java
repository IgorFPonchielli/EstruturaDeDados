package pilha;

public interface Pilha<T> {
	
	public void push(T v) throws Exception;
	
	public T pop() throws Exception;
	
	public T top() throws Exception;
	
	public boolean vazia();
	
	public void libera();
	
}
