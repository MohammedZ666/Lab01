
import java.util.Stack;

public class StackBasicExample {
    public static void main(String a[]){
        Stack<Integer> stack = new Stack<>();
        System.out.println("Empty stack : "  + stack);
        System.out.println("Empty stack : "  + stack.isEmpty());
       
        System.out.println("After Push: "+stack.push(10));
        System.out.println("After Push: "+stack.push(5));
        System.out.println("After Push: "+stack.push(6));
        stack.pop();
        System.out.println("After Pop: "+stack.peek());
        System.out.println("After Push: "+stack.push(9));
        System.out.println("After Push: "+stack.push(3));
        System.out.println("After Push: "+stack.push(2));
        stack.pop();
        System.out.println("After Pop: "+stack.peek());
        stack.pop();
        System.out.println("After Pop: "+stack.peek());


       
    }
}
