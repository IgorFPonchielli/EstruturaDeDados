package classes;

public class FilaLista implements Fila {

	private NoLista ini;
	private NoLista fim;
	private int counter;
	
	public FilaLista() {
		FilaLista(null, null);
	}
	
	private void FilaLista(Object object, Object object2) {
		// TODO Auto-generated method stub
		
	}

	public FilaLista(NoLista ini, NoLista fim) {
		this.ini = null;
		this.fim = null;
	}

	@Override
	public void insere(Integer elemento) {
		
		NoLista temp = new NoLista(elemento, null);
		
		if (this.vazia()) {
			ini = temp;
			fim = temp;
			counter++;
			
		} else if (ini.equals(fim)){
			fim = temp;
			ini.setProx(fim);
			counter++;
			
		} else {
			fim.setProx(temp);
			fim = temp;
			fim.setProx(null);
			counter++;
		}
	}

	@Override
	public Integer retira() {
		
		NoLista temp = ini;
		ini = ini.getProx();
		
		counter--;
		
		return temp.getInfo();
	}

	@Override
	public boolean vazia() {		
		return this.ini == null && this.fim == null;
	}

	@Override
	public void libera() {
		this.ini = null;
		this.fim = null;	
		
		counter = 0;
	}
	
	public int size() {
		return counter;
	}
	
	public Integer[] toArray() {

		Integer[] array = new Integer[size()];

		int index = 0;

		for (NoLista i = ini; i != null; i = i.getProx()) {
			array[index++] = i.getInfo();
		}

		return array;
	}

}
