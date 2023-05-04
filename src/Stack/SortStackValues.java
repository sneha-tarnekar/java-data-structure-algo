package Stack;

public class SortStackValues {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>(7);
        stack.push(2);
        stack.push(97);
        stack.push(4);
        stack.push(42);
        stack.push(12);
        stack.push(60);
        stack.push(23);
        sortStackUsingTempStack(stack); // Sort Stack Using a Temporary Stack
        sortStackWithRecursion(stack);	// Sort Stack using Recursive Method
        System.out.println("Sorted stack : ");
        while(!stack.isEmpty()){
	        System.out.println(stack.pop());
	    }	
	}

	public static void sortStackUsingTempStack(Stack<Integer> stack) {
		Stack<Integer> newStack = new Stack<Integer>(stack.getCapacity());
		
		while(!stack.isEmpty()) {
			Integer value = stack.pop();
			if(!newStack.isEmpty() && value >= newStack.top()) {
				newStack.push(value);
			} else {
				while(!newStack.isEmpty()) {
					stack.push(newStack.pop());
				}
				newStack.push(value);
			}
		}
		
		while(!newStack.isEmpty()) {
			stack.push(newStack.pop());
		}
    }
	
	public static Stack<Integer> sortStackWithRecursion(Stack<Integer> stack) {
		if(!stack.isEmpty()) {
			int value = stack.pop();
			sortStackWithRecursion(stack);
			insert(stack, value);
		}
		return stack;
	}
	
	public static void insert(Stack<Integer> stack, int value) {
		if(stack.isEmpty() || value < stack.top()) {
			stack.push(value);
		} else {
			int temp = stack.pop();
			insert(stack, value);
			stack.push(temp);
		}
	}
}
