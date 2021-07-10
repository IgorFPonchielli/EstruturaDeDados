package lists;

public interface Lista<T> {
	
	public void add(T elemento);

	public void add(int index, T elemento);

	public T remove(int index);

	public boolean removeFirst(T elemento);

	public T get(int index);

	public void clear();

	public T set(int index, T elemento);

	public int size();

	public boolean isEmpty();

	public boolean contains(T elemento);

	public int indexOf(T elemento);

	public int lastIndexOf(T elemento);

	public T[] toArray();
}
