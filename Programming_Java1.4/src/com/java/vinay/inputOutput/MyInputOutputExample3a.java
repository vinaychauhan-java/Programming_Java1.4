package com.java.vinay.inputOutput;
import java.io.*;

class MyInputOutputExample3a {
   public static void main(String args[]) throws IOException
   {
      // Create a BufferedReader using System.in
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter First Number");
      int a = Integer.parseInt(br.readLine());
      System.out.println("Enter Second Number");
      int b = Integer.parseInt(br.readLine());
      int c=a+b;
      System.out.println("Result of two number is "+c);
   }
}