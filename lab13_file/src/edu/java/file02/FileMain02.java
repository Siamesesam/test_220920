package edu.java.file02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileMain02 {

    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("data/test.txt");
            out = new FileOutputStream("data/test_copy2.txt");

            long startTime = System.currentTimeMillis(); // 복사 시작 시간.
            while (true) {
                // 파일에서 읽은 데이터(바이트)를 저장하기 위한 배열
                byte[] buffer = new byte[20]; // 20 바이트를 저장할 수 있는 배열 .
                int result = in.read(buffer); // 파일에서 읽은 데이터 개수(바이트 수)를 리턴.
                // read(byte[] b): 파일에서 읽은 데이터를 byte 배열 b에 저장하고, 실제 읽은 바이트
                if (result == -1) { // 파일 끝(EOF)에 도달하면
                    break; // while문 종료
                }

                // out.write(buffer);
                // write(byte[] b): 바이트 배열의 내용을 그대로 파일에 write.
                out.write(buffer, 0, result);
                // write(byte[] b, int off, int len): byte 배열 b에서 인덱스 off 부터 len 까지 write
            }
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
            System.out.println("파일 복사 종료 - " + elapsedTime + "ms");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
