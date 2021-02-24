package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        //open file
        File file = new File("hello.txt");
        if(!file.exists()){
            file.createNewFile();
        }

        FileWriter fileWriter=new FileWriter(file);
        fileWriter.append("hello mr gafar /n hello");
//        //...........close to write file............
        fileWriter.flush();
        fileWriter.close();

         Scanner fileReader = new Scanner(file) ;
//        //............print file text..............
         while (fileReader.hasNextLine())
         print(fileReader.nextLine());

        //..............get Info file................
        print(file.getPath());
        print(file.getTotalSpace());
        print(file.getCanonicalPath());





    }
    public static void print(Object o){
        System.out.println(o);
    }
}
