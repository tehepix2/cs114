package comperables;

/*
 * This class represents strings that are ordered by LENGTH only.
 * When comparing to another CrazyStrings, we compare their length.
 */
public class CrazyString implements Comparable<CrazyString> {

	private String myString = "";
	
	public CrazyString(String str) {
		myString = str;
	}
	
	@Override
	public int compareTo(CrazyString o) {
		
		//Compare length
		if (this.myString.length() < o.myString.length()) {
			return -1;
		}
		else if (this.myString.length() == o.myString.length()) {
			return 0;
		}
		else {
			return 1;
		}
	}
	@Override
	public String toString() {
		return myString;
	}
}
