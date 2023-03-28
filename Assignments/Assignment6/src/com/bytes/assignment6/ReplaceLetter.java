package com.bytes.assignment6;
import java.nio.file.*;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;

public class ReplaceLetter {
	public static void main(String[]args) throws IOException {
		String txt=" ";
		txt=new String (Files.readString(Paths.get("C:\\\\Users\\\\ShwethaA(Intern)\\\\Desktop\\\\computerProgramming.txt")));
		System.out.println(txt);
//		
		Scanner Obj=new Scanner(System.in);
//		Obj.useDelimiter("\\Z");
		System.out.println("enter letter to be replaced ");
		String first=Obj.next();
		System.out.println("enter letter to be replaced with ");
		String second=Obj.next();
		txt=txt.replaceAll(first,second);
		System.out.println(txt);
		File file=new File("C:\\Users\\ShwethaA(Intern)\\Desktop\\computerProgramming.txt");
		Path fileName=Path.of("C:\\Users\\ShwethaA(Intern)\\Desktop\\computerProgramming.txt");
		Files.writeString(fileName, txt);
		

		
		
	}
}
