package linkListLab;

/**
 * 
 * This is a node of a linked list, that can tell if it was already visited
 */
public class VNode<E> {
	E val;
	VNode<E> next;
	boolean visited;
	// Constructors
	VNode(E value) {this.val = value; visited = false; next = null;}
	VNode(E value, VNode<E> next) {
		this(value); 
		this.next = next;
	}
	
	boolean wasVisited() {return visited;}
	void visit() {visited = true;}
	void leave() {visited = false;}
	E getValue() {return val;}
	void setValue(E newValue) {val = newValue;} 
	VNode<E> getNext() {return next;}
	void setNext(VNode<E> newNext) {next = newNext;} 
	
	
}
