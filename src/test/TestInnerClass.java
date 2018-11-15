package test;

import java.util.Iterator;

public class TestInnerClass <T>implements Iterable<T>{
	private int size;
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	class ArrayListIterator implements Iterator{

		@Override
		public boolean hasNext() {
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return null;
		}
	}
}
class ArrayListIterator implements Iterator{

	@Override
	public boolean hasNext() {
		
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}
}