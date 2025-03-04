package util;

import lists.AList;
import lists.ListADT;

public class listExercises {

	
	public static void main(String[] args) {
		ListADT<Integer> al = new AList<>();
		al.append(0);
		al.append(1);
		al.append(2);
		al.append(3);
		System.out.println(find(al, 4));
		System.out.println(find(al, 1));
		insertIn(al, 100, 2);
		System.out.println(find(al, 100));
	}
	
	/** Print list with position **/
	public static <E> void printList(ListADT<E> L) {
		// Save current position
		int curr = L.currPos();
		
		// String for list printout
		String out = new String("< ");
		int i = 0;
		for (L.moveToStart(); !L.isAtEnd(); L.next()) {	
			// If this is the current position, add position indicator
			if (curr == i) { out += "| "; }
			// Add current value to out string
			E it = L.getValue();
			out += (it + " ");
			++i;
		}
		// if position is at end 
		if (curr == L.length()) { out+="| "; }
		// End printout
		out += ">";
		
		//print
		System.out.println(out);
		
		// return list structure to previous state
		L.moveToPos(curr);
	}
	
	/**
	 * Returns the index of the first occurrence 'item' in l. If no such element, return -1.
	 * @param <E> - Type of elements in ListADT
	 * @paramH l - list to search
	 * @param item - Item to find
	 * @return index of first occurrence
	 * 
	 * THIS METHOD DO NOT CHANGE THE LIST l
	 * (so make sure currPos returns to it's position before this method was called, 
	 *  see printing methods)
	 */
	public static <E> int find(ListADT<E> l, E item) {
		int curr = l.currPos();
		l.moveToStart();
		while (!l.isAtEnd()) {
			if (l.getValue().equals(item)) {
				int pos = l.currPos();
				l.moveToPos(curr);
				return pos;
			}
			l.next();
		}
		l.moveToPos(curr);
		return -1;
	}
	
	/**
	 * Insert 'item' in position 'pos' of list l of type E
	 * @return True if inserted, false if not. 
	 * Position after insertion is at pos
	 */
	public static <E> boolean insertIn(ListADT<E> l, E item, int pos) {
		int curr = l.currPos();
		boolean inserted = false;

		if(l.moveToPos(pos)) {
			l.insert(item);
			inserted = true;
		}
		l.moveToPos(curr);
		return inserted; //STUB
	}
	
	
}
