package pilha;

public class PilhaLista<T>  implements Pilha<T> {
	
	private NoLista topo;

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
		
	}
		
	@Override
	public String toString() {
		return "PilhaLista [topo=" + topo + "]";
	}
	
	
	
}
