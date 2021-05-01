package pilha;

public interface Pilha {
	
	public void push(int v) throws Exception;
	
	public int pop() throws Exception;
	
	public int top() throws Exception;
	
	public boolean vazia();
	
	public void libera();
	
}
