package io_programming;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadMain2 {

    public static void main(String[] args) {

        String filepath = "./src/resourses/greetings.txt";

        FileInputStream fin = null;

        try {

            fin = new FileInputStream(filepath);

            while (true) {

                int charValue = fin.read();

                if (charValue == -1)
                    break;

                char ch = (char) charValue;

                System.out.print(ch);
            }

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            try {

                if (fin != null)
                    fin.close();

            } catch (IOException e) {

                e.printStackTrace();
            }
        }
    }
}