package edu.java.file08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileMain08 {
    public static void main(String[] args) {

        // Student를 저장하는 ArrayList를 선언, 생성.
        // ArrayList에 Student 객체 5개를 저장.
        // ArrayList를 파일에 write.
        ArrayList<Student> stuList = new ArrayList<>();
        Student stu = new Student();
        Score score = new Score();

        for (int i = 0; i < 5; i++) {
            score = new Score(i, i, i);
            stu = new Student(i, " ", score);
            stuList.add(stu);
        }

        String fileName = "data/stuSco_List.dat";

        try (FileOutputStream out = new FileOutputStream(fileName);
                BufferedOutputStream bout = new BufferedOutputStream(out);
                ObjectOutputStream oout = new ObjectOutputStream(bout);) {
            long startTime = System.currentTimeMillis();
            oout.writeObject(stuList);

            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
            System.out.println("파일 쓰는 시간 - " + elapsedTime + "ms");

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();

        // 파일에서 ArrayList 객체를 read.
        // ArrayList의 원소들을 한 줄씩 출력.

        try (FileInputStream in = new FileInputStream(fileName);
                BufferedInputStream bin = new BufferedInputStream(in);
                ObjectInputStream oin = new ObjectInputStream(bin);) {
            long startTime = System.currentTimeMillis();

            ArrayList<Student> list = (ArrayList<Student>) oin.readObject();
            //            Object obj = oin.readObject();
            //            if (obj instanceof ArrayList) {
            //                stuList = (ArrayList<Student>) obj;
            //            }
            //            while (true) {
            //                int read = bin.read();
            //                if (read == -1) { 
            //                    break;
            //                }
            //
            //            }

            for (Student s : stuList) {
                System.out.println(s);
            }

            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
            System.out.println("파일 읽는 시간 - " + elapsedTime + "ms");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
