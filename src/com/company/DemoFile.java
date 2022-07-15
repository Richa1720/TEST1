package com.company;

import java.io.*;

public class DemoFile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //InputStreamReader raj = new InputStreamReader(System.in);
        //BufferedReader br=new BufferedReader(raj);
        System.out.println("Enter the value of a : ");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter the value of b : ");
        int b = Integer.parseInt(br.readLine());
        System.out.println("a is : " + a);
        System.out.println("b is : " + b);
        int sum = a + b;
        System.out.println("the value of sum is : " + sum);

    }//main closed
}//class closed
