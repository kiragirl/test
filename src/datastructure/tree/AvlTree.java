package datastructure.tree;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class AvlTree<AnyType extends Comparable<? super AnyType>> {
	private static final int ALLOWED_IMBALANCE = 1;

	private static class AvLNode<AnyType> {
		AnyType element;
		AvLNode<AnyType> left;
		AvLNode<AnyType> right;
		int height;

		AvLNode(AnyType node) {
			this(node, null, null);
		}

		AvLNode(AnyType node, AvLNode<AnyType> lt, AvLNode<AnyType> rt) {
			this.element = node;
			this.left = lt;
			this.right = rt;
		}

	}

	private int height(AvLNode<AnyType> t) {
		return t == null ? -1 : t.height;
	}

	private AvLNode<AnyType> node;

	public int getHeight() {
		return this.height(node);
	}
	
	public void remove(AnyType x){
		remove(x,this.node);
	}
	public void insert(AnyType x){
		
	}
	private AvLNode<AnyType> insert(AnyType x, AvLNode<AnyType> t) {
		if (t == null) {
			return new AvLNode<AnyType>(x);
		}
		int comPareResult = x.compareTo(t.element);
		if (comPareResult < 0) {
			t.left = insert(x, t.left);
		} else if (comPareResult > 0) {
			t.right = insert(x, t.right);
		}
		return balance(t);
	}

	private AvLNode<AnyType> balance(AvLNode<AnyType> t) {
		if (t == null) {
			return t;
		}
		if (height(t.left) - height(t.right) > ALLOWED_IMBALANCE) {
			if (height(t.left.left) >= height(t.left.right)) {
				t = rotateWithLeftChild(t);
			} else {
				t = doubelWithLeftChild(t);
			}
		} else {
			if (height(t.right) - height(t.left) > ALLOWED_IMBALANCE) {
				if (height(t.right.right) >= height(t.right.left)) {
					t = rotateWithRightChild(t);
				} else {
					t = doubelWithRightChild(t);
				}
			}
		}
		t.height = Math.max(height(t.left), height(t.right)) + 1;
		return t;
	}

	private AvLNode<AnyType> remove(AnyType x, AvLNode<AnyType> t) {
		if (t == null) {
			return t;
		}
		int comPareResult = x.compareTo(t.element);
		if (comPareResult < 0) {
			t.left = remove(x, t.left);
		} else if (comPareResult > 0) {
			t.right = remove(x, t.right);
		} else if (t.left != null && t.right != null) {
			t.element = findMin(t.right).element;
			t.right = remove(t.element, t.right);
		} else {
			t = (t.left != null) ? t.left : t.right;
		}
		return balance(t);
	}

	private AvLNode<AnyType> findMin(AvLNode<AnyType> root) {
		if (root == null) {
			return null;
		} else if (root.left == null) {
			return root;
		}
		return findMin(root.left);
	}

	private AvLNode<AnyType> rotateWithLeftChild(AvLNode<AnyType> k2) {
		AvLNode<AnyType> k1 = k2.left;
		k2.left = k1.right;
		k1.right = k2;
		k2.height = Math.max(height(k2.left), height(k2.right)) + 1;
		k1.height = Math.max(height(k2.left), k2.height) + 1;
		return k1;
	}

	private AvLNode<AnyType> doubelWithLeftChild(AvLNode<AnyType> k3) {
		k3.left = rotateWithLeftChild(k3.left);
		return rotateWithLeftChild(k3);
	}

	private AvLNode<AnyType> rotateWithRightChild(AvLNode<AnyType> k2) {
		AvLNode<AnyType> k1 = k2.right;
		k2.right = k1.left;
		k1.left = k2;
		k2.height = Math.max(height(k2.right), height(k2.left)) + 1;
		k1.height = Math.max(height(k2.right), k2.height) + 1;
		return k1;
	}

	private AvLNode<AnyType> doubelWithRightChild(AvLNode<AnyType> k3) {
		k3.right = rotateWithLeftChild(k3.right);
		return rotateWithLeftChild(k3);
	}
}
