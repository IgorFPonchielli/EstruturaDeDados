package lists;

import lists.NoLista;

public class ListaComEncadeamento<T> implements Lista<T> {

	private NoLista first;
	private NoLista last;
	private int counter;

	public ListaComEncadeamento() {
		this.first = null;
		this.last = null;
		this.counter = 0;
	}

	@Override
	public void add(T obj) {

		NoLista no = new NoLista(obj, null);

		if (first == null) {
			first = no;
		} else {
			this.last.setProx(no);
		}
		last = no;
		counter++;

	}

	public void add(int index, T obj) {

		if (index >= 0 && index <= size()) {

			if (index == size()) {
				add(obj);
			} 
		}
	}

	public void clear() {
		this.first = null;
		this.last = null;
		this.counter = 0;
	}

	public int size() {
		return counter;
	}

	public boolean isEmpty() {
		return (counter == 0);
	}

	public T remove(int index) {
		
		int indexAtual = 0;
		T objRemoved = null;
		
		if (index >= 0 && index <= size()) {			
			for (NoLista i = first; i != null; i = i.getProx()) {
				
                if (index == 0) {
                	this.first = i.getProx();
                	i.setProx(last);                	
                	return (T) i.getInfo();
				}
				                
                if(indexAtual == index){ 
                	for (NoLista j = first; j != null; j = j.getProx()) {
                		if (j.getProx() == i) {
                			j.setProx(i.getProx());
                			break;
                		}
                		if(j.getProx() == i && i.getProx() == null) {
                            	j.setProx(last);
                            	break;
                        }
                	}
                }                                
                indexAtual++;
            } 
        }
		counter--;		
		return objRemoved;
		
	}

	@Override
	public boolean removeFirst(T elemento) {
		for (NoLista i = first; i != null; i = i.getProx()) {
				
				if (this.first.getInfo() == elemento) {
	            	this.first = i.getProx();
	            	i.setProx(last);  
	            	counter--;
	            	return true;
				}
				
	            if (i.getInfo() == elemento) {
	            	for (NoLista j = first; j != null; j = j.getProx()) {
	            		if (j.getProx() == i) {
	            			j.setProx(i.getProx());
	            			counter--;
	            			return true;
	            		}
	            		if(j.getProx() == i && i.getProx() == null) {
	                        	j.setProx(last);
	                        	counter--;
	                        	return true;
	                    }
	            	}
				}
		}
		return false;
	}
	
	public int indexOf(T elemento) {
		int index = 0;
        if (elemento == null) {
        	for (NoLista i = first; i != null; i = i.getProx()) {
                if (i.getInfo() == null) {
                    return index;
                }
                index++;
            }
        } else {
        	for (NoLista i = first; i != null; i = i.getProx()) {
                if (elemento.equals(i.getInfo())) {
                    return index;
                }
                index++;
            }
        }
        return -1;
	}
	
	public int lastIndexOf(T elemento) {
		int index = size();
        if (elemento == null) {
        	for (NoLista i = first; i != null; i = i.getProx()) {
                index--;
                if (i.getInfo() == null) {
                    return index;
                }
            }
        } else {
            for (NoLista i = first; i != null; i = i.getProx()) {
                index--;
                if (elemento.equals(i.getInfo())) {
                    return index;
                }
            }
        }
        return -1;
	}

	public T[] toArray() {

		T[] array = (T[]) new Object[size()];

		int index = 0;

		for (NoLista i = first; i != null; i = i.getProx()) {
			array[index++] = (T) i.getInfo();
		}

		return array;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T set(int index, T elemento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(T elemento) {
		// TODO Auto-generated method stub
		return false;
	}


}
