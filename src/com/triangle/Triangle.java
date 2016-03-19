package com.triangle;


public class Triangle {
	 public static String tri1(int a, int b, int c){
		 if(a+b<c||a+c<b||b+c<a){
			 return "It's not a triangle";
		 }
		 else if(a==b||b==c||c==a){
			 if(a==b&&b==c){
				 return "The triangle is the equilateral";			 
			 }
			 else{
				 return "The triangle is the isosceles";
			 }
			 
		 }
		 else{
			 return "The triangle is the scalene";
		 }
	 }
}
