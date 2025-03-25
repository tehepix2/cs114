package linkListLab;

public class Tester {

	public static void main(String[] args) {
		VNode<Integer> A = new VNode<Integer>(3); 
		VNode<Integer> B = new VNode<Integer>(7); 
		VNode<Integer> C = new VNode<Integer>(8); 
		VNode<Integer> D = new VNode<Integer>(10); 
		VNode<Integer> E = new VNode<Integer>(4);
		VNode<Integer> F = new VNode<Integer>(2);
		VNode<Integer> G = new VNode<Integer>(7);
		
		A.setNext(B);
		B.setNext(C);
		C.setNext(D);
		D.setNext(E);
		E.setNext(F);
		F.setNext(G);
		// G.setNext(A);

		System.out.println(hasCycle(A));
		
		System.out.println(toString(A));
	}
	
	/** Returns space separated values of the list. 
     *  Example "3 7 8 10 4 2 7" for above list
     **/
	public static <E> String toString(VNode<E> head) {
		String values = "";
		if (!hasCycle(head)) {
			System.out.println("no cycle");
			VNode<E> curr = head;
			while (curr.getNext() != null) {
				values += curr.getValue() + " ";
				curr = curr.getNext();
				
			}
		}
		return values;
		
	}
	/** 
	 * Returns True if the list starting at head has a cycle, False otherwise
	 */
	public static <E> boolean hasCycle(VNode<E> head) {
		head.visit();
		if (head.getNext() == null) {
			return false;
		}
		else if (head.getNext().wasVisited()) {
			return true;
		}
		else {
			
			return hasCycle(head.getNext());
		}
		
		
	}

	public static <E> void resetCycle(VNode<E> head) {
		if (head.wasVisited()) {
			head.leave();
			if ((head.getNext() != null) && (head.getNext().wasVisited())) {
				resetCycle(head.getNext());
			}
		}
	}
}
