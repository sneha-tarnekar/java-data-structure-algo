package Problems;

public class AlphabetPattern {

	public static void main(String[] args) {
		alphabetPattern(5);
	}
	
//	E
//	DE
//	CDE
//	BCDE
//	ABCDE
	
	public static void alphabetPattern(int row) {
		char end=(char) ('A'+row-1);
		for(char i=end; i>='A'; i--) {
			for(char j=i; j<=end; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
