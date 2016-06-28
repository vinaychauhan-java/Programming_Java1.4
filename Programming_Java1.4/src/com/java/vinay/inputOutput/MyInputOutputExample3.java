package com.java.vinay.inputOutput;
import java.io.*;

class MyInputOutputExample3 {
   public static void main(String args[]) throws IOException
   {
      String c;
      // Create a BufferedReader using System.in
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter 'Quit' for quit...");
      // read characters
      do {
         c = (String) br.readLine();
         System.out.println(c);
      } while(!c.equals("Quit"));
   }
}