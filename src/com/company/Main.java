package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        File pride=new File("prideprejustice.txt");
        Scanner scanner=new Scanner(pride);
        int sum=0;
        while (scanner.hasNextLine()){
            String line=scanner.nextLine();
            sum+=line.split(" ").length;
        }
        System.out.println(sum);
    }
}
