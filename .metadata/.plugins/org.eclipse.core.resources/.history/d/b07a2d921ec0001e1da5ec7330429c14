package com.tcs.Exception;
import java.io.*;

public class TestException {
	public static Exception method(RuntimeException r) throws Exception{
		if(r==null) {
			throw new Exception("poyachii");
		}
		else {
			return new RuntimeException("returning without Exception");
		}
	}

	public static void main(String[] args) {
		
		try {
			Exception e=method(new RuntimeException());
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
/*
		try {
			FileInputStream fis=new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		/*try {
		System.out.println(10/0);
		
		
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			//System.out.println(e.toString());
		}
		
		System.out.println("after division");*/
		
	}

}
