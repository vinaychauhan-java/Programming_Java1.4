package com.java.vinay.inputOutput;

import java.io.*;

class MyInputOutputExample5_File
{

	public static void main(String args[]) throws IOException
	{
		// Create a BufferedReader using System.in
		BufferedInputStream bis = new BufferedInputStream(new DataInputStream(System.in));
		System.out.println("Enter the name of File...");
		char charValue;
		StringBuffer fileName = new StringBuffer(""); 
		while ((charValue=(char)bis.read())!='#'){
			fileName.append(charValue);
		}
		String fileNameWithPath = "D:\\" +fileName.toString().trim()+".txt";
		File file = new File(fileNameWithPath);
		if (!file.exists())
		{
			file.createNewFile();
			System.out.println("File has been created to the root directory");
		}
		else
		{
			file.delete();
			System.out.println("Existing File has been deleted from the root directory");
		}
		
//		// Writing to the File using PrintStream
//		FileOutputStream fileOutputStream = new FileOutputStream(file);
//		PrintStream  out = new PrintStream (fileOutputStream);
//		System.out.println("Write '#' for Saving and Closing the File...");
//		char dataLines;
//		StringBuffer fileLines = new StringBuffer("");
//		while ((dataLines=(char)bis.read())!='#'){
//			fileLines.append(dataLines);
//		}
//		out.print(fileLines.toString());
//		out.close();
		
		// Writing to the File using BufferedOutputStream
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		BufferedOutputStream  out = new BufferedOutputStream (fileOutputStream);
		System.out.println("Write '#' for Saving and Closing the File...");
		char dataChar;
		while ((dataChar=(char)bis.read())!='#'){
			out.write((int)dataChar);
			
		}
		out.close();
		//Reading from the File
		FileInputStream fileInputStream = new FileInputStream(file);
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
		int dataValue;
		while ((dataValue = bufferedInputStream.read())!=-1){
			System.out.print((char)dataValue);
			
		}
		bufferedInputStream.close();
		
	}
}