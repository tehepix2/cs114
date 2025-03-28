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
		

		BinNode<Integer> n7 = new BinNode<>(3, null, null);
		BinNode<Integer> n6 = new BinNode<>(27, null, null);
		BinNode<Integer> n5 = new BinNode<>(6, null, n7);
		BinNode<Integer> n4 = new BinNode<>(14, null, null);
		BinNode<Integer> n3 = new BinNode<>(10, n5, n6);
		BinNode<Integer> n2 = new BinNode<>(5, n4, null);
		BinNode<Integer> n1 = new BinNode<>(72, n2, n3);

		preOrder(E);
		System.out.println();
		inOrder(E);
		System.out.println();
		postOrder(E);
		System.out.println();
		
		System.out.println(countLevels(B));

		preOrder(n1);
	}
	
	public static <E> void preOrder(BinNode<E> rt) {
		if (rt != null) {
			System.out.println(rt.value());
			preOrder(rt.left());
			preOrder(rt.right());
		}
		

	}
	
	public static <E> void postOrder(BinNode<E> rt) {
		if (rt != null) {
			preOrder(rt.left());
			preOrder(rt.right());
			System.out.println(rt.value());
		}
	}
		
	public static <E> void inOrder(BinNode<E> rt) {
		if (rt != null) {
			preOrder(rt.left());
			System.out.println(rt.value());
			preOrder(rt.right());
			
		}
	}
	
	public static <T> int countLevels(BinNode<T> rt) {
		
		
		return 0; // stub
	}
	
	public static BinNode<Integer> anotherTree(){
		return null; // stub
	}
}
