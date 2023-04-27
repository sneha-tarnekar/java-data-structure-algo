package Queue;

public class BinaryNumberUsingQueue { 

	public static void main(String[] args) {
		String[] result = findBin(8);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i] + " ");
		}

	}
	
	public static String[] findBin(int number) {
		String[] binaries = new String[number];
		QueueUsingArray<String> queue = new QueueUsingArray<String>(number+1);
		
		queue.enqueue("1");
		for(int i=0; i<number; i++){
			binaries[i] = queue.dequeue();
			String s1 = binaries[i] + "0";
			String s2 = binaries[i] + "1";
			queue.enqueue(s1);
			queue.enqueue(s2);
		}
		
		return binaries;
	}

}
