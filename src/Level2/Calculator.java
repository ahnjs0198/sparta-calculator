package Level2;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    private int result = 0;
    private Queue<Integer> resultQueue = new LinkedList<>();
    private int firstNumber;
    private int secondNumber;
    private char operator;

    public void calculate() {
        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    result = firstNumber / secondNumber;
                }
                break;
        }
        resultQueue.add(result);
    }

    public int getResult() {
        return result;
    }
    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void removeResult() {
        resultQueue.poll();
    }
}
