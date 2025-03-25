package binaryTrees;

public class BinNode<E> { // Binary tree node ADT
	  // Get and set the element value
		E data;
		BinNode<E> leftChild;
		BinNode<E> rightChild;
		
		public BinNode(E value) { data = value; }
		
		 public BinNode(E value, BinNode<E> left, BinNode<E> right) {
			data = value; leftChild = left;	rightChild = right;
		}

		public E value() { return data; }
		public void setValue(E v) { data = v; }

		public BinNode<E> left() { return leftChild; }
		public void setLeft(BinNode<E> l) { leftChild = l; }

		public BinNode<E> right() { return rightChild; }
		public void setRight(BinNode<E> r) { rightChild = r; }
		
		public boolean isLeaf() {
			if (leftChild == null && rightChild == null) {
				return true;
			} else {
				return false;
			}
		}
	}