package edu.java.method05;

public class MethodMain05 {

    public static void main(String[] args) {
        // 메서드 작성 연습
        int[] scores = { 70, 65, 100, 51, 87 }; // 5개의 정수가 있는 배열 선언

        // scores = new int[5];

        int sum = sum(scores); // 합계구하는 메소드를 호출해 sum 에 저장.
        System.out.println("총점 = " + sum); // 360

        double avg = mean(scores); // 평균을 구하는 메소드를 호출해 avg 에 저장.
        System.out.println("평균 = " + avg);// 72.0

        int max = max(scores); // 최대값을 구하는 메소드를 호출해 max에 저장.
        System.out.println("최대값 = " + max); // 100

        int min = min(scores); // 최솟값을 구하는 메소드를 호출해 min에 저장.
        System.out.println("최솟값 = " + min); // 50

        double var = variance(scores);
        System.out.println("분산 = " + var);

        double sart = standardDeviation(scores);
        System.out.println("표준편차 = " + Math.sqrt(variance(scores)));

    }

    /**
     * 배열을 받아 합계를 구하는 메소드.
     * 
     * @param scores
     * @return
     */
    public static int sum(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i]; // sum에 원소를 누적해 합산.
        }
        /*
         * for(int a : scores) { sum += a; }
         */

        return sum; // 합계 반환.
    }

    /**
     * 배열을 받아 평균을 구하는 메소드.
     * 
     * @param scores int[].
     * @return avg.
     */
    public static double mean(int[] scores) { // 여기서 double로 받아보려했는데 매개변수는 배열이 정수여서 실수로 받으니까 sum() 호출이 안되서 밑에서 실수로
                                              // 변환했습니다.
        double avg = 0;
        avg = sum(scores) / (double) scores.length; // 합계를 배열의 원소 수 만큼 실수로 나누어서 평균값 반환.
        return avg; // 평균 반환.
    }

    /**
     * 배열을 받아 최대값을 구하는 메소드.
     * 
     * @param scores int[].
     * @return max.
     */
    public static int max(int[] scores) {
        int max = scores[0];
        for (int x : scores) {
            max = (x > max) ? x : max; // 삼항연산자를 이용해 원소 최대값 비교.
        }
        return max; // 최대값 반환.
    }

    /**
     * 배열을 받아 최소값을 구하는 메소드.
     * 
     * @param scores int[].
     * @return min.
     */
    public static int min(int[] scores) {
        int min = scores[0];
        for (int x : scores) {
            min = (x < min) ? x : min; // 삼항연산자를 이용해 원소 최솟값 비교.
        }
        return min; // 최솟값 반환.
    }

    /**
     * 배열을 받아 분산을 구하는 메소드.
     * 
     * @param scores int[]
     * @return var.
     */
    public static double variance(int[] scores) {
        // 데이터: {x1, x2, ..., xn)
        // 평균 mu = (x1 + x2 + ... + xn) / n
        // 분산: var = (x1 - mu)^2 + (x2 - mu)^2 + ... + (xn - mu)^2) / n
        // 표준편차: std = sqrt(var)

        double mu = mean(scores);
        double total = 0;
        for (int x : scores) {
            total += (x - mu) * (x - mu);
        }
        double var = total / scores.length;

        return var;
    }

    /**
     * 배열을 받아 표준편차를 구하는 메소드.
     * 
     * @param scores int[].
     * @return Math.sqrt(vaiance(scores)).
     */
    public static double standardDeviation(int[] scores) {
        return Math.sqrt(variance(scores));
    }

}
