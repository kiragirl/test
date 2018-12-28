package datastructure.hash;


public class QuadraticProbingHashTable<AnyType> {
	private static final int DEFAULT_TABLE_SIZE = 101;

	private HashEntry<AnyType>[] array; // The array of elements
	private int occupied; // The number of occupied cells
	private int theSize; // Current size

	private static class HashEntry<AnyType> {
		public AnyType element;
		public boolean isActive;

		public HashEntry(AnyType x) {
			this(x, true);
		}

		public HashEntry(AnyType x, boolean active) {
			this.element = x;
			this.isActive = active;
		}
	}

	public QuadraticProbingHashTable() {
		this(DEFAULT_TABLE_SIZE);
	}

	public QuadraticProbingHashTable(int size) {
		allocateArray(size);
		makeEmpty();
	}

	public void insert(AnyType x) {
		int currentPos = findPos(x);
		if (isActive(currentPos)) {
			return;
		}
		array[currentPos] = new HashEntry(x);
		if (theSize > array.length / 2) {
			rehash();
		}
	}

	public void remove(AnyType x) {
		int currentPos = findPos(x);
		if (isActive(currentPos)) {
			array[currentPos].isActive = false;
		}
	}

	public boolean contains(AnyType x) {
		return isActive(findPos(x));
	}

	public void makeEmpty() {
		theSize = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = null;
		}
	}

	@SuppressWarnings("unchecked")
	private void rehash() {
		HashEntry<AnyType>[] oldArray = array;
		allocateArray(nextPrime(2*oldArray.length));
		theSize = 0;
		for(int i =0; i<oldArray.length;i++)
			if (oldArray[i] != null && oldArray[i].isActive) {
				insert(oldArray[i].element);
			}
	}

	private int myhash(AnyType x) {
		int hashVal = x.hashCode();

		hashVal %= array.length;
		if (hashVal < 0)
			hashVal += array.length;

		return hashVal;
	}

	/**
	 * Internal method to find a prime number at least as large as n.
	 * 
	 * @param n
	 *            the starting number (must be positive).
	 * @return a prime number larger than or equal to n.
	 */
	private static int nextPrime(int n) {
		if (n % 2 == 0)
			n++;

		for (; !isPrime(n); n += 2)
			;

		return n;
	}

	/**
	 * Internal method to test if a number is prime. Not an efficient algorithm.
	 * 
	 * @param n
	 *            the number to test.
	 * @return the result of the test.
	 */
	private static boolean isPrime(int n) {
		if (n == 2 || n == 3)
			return true;

		if (n == 1 || n % 2 == 0)
			return false;

		for (int i = 3; i * i <= n; i += 2)
			if (n % i == 0)
				return false;

		return true;
	}

	private boolean isActive(int currentPos) {
		return array[currentPos] != null && array[currentPos].isActive;
	}

	private int findPos(AnyType x) {
		int offset = 1;
		int cuurentPos = myhash(x);
		while (array[cuurentPos] != null && !array[cuurentPos].element.equals(x)) {
			cuurentPos += offset;
			offset += 2;
			if (cuurentPos >= array.length) {
				cuurentPos -= array.length;
			}
		}
		return cuurentPos;
	}

	@SuppressWarnings("unchecked")
	private void allocateArray(int arraySize) {
		array = new HashEntry[nextPrime(arraySize)];
	}
}
