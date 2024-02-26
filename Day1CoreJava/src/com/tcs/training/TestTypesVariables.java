package com.tcs.training;

public class TestTypesVariables {

     public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c=0;
		if(a<10) {
			c= a+b;
		}
		if(a>=10) {
			c=a-b;
		}		
		System.out.println(c);
		
		boolean result = a>b && a>c;
		System.out.println(result);
		//false and true are boolean literals.
		result =false == false;
		result=false == result;
		result=!true;
		boolean flag=true;
		if(flag=true)
			System.out.println(flag);
		else
			System.out.println(flag);
		
		a=-20;
		if(a>0) {
			System.out.println("positive");
		}else if(a<0){
			System.out.println("negative");
		}else {
			System.out.println("zero");
		}
		
		int total=400;
		int subjects=6;
		//wap to print the grade a+ a b c d
		double avg=total/subjects;
		if(avg>=90) {
			System.out.println("A+");
		}
		else if(avg>=80) {
			System.out.println("A");
		}
		else if(avg>=70) {
			System.out.println("B");
		}
		else if(avg>=50) {
			System.out.println("C");
		}
		else {
			System.out.println("D Fail");
		}
	}
}
