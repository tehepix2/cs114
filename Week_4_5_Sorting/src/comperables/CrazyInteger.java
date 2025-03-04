package comperables;

public class CrazyInteger implements Comparable<CrazyInteger> {
    // * Compare by sum of digits
    // * If this is smaller- Return -1
    // * Else if this is larger, return 1
    // * If same sum of digit, returns 0

    private int myInt;

    public CrazyInteger(int integer) {
        this.myInt = integer;
    }
    public int addDigits(int integer) {
        int integerAddition = 0;
        for (int i = 0; i < Integer.toString(integer).length(); ++i) {
            integerAddition+=(Integer.valueOf(Integer.toString(integer).substring(i, i + 1)));
        }
        return integerAddition;
    }
    @Override
    public int compareTo(CrazyInteger integerTwo) {
        //Compare digit additions
		if (addDigits(this.myInt) < addDigits(integerTwo.myInt)) {
			return -1;
		}
		else if (addDigits(this.myInt) == addDigits(integerTwo.myInt)) {
			return 0;
		}
		else {

			return 1;
		}
        
    }

    @Override
	public String toString() {
		return Integer.toString(this.myInt);
	}
    
}
