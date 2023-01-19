package ibf.sdf;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public void example() {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        for (int j = 0; j < 5; j++) {
            Integer stackItem = stack.pop();
            System.out.println("Stack Item (POP): " + stackItem);
        }

        Integer firstItem = stack.firstElement();
        System.out.println("First stack item: " + firstItem);

        Integer stackItemPeek = stack.peek();
        System.out.println("Last stack item: " + stackItemPeek);

        Integer itemIndex = stack.search(2);
        System.out.println("Index of 2: " + itemIndex);

        Iterator<Integer> it = stack.iterator();

        while (it.hasNext()) {
            Integer stackIT = it.next();
            System.out.println(stackIT);
        }
    }
}
