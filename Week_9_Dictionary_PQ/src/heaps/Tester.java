package heaps;

public class Tester {
	public static void main1(String[] args) {
		MaxHeap<Integer> h = new MaxHeap<Integer>(50);
		//Example of maxHeap  
		System.out.println(h);
		h.insert(40);
		h.insert(100);
		h.insert(20);
		h.insert(80);
		h.insert(90);
		h.insert(70);
		h.insert(95);
		System.out.println(h);
		h.removeMax();
		System.out.println(h);
		h.removeMax();
		System.out.println(h);
		h.insert(75);
		System.out.println(h);
	}
}
