public class Stack {
   
   
    String arrays[]; 
    int top;
    int load;

    Stack(int size) {
        arrays = new String[size];
        load = size;
        top = -1;
    }
    public void push(String data) {
        if (isFull()) {
            System.out.println("Stack is Full!");
            System.exit(1);
        }
        System.out.println("Inserting " + data);
        arrays[++top] = data;
    }
    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            System.exit(1);
        }
        System.out.println("Removing " + arrays[top]);
        return arrays[top--];
    }
    public int size() {
        return top + 1;
    }
    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == load - 1;
    }
    public String peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            System.exit(-1);
        }
        return arrays[top];
    }
    public void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.println(arrays[i]);
        }
    }
}
