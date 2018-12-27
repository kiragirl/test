package datastructure.tree;

import datastructure.UnderflowException;

public class BinarySearchTree<T extends Comparable<? super T>> {

	private static class BinaryNode<T> {
		T e;
		BinaryNode<T> left;
		BinaryNode<T> right;

		BinaryNode(T e) {
			this(e, null, null);
		}

		BinaryNode(T e, BinaryNode r, BinaryNode l) {
			this.e = e;
			this.left = l;
			this.right = r;
		}
	}

	private BinaryNode<T> root;

	public BinarySearchTree() {
		root = null;
	}

	public void makeEmpty() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public boolean contains(T e) {
		return contains(e, root);
	}

	public T findMin() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		return findMin(root).e;
	}

	public T findMax() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		return findMax(root).e;
	}

	public void insert(T e) {
		root = insert(e, root);
	}

	public void remove(T e) {
		root = remove(e, root);
	}

	public void printTree() {
		printTree(root);
	}

	private boolean contains(T e, BinaryNode<T> root) {
		if (root == null) {
			return false;
		}
		int compareResult = e.compareTo(root.e);
		if (compareResult < 0) {
			return contains(e, root.left);
		} else if (compareResult > 0) {
			return contains(e, root.right);
		} else {
			return true;
		}

	}

	private BinaryNode<T> findMin(BinaryNode<T> root) {
		if (root == null) {
			return null;
		} else if (root.left == null) {
			return root;
		}
		return findMin(root.left);
	}

	private BinaryNode<T> findMax(BinaryNode<T> root) {
		if (root != null) {
			while (root.right != null) {
				root = root.right;
			}
		}
		return root;
	}

	private BinaryNode<T> insert(T e, BinaryNode<T> root) {
		if (e == null) {
			return new BinaryNode<T>(e);
		}
		int compareResult = e.compareTo(root.e);
		if (compareResult < 0) {
			insert(e, root.left);
		} else if (compareResult > 0) {
			insert(e, root.right);
		}
		return root;
	}

	private BinaryNode<T> remove(T e, BinaryNode<T> root) {
		if (root == null) {
			return root;
		}
		int compareResult = e.compareTo(root.e);
		if (compareResult < 0) {
			remove(e, root.left);
		} else if (compareResult > 0) {
			remove(e, root.right);
		} else if (root.left != null && root.right != null) {
			root.e = findMin(root).e;
			root.right = remove(e, root);
		} else {
			root = root.left != null ? root.left : root.right;
		}
		return root;
	}

	private void printTree(BinaryNode<T> root) {

	}
}
