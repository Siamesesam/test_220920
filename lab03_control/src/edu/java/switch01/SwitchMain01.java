package edu.java.switch01;

public class SwitchMain01 {

    public static void main(String[] args) {
        String weekday = "금";
        switch (weekday) {
        case "월":
            System.out.println("회사 가기 싫어");
            break;
        case "화":
            
        case "수":
            
        case "목":
            System.out.println("어떻게든 버텨야지");
            break;
        case "금":
            System.out.println("야호, 불금");
            break;
        case "토":
            
        case "일":
            System.out.println("휴일");
            break;
        default:
            System.out.println("???");
                // default문은 break문이 필요없음
        }
        
        /*
        double x =1.0;
        switch (x) {
        case 0.0:
            break;
        case 1.0:
            break;
        }
        */
    }

}
