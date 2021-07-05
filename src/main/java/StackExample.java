import java.io.*;
import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        {
            Stack<String> stack = new Stack<String>();

        stack.push("teddy");// output is [teddy, blocks, puzzle]
        stack.push("blocks");
        stack.push("puzzle");
            System.out.println(stack);
             stack.pop();// removed the first element output is [teddy, blocks]
            System.out.println(stack);
            System.out.println(stack.peek());// outut is puzzle
            System.out.println(stack.search("puzzle")); // output is 1 from the right
            System.out.println(stack);
        }
        }
    }













