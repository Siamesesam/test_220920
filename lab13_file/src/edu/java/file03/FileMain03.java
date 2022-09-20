package edu.java.file03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileMain03 {

    public static void main(String[] args) {
        // data/ratings.data 파일을 읽고 ratings_copy.data 파일에 복사
        // read(), write(int b)를 사용했을 때
        // read(byte[] b), write(byte[] b, int off, int len)를 사용했을 때
        // 복사 시간의 차이를 비교.

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("data/ratings.dat");
            out = new FileOutputStream("data/ratings_copy.dat");

            long startTime = System.currentTimeMillis();

            while (true) {

                byte[] buffer = new byte[4 * 1024];
                // int result = in.read();
                int result = in.read(buffer);
                if (result == -1) {
                    break;
                }
                // out.write(result);
                out.write(buffer, 0, result);

            }

            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
            System.out.println("파일 복사 종료 - " + elapsedTime + "ms");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
