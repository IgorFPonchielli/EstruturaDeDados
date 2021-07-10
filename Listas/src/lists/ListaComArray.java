package lists;

public class ListaComArray<T> implements Lista<T> {

	private T[] array;
	private boolean resizable;
	private int initialCapacity;
	private int counter;
	private int X = 7;
	
	public ListaComArray() {
		this(10);
	}

	public ListaComArray(int initialCapacity) {
		this(initialCapacity, true);
	}

	public ListaComArray(int initialCapacity, boolean resizable) {
		this.initialCapacity = initialCapacity;
		this.resizable = resizable;
		this.counter = 0;
		this.array = (T[]) new Object[initialCapacity];
	}
	
	
	public void add(T elemento) {
		this.array[counter] = elemento;
		counter++;
		
		if(resizable && counter == array.length) {
			resizeArrayList();
		}
	}
	
	public void add(int index, T elemento) {
		
		if (index < counter && index >= 0) {
						
			T elementoAtual = this.array[index];	
			this.array[index] = elemento;
			
		    for (int i = index + 1; i < counter; i++) {		    	
		    	T tmp = elementoAtual;
		    	elementoAtual = this.array[i];
		        this.array[i] = tmp;		       
		    }
		    
		    if(resizable) {
		    	this.add(elementoAtual);
		    }
		}
		
	}
	
	private void resizeArrayList() {
		T[] arrayResize = (T[]) new Object[this.array.length + X];
        for (int i = 0; i < this.array.length; i++)
        	arrayResize[i] = this.array[i];
        this.array = arrayResize;
	}
	
	public void clear() {
		if(resizable) {
			this.array = (T[]) new Object[initialCapacity];
		} else {
			this.array = (T[]) new Object[counter];
		}
		this.counter = 0;		
	}
	
	public int size() {
		return counter;
	}
	public boolean isEmpty() {
		return counter == 0;
	}
	
	public boolean isFull() {
		return counter == this.array.length;
	}
	
	public T remove(int index) {
		
		for (int i = index; i < counter; i++) {
			this.array[i] = this.array[i + 1]; 
		}
		
		return this.array[index];
	}
	
	public boolean removeFirst(T elemento) {
		
		for (int i = 0; i < counter; i++) {
			if (this.array[i] == elemento) {
				this.remove(i);
				return true;
			}
		}
		return false;
		
	}
	
	public T get(int index) {
		return this.array[index];
	}
	
	public T set(int index, T elemento) {
		
		T elementoAtual = this.array[index];
		
		this.array[index] = elemento;		
		return elementoAtual;
	}
	
	public boolean contains(T elemento) {
		for (int i = 0; i < counter; i++) {
			if(this.array[i] == elemento) {
				return true;
			}			
		}
		return false;
	}
	
	public int indexOf(T elemento) {
		int index = -1;		
			for (int i = 0; i < counter; i++) {
				if(this.array[i] == elemento) {
					return index = i;
				}
			}		
		
		return index;
	}
	
	public int lastIndexOf(T elemento) {
		int index = -1;		
		for (int i = counter; i >= 0; i--) {
			if(this.array[i] == elemento) {
				return index = i;
			}
		}		
	
	return index;
	}
	
	public T[] toArray() {
		return array;
		
	}
	
}
