package Level3;

import java.util.LinkedList;
import java.util.Queue;

public class ArithmeticCalculator<T extends Number> {
    private Number result;
    private Queue<Number> resultQueue = new LinkedList<>();
    private Number firstNumber;
    private Number secondNumber;
    private OperatorType operator;

    public void calculate() {
        switch (operator) {
            case operator.PLUS:
                result = firstNumber.doubleValue() + secondNumber.doubleValue();
                break;
            case operator.MINUS:
                result = firstNumber.doubleValue() - secondNumber.doubleValue();
                break;
            case operator.MULTIPLY:
                result = firstNumber.doubleValue() * secondNumber.doubleValue();
                break;
            case operator.DIVIDE:
                if (secondNumber.doubleValue() == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    result = firstNumber.doubleValue() / secondNumber.doubleValue();
                }
                break;
        }

        resultQueue.add(result);
    }

    public int getResult() {
        return result;
    }
    public void setFirstNumber(T firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(T secondNumber) {
        this.secondNumber = secondNumber;
    }
    public void setOperator(String operator) {
        this.operator = Enum.valueOf(OperatorType.class, operator);
    }

    public void removeResult() {
        resultQueue.poll();
    }
}
