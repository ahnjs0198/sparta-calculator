package Level2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);

        String exitCode = " ";
        while(!exitCode.equals("exit")){
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int firstNumber = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요: ");
            int secondNumber = sc.nextInt();
            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            calculator.setFirstNumber(firstNumber);
            calculator.setSecondNumber(secondNumber);
            calculator.setOperator(operator);
            calculator.calculate();

            int result = calculator.getResult();

            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            exitCode = sc.next();
        }
    }
}
