package pilha;

public class PilhaLista  implements Pilha {
	
	private NoLista topo;

	public PilhaLista() {
		this.topo = null;
	}
	
	@Override
	public void push(int v) throws Exception {
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
	public int pop() throws Exception {		
		if (topo == null) {
            throw new Exception("Não há itens na pilha");
        }
        int v = topo.getInfo();
        topo = topo.getProx();
        return v;
	}

	@Override
	public int top() throws Exception {
		if (topo == null) {
            throw new Exception("Não há itens na pilha");
        }
		return topo.getInfo();
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
