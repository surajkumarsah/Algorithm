package Amazon_Practice;
////Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

import java.util.Scanner;
import java.util.Stack;


class MyStack{
    Stack<Integer> stack;
    Integer minEle;

    MyStack() {
        stack = new Stack<Integer>();
    }

    void getMin(){
        if (stack.isEmpty()){
            System.out.println("Stack is empty.");
        }else{
            System.out.println("Minimun Element in the stack is:" +minEle);
        }
    }

    void peek(){
        if (stack.isEmpty()){
            System.out.println("Stack is empty.");
        }
        Integer p = stack.peek();
        System.out.println("Top most element is: ");

        if (p<minEle)
            System.out.println(minEle);
        else
            System.out.println(p);

    }

    void push(){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if (stack.isEmpty()){
            minEle = x;
            stack.push(x);
            System.out.println("Number Inserted:" +minEle);
            return;
        }
        if(x<minEle){
            stack.push(2*x-minEle);
            minEle = x;
        }
        else{
            stack.push(x);
        }

        System.out.println("Number Inserted:" +minEle);
    }

    void pop(){
        if(stack.isEmpty()){
            System.out.println("Stack Empty.");
            return;
        }
        System.out.println("Top most element removed.");
        Integer r = stack.pop();
        System.out.println("Removed Element: "+r);


        if (r < minEle){
            System.out.println("Mininum element: "+minEle);
            minEle = 2*minEle - r;
        }else{
            System.out.println("Mininum element: "+minEle);
            System.out.println(minEle);
        }

    }
}

class MinStack {

    public static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int choice;
        MyStack myStack = new MyStack();

        while (true) {
            System.out.println("Enter a choice: ");
            Scanner s = new Scanner(System.in);
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    myStack.push();
                    break;
                case 2:
                    myStack.pop();
                    break;
                case 3:
                    myStack.peek();
                    break;
                case 4:
                    myStack.getMin();
                    break;
            }
        }
    }
}














//package Amazon_Practice;
//
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//class Stacks{
//    int data;
//    Stacks next = null;
//
//    Stacks(int d){
//        data = d;
//    }
//}
//
//public class MinStack {
//
//    public static List<Stacks> stacksList = new ArrayList<>();
//    public static int min = Integer.MAX_VALUE;
//
//    public static void main(String[] args){
//        int choice;
//
//        while(true) {
//            System.out.println("Enter a choice: ");
//            Scanner s = new Scanner(System.in);
//            choice = s.nextInt();
//
//            switch (choice) {
//                case 1:
//                    push();
//                    break;
//                case 2:
//                    pop();
//                    break;
//            }
//        }
//    }
//
//    private static void pop() {
//        if(stacksList.size()!=0){
//            int size = stacksList.size();
//            Stacks element = stacksList.get(size-1);
//            System.out.println("Removed Data: "+element.data);
//            stacksList.remove(stacksList.size()-1);
//        }
//    }
//
//    private static void push() {
//        System.out.println("Enter an element: ");
//        Scanner s = new Scanner(System.in);
//        int ele = s.nextInt();
//
//        if(min > ele){
//            min = ele;
//        }
//
//        Stacks stack = new Stacks(ele);
//        stacksList.add(stack);
//    }
//
//}
