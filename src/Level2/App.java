package Level2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Calculator 인스턴스 생성
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);

        String exitCode = " ";
        while(!exitCode.equals("exit")){
            // 정수 2개와 연산자를 입력받는다
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int firstNumber = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요: ");
            int secondNumber = sc.nextInt();
            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            //Setter로 입력받은 변수를 객체의 private한 필드에 저장한다
            calculator.setFirstNumber(firstNumber);
            calculator.setSecondNumber(secondNumber);
            calculator.setOperator(operator);
            calculator.calculate();

            //getter로 객체의 private한 필드를 읽는다
            int result = calculator.getResult();

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
