import java.util.Scanner;
import java.util.Stack;
class ResizableArrayStack{
    private int arr[];
    private int size;
    private int top;
    // Initialize constructor for class    
    public ResizableArrayStack(int size){
        this.arr = new int[size];
        this.size = size;
        this.top = -1;
    }
    //method for push 
    public void push(int i){
        if(top==size-1){ // if the stack is full then throw the Exception
            throw new RuntimeException("Stack is full.");
        }
        arr[++top]=i;
    }
    //method for pop
    public int pop()
    {
        if(top==-1){
            throw new RuntimeException("Stack is empty.");
        }
        return arr[top--];
    }
    //method for peek
    public int peek()
    {
        if(top==-1){
            throw new RuntimeException("Stack is empty.");
        }
        return arr[top];
    }
    public static int evalPost(String post) {
        // Convert expression to char array
        char[] ch = post.toCharArray();
        // Initialize an empty stack in order to track result
        ResizableArrayStack st = new ResizableArrayStack(ch.length);
        for(char i:ch){
            if(Character.isDigit(i)){ // if the scanned Character is digit then push it on the stack
                st.push(i-'0');
            }
            /* if the scanned Character is operator then pop two element from stack and apply operator and push the result in the stack*/
            else{   
                int a=st.pop();
                int b=st.pop();
                switch(i){
                    case '+': st.push(a+b);     // if operator is '+', then add the element
                              break;
                    case '*': st.push(a*b);     // if operator is '*', then multiply the element
                              break;
                    case '-': st.push(b-a);    // if operator is '-', then subtract the element
                              break;
                    case '/': st.push(b/a);  // if operator is '/', then divide the element
                              break;
                    
                }
            }
        }
        return st.pop();
        }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String post =s.nextLine();
        int value = evalPost(post);
        System.out.println(value);
    
    }
}
