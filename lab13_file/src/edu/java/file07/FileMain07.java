package edu.java.file07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import edu.java.file06.Product;

public class FileMain07 {

    public static void main(String[] args) {
        // edu.java.file06.Product 타입의 객체를 1,000,000개 생성하고 ArrayList에 저장.
        // ArrayList의 내용을 product_list.dat 파일에 write.
        // product_list.dat 파일에서 데이터를 읽어서 ArrayList 타입으로 변환 - 시간 측정.
        ArrayList<Product> plist = new ArrayList<>();
        Product p = new Product();
        // System.out.println(p);

        for (int i = 0; i < 1_000_000; i++) {
            p = new Product(i, " ", i);
            plist.add(p);
        }
        System.out.println(plist.size());

        String fileName = "data/product_list.dat";

        try (FileOutputStream out = new FileOutputStream(fileName);
                BufferedOutputStream bout = new BufferedOutputStream(out);
                ObjectOutputStream oout = new ObjectOutputStream(bout);) {

            long startTime = System.currentTimeMillis();
            oout.writeObject(plist);
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
            System.out.println("파일 쓰는 시간 - " + elapsedTime + "ms");

        } catch (Exception e) {
            e.printStackTrace();
        }

        try (FileInputStream in = new FileInputStream(fileName);
                BufferedInputStream bin = new BufferedInputStream(in);
                ObjectInputStream oin = new ObjectInputStream(bin);) {
            long startTime = System.currentTimeMillis();
            Object obj = oin.readObject();
            if (obj instanceof ArrayList) {
                ArrayList<Product> a1 = (ArrayList<Product>) obj;
            }

            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
            System.out.println("타입 변환 시간 - " + elapsedTime + "ms");

            System.out.println(plist.get(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
