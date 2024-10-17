package Level1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언
        int firstNumber;
        int secondNumber;
        char operator;
        String exitCode=" ";

        while(!exitCode.equals("exit")){
            // 정수 2개와 연산자를 입력받는다
            System.out.println("첫 번째 숫자를 입력하세요: ");
            firstNumber = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요: ");
            secondNumber = sc.nextInt();
            System.out.println("사칙연산 기호를 입력하세요: ");
            operator = sc.next().charAt(0);

            //연산자에 따라 사칙연산을 실행
            int result = 0;
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
                    if (secondNumber == 0){
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    } else {
                        result = firstNumber / secondNumber;
                    }
                    break;
            }
            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            exitCode = sc.next();
        }

    }
}
