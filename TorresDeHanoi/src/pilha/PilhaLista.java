package pilha;

public class PilhaLista<T>  implements Pilha<T> {
	
	private NoLista topo;
	private int counter;

	public PilhaLista() {
		this.topo = null;
	}
	
	@Override
	public void push(T v) throws Exception {
		try {
			NoLista oldTop = topo;
			topo = new NoLista();
			topo.setInfo(v);
			topo.setProx(oldTop);
			counter++;
		} catch (Exception e) {
			throw new Exception("Não foi possivel inserir valor na pilha");
		}
		
	}

	@Override
	public T pop() throws Exception {		
		if (topo == null) {
            throw new Exception("Não há itens na pilha");
        }
        T v = (T) topo.getInfo();
        topo = topo.getProx();
        counter--;
        return v;
	}

	@Override
	public T top() throws Exception {
		if (topo == null) {
            throw new Exception("Não há itens na pilha");
        }
		return (T) topo.getInfo();
	}

	@Override
	public boolean vazia() {
		// TODO Auto-generated method stub
		return (topo == null);
	}

	@Override
	public void libera() {
		this.topo = null;
		this.counter = 0;
		
	}
		
	@Override
	public String toString() {
		return "PilhaLista [topo=" + topo + "]";
	}
	
	public int size() {
		return counter;
	}
	
	public T[] toArray() {

		T[] array = (T[]) new Object[size()];

		int index = 0;

		for (NoLista i = topo; i != null; i = i.getProx()) {
			array[index++] = (T) i.getInfo();
		}
		
		return array;
	}
	
	public T getIndex(int index) {
		return this.toArray()[index];
	}
	
}
