package com.java.vinay.inputOutput;
import java.io.*;

class MyInputOutputExample2 {
   public static void main(String args[]) throws IOException
   {
      BufferedInputStream bis = new BufferedInputStream (new DataInputStream(System.in));
      System.out.println("Enter your Remarks");
      char a = (char)bis.read();
      System.out.println(a);
      
      DataInputStream dataInputStream = new DataInputStream(System.in);
      System.out.println("Enter your Remarks");
      System.out.println(dataInputStream.readLine());

   }
}