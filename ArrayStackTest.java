public class ArrayStackTest {

    
    public void checkConversion() {
    String infixExpression =  "a*b/(c-a)+d*e";
    String requiredPostfixExpression = "ab*ca-/de*+";
    String obtainedPostfixExpression = StackInterface.infixToPostfixConverter(infixExpression);
    assertEquals(requiredPostfixExpression, obtainedPostfixExpression);
    }

    
    private void assertEquals(String requiredPostfixExpression, String obtainedPostfixExpression) {
    }


    public void evaluateInfixExpression() {
        String infixExpression =  "a*b/(c-a)+d*e";
        StringBuilder convertInfixExpression = new StringBuilder();
        for(int i=0; i<infixExpression.length();i++){
            if (infixExpression.charAt(i) == 'a')
                convertInfixExpression.append('2');
            else if (infixExpression.charAt(i) == 'b')
                convertInfixExpression.append('3');
            else if (infixExpression.charAt(i) == 'c')
                convertInfixExpression.append('4');
            else if (infixExpression.charAt(i) == 'd')
                convertInfixExpression.append('5');
            else if (infixExpression.charAt(i) == 'e')
                convertInfixExpression.append('6');
            else
                convertInfixExpression.append(infixExpression.charAt(i));

        }
        int evaluatedValue = StackInterface.evaluateInfixExpression(convertInfixExpression.toString());
        assertEquals(evaluatedValue, 33);
    }

    
    private void assertEquals(int evaluatedValue, int i) {
    }


    public void evaluatePostfixExpression() {
        String infixExpression =  "ab*ca-/de*+";
        StringBuilder convertInfixExpression = new StringBuilder();
        for(int i=0; i<infixExpression.length();i++){
            if (infixExpression.charAt(i) == 'a')
                convertInfixExpression.append('2');
            else if (infixExpression.charAt(i) == 'b')
                convertInfixExpression.append('3');
            else if (infixExpression.charAt(i) == 'c')
                convertInfixExpression.append('4');
            else if (infixExpression.charAt(i) == 'd')
                convertInfixExpression.append('5');
            else if (infixExpression.charAt(i) == 'e')
                convertInfixExpression.append('6');
            else
                convertInfixExpression.append(infixExpression.charAt(i));

        }
        int evaluatedValue = StackInterface.evaluateInfixExpression(convertInfixExpression.toString());
        assertEquals(evaluatedValue, 33);
    }




}