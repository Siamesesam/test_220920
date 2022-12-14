package edu.java.method06;

public class MethodMain06 {

    public static void main(String[] args) {
        // 가변 인수(variable argument): 개수가 정해져 있지 않은 argument.

        System.out.printf("scores[%d] \n", 1);
        System.out.printf("scores[%d]> %d \n", 2, 100);
        System.out.printf("%s[%d]> %f \n", "scores", 3, 12.3);

        System.out.println("----------------------------");
        System.out.println(addAllIntegers());
        System.out.println(addAllIntegers(1));
        System.out.println(addAllIntegers(1, 2, 3));

        System.out.println("----------------------------");
        System.out.println(calculate("+", 3, 4));
        System.out.println(calculate("*", 4, 5));
        System.out.println(calculate("&", 3, 4));

        // 가변 인수를 갖는 메서드 정의:
        // 가변 인수를 저장하는 파라미터는 "변수타입... 변수이름" 혀ㅇ식으로 선언.
        // (주의) 가변 인수를 저장하는 파라미터는 반그시 가장 마지막 파라미터로 선언.
        // (주의) 가변 인수는 2개 이상 정의할 수 없음.
    }

    public static int addAllIntegers(int... args) {
        int add = 0;
        for (int i = 0; i < args.length; i++) {
            add += args[i];
        }

        return add;

    }

    /**
     * op가 "+"인 경우에는 모든 가변 인수들의 합계를 반환하고, op가 "*"인 경우에는 모든 가변 인수들의 곱을 반환. 만약 op가 "+"
     * or "*"가 아닌 경우에는 0을 반환.
     * 
     * @param op   "+" or "*"
     * @param args 숫자(double)
     * @return sum or prd
     */
    public static double calculate(String op, double... args) {
        /*
        if (op == "+") {
            double sum = 0;
            for (int i = 0; i < args.length; i++) {
                sum += args[i];
            }
            return sum;
        } else if (op == "*") {
            double prd = 1;
            for (int i = 0; i < args.length; i++) {
                prd *= args[i];
            }
            return prd;
        }
        return 0;
        */
        double result = 0;
        switch (op) {
        case "+":
            for (double x : args) {
                result += x;
            }
            break;
        case "*":
            result = 1;
            for (double x : args) {
                result *= x;
            }
            break;
        }
        return result;
    }

}
