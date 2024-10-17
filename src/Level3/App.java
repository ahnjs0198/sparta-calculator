package Level3;

import Level2.Calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArithmeticCalculator<Double> calculator = new ArithmeticCalculator<Double>();

        Scanner sc = new Scanner(System.in);

        String exitCode = " ";
        while(!exitCode.equals("exit")){
            // 실수 2개와 연산자를 ENUM형식에 맞춰서 입력받는다
            System.out.println("첫 번째 숫자를 입력하세요: ");
            double firstNumber = sc.nextDouble();
            System.out.println("두 번째 숫자를 입력하세요: ");
            double secondNumber = sc.nextDouble();
            System.out.println("사칙연산을 입력하세요(예:PLUS, MINUS, MULTIPLY, DIVIDE): ");
            String operator = sc.next();

            // setter로 객체의 private한 필드에 변수를 저장한다
            calculator.setFirstNumber(firstNumber);
            calculator.setSecondNumber(secondNumber);
            calculator.setOperator(operator);
            calculator.calculate();

            // getter로 객체의 private한 필드를 읽는다
            Number result = calculator.getResult();

            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? (remove 입력시 삭제)");
            exitCode = sc.next();
            if (exitCode.equals("remove")){
                calculator.removeResult();
            }
        }
    }
}
