package edu.java.class03;

// class = field + constructor + method ==> data type
public class Rectangle {
    // field - 가로, 세로
    int width; // 가로의 길이를 받는 변수.
    int height; // 세로의 길이를 받는 변수. 

    // constructor - 기본 생성자, argument 2개를 갖는 생성자. 

    /**
     * 기본 생성자.
     */
    public Rectangle() {
        // 
    }

    /**
     * 직사각형의 가로와 세로의 길이를 받는 생성자.
     * 
     * @param width
     * @param height
     */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    // method - 둘레 길이, 넓이

    /**
     * 직사각형의 둘레의 길이를 구하는 메서드.
     * 
     * @return sumRound
     */
    /*
     * public int roung() {
     * retrun 2 * (widdth + height);
     * }
     */
    public int round() {
        int sumRound = 0;
        sumRound = 2 * (width + height);
        return sumRound;
    }

    /**
     * 직사각형의 넓이를 구하는 메서드.
     * 
     * @return sumArea
     */
    public int area() {
        int sumArea = 0;
        sumArea = width * height;
        return sumArea; // 넓이 리턴 .
    }

}
