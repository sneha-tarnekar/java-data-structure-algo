package Practise;

public class PrimeNumbers {

	public static void main(String[] args) {
		printPrimes(9);
	}
	
	public static void printPrimes(int n) {
		for(int k=2; k <= n; k++) {
			boolean flag = true;
			int i=2;
			while(i < k) {
				if(k%i == 0) {
					flag = false;					
				}
				i++;
			}	
			if(flag == true) {
				System.out.println(k);				
			}
		}
	}

}
