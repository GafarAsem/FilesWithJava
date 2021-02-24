package com.company;

import java.io.*;
import java.util.ArrayList;

public class Downloadfiles {

    public static void main(String[] args) throws IOException {

        FileReader file=new FileReader("C:\\Users\\DELL\\IdeaProjects\\FilesWithJava\\src\\hello.txt");
        BufferedReader br = new BufferedReader(file);
        //read BufferedReader Object
       for(Object r:br.lines().toArray()){
           print(r);
       }

    }
    public static void print(Object o){
        System.out.println(o);
    }


}
