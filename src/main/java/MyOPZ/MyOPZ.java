package MyOPZ;

import java.util.Stack;

public class MyOPZ {
    private Stack<Integer> myStack;
    private int result;
    boolean correctNotation;

    private int operationResult(char operation) {
        int result = 0;
        correctNotation = true;
        int firstOperand = myStack.pop();
        int secondOperand = myStack.pop();
        switch (operation) {
            case '/':
                if (firstOperand != 0) {
                    result = secondOperand / firstOperand;
                } else {
                    correctNotation = false;
                }
                break;
            case '*':
                result = secondOperand * firstOperand;
                break;
            case '+':
                result = secondOperand + firstOperand;
                break;
            case '-':
                result = secondOperand - firstOperand;
                break;
        }
        return result;
    }

    public MyOPZ(String notation) {
        char tempChar;
        myStack = new Stack<Integer>();
        correctNotation = true;
        for (int i = 0; i < notation.length() && correctNotation; i++) {
            tempChar = notation.charAt(i);
            if (Character.isDigit(tempChar)) {
                myStack.push(Character.digit(tempChar, 10));
            } else if ((tempChar == '+' || tempChar == '*' || tempChar == '-' || tempChar == '/') && myStack.size() > 1) {
                myStack.push(operationResult(tempChar));
            } else {
                correctNotation = false;
            }

        }
        if (correctNotation && (correctNotation = (myStack.size() == 1))) {
            result = myStack.pop();
        }
    }

    public boolean getCorrectNotation() {
        return correctNotation;
    }

    public int getResult() {
        return result;
    }

    public boolean getBooleanStackIsEmpty() {
        return myStack.empty();
    }

}