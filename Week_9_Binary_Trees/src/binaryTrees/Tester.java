package binaryTrees;

public class Tester {

	public static void main(String[] args) {

		/* Creating the tree:
		 * 
		 *                   E
		 *                  / \ 
		 *                 B   C
		 *                / \   \
		 *               D   I   H
		 *                \     / \  
		 *                 A   F   J
		 *                    /
		 *                   G  
		 */
		
		BinNode<Character> A = new BinNode<>('A');
		BinNode<Character> I = new BinNode<>('I');
		BinNode<Character> G = new BinNode<>('G');
		BinNode<Character> J = new BinNode<>('J');
		BinNode<Character> D = new BinNode<>('D', null, A);
		BinNode<Character> B = new BinNode<>('B', D, I);
		BinNode<Character> F = new BinNode<>('F', G, null);
		BinNode<Character> H = new BinNode<>('H', F, J);
		BinNode<Character> C = new BinNode<>('C', null, H);
		BinNode<Character> E = new BinNode<>('E', B, C);
		
		preOrder(E);
		System.out.println();
		inOrder(E);
		System.out.println();
		postOrder(E);
		System.out.println();
		
		System.out.println(countLevels(B));
	}
	
	public static <E> void preOrder(BinNode<E> rt) {
	}
	
	public static <E> void postOrder(BinNode<E> rt) {
	}
		
	public static <E> void inOrder(BinNode<E> rt) {
	}
	
	public static <T> int countLevels(BinNode<T> rt) {
		return 0; // stub
	}
	
	public static BinNode<Integer> anotherTree(){
		return null; // stub
	}
}
