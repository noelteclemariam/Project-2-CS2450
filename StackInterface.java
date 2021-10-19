import java.util.Stack;

public class StackInterface{
    
    static int Precedence(char ch)
    {
            switch (ch)
            {
            case '+':
            case '-':
                    return 1;

            case '*':
            case '/':
                    return 2;

            case '^':
                    return 3;
            }
            return -1;
    }


    static String ConvertToPostfix(String infix)
    {
            // initializing empty String for ans
            String ans = new String("");

            // initializing empty stack
            Stack<Character> st = new Stack<>();

            for (int i = 0; i<infix.length(); ++i)
            {
                    char c = infix.charAt(i);


                    if (Character.isLetterOrDigit(c))
                            ans += c;

                    // If the scanned character is an '(',
                    // push it to the stack.
                    else if (c == '(')
                            st.push(c);


                    else if (c == ')')
                    {
                            while (!st.isEmpty() &&
                                            st.peek() != '(')
                                    ans += st.pop();

                            st.pop();
                    }
                    else 
                    {
                            while (!st.isEmpty() && Precedence(c)
                                            <= Precedence(st.peek())){

                                    ans += st.pop();
                            }
                            st.push(c);
                    }

            }


            while (!st.isEmpty()){
                    if(st.peek() == '(')
                            return "Invalid Expression";
                    ans += st.pop();
            }
            return ans;
    }
    public static void main(String[] args) {
            String infix="(a+b)/(c-d)";
            String infix1="a/(b-c)*d";
            String infix2="a-(b/(c/d)*e+f)^g";
            System.out.println(ConvertToPostfix(infix));
            System.out.println(ConvertToPostfix(infix1));
            System.out.println(ConvertToPostfix(infix2));


            
    }


public static String infixToPostfixConverter(String infixExpression) {
        return null;
}


public static int evaluateInfixExpression(String string) {
    return 0;
}
}



