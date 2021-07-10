package classes;

public class NoLista {
	
	private Integer info;
	private NoLista prox;
	
	public NoLista() {
		NoLista(null, null);
	}

	private void NoLista(Object object, Object object2) {
		// TODO Auto-generated method stub
		
	}

	public NoLista(Integer info, NoLista prox) {
		this.info = info;
		this.prox = prox;
	}

	public Integer getInfo() {
		return info;
	}

	public void setInfo(Integer info) {
		this.info = info;
	}

	public NoLista getProx() {
		return prox;
	}

	public void setProx(NoLista prox) {
		this.prox = prox;
	}
	
}
