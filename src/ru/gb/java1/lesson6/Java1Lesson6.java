/**
 V 1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);
 V 2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
 V 3. * Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле (работаем только с латиницей).
 4. ** Написать метод, проверяющий, есть ли указанное слово в папке (File)
 */

package ru.gb.java1.lesson6;

import java.util.Scanner;
import java.io.*;

public class Java1Lesson6 {

    public static void main(String[] args) {

        creator();

        File file1 = new File("abc.txt");
        File file2 = new File("xyz.txt");
        try {
            BufferedOutputStream bufOut = new BufferedOutputStream(new FileOutputStream("abc.txt", true));
            BufferedInputStream bufRead = new BufferedInputStream(new FileInputStream("xyz.txt"));
            int i;
            while ((i = bufRead.read()) != -1) {
                bufOut.write(i);
            }
            bufOut.flush();
            bufOut.close();
            bufRead.close();
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.print("Ошибка: "+e.toString());
            System.out.println();
        }
        System.out.println(searchWord());
    }



    public static void creator() {
        String str1 = "Serializability of a class is enabled by the class implementing the java.io. Serializable interface. ";
        StringBuilder stringBuilder1 = new StringBuilder(str1);
        for (int i = 0; i < str1.length(); i++) {
            stringBuilder1.append(str1);
        }

        String str2 = "All string literals in Java programs, such as {@code \"abc\"}, are implemented as instances of this class.";
        StringBuilder stringBuilder2 = new StringBuilder(str2);
        for (int i = 0; i < str2.length(); i++) {
            stringBuilder2.append(str2);
        }

        OutputStream out;

        try {
            out = new FileOutputStream("abc.txt");
            byte[] bytesABC = stringBuilder1.toString().getBytes();
            out.write(bytesABC);
            out.close();
            out = new FileOutputStream("xyz.txt");

            byte[] bytesXYZ = stringBuilder2.toString().getBytes();
            out.write(bytesXYZ);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean searchWord() {
        try {
            Scanner scanner = new Scanner(new FileInputStream("abc.txt"));
            while (scanner.hasNext()) {
                if (scanner.next().equals("string"))
                    return true ;
            }
            scanner.close();
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.print("Ошибка: "+e.toString());
            System.out.println();
        } return false;
    }
}