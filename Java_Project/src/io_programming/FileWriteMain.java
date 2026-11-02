package io_programming;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class FileWriteMain {

    public static void main(String[] args) {

        String filePath = "./src/resourses/cartoons.txt";

//        String data = "1. Micky and Donald\n2. Doremon\n3. Chota Bheem";
        	  String data = "4. Pink Panther\n5. Chin chan";

        try (
                FileOutputStream fout = new FileOutputStream(filePath, true);   //APPENDED mode

                BufferedOutputStream bout = new BufferedOutputStream(fout);
            )
        {

            byte[] dataBytes = data.getBytes();

            bout.write(dataBytes);

            System.out.println("Data is written to file");

        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }
}