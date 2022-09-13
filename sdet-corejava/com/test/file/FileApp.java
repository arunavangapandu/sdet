package com.test.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileApp {
    public static void main(String[] args) throws IOException {
        File file = new File("text");
        // creating scanner instance to read file
        Scanner scanner = new Scanner(file);
        FileWriter fileWriter = new FileWriter(file);
       // fileWriter.write("add text");
        fileWriter.append("hello");

        fileWriter.flush();
        fileWriter.close();
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}
