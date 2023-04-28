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
        sortStackUsingTempStack(stack);
        System.out.println("After : ");
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
}
