package com.puzzle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Class to find out whether a string is having Unique 
 * Characters
 * */

public class UniqueString {

String str;
	
	public UniqueString(String input){
		
		str=input;
	}
	
	
/**
 * Checking the unique chars in String
 * returns ture if unique
 * false if not unique chars.
	*/
	public boolean check()
	{
    	char[] chr;
    	char ch;
    	int len=str.length();
    	chr=new char[len];
    	
    	for(int i=0;i<len;i++){
    		
    		ch=str.charAt(i);
    		if(i==0){
    			
    			chr[i]=ch;
    		}
    		
    		else{	
    		  for(int j=0;j<i;j++){
    		  	if(ch==chr[j]){
    		  		
    		  		return false;
    		  	}
    			
    		  }
    		  
    		  chr[i]=ch;
    		}
    		
    	}
    	return true;
	   }	
	
	//Main Method
	public static void main(String...arg) throws IOException{
		
		
		System.out.println("Enter the input String:-");
		//reading input
		BufferedReader bfrd=new BufferedReader(new InputStreamReader(System.in));
		String input=bfrd.readLine();
		
		//calling and checking Uniqueness of input String
		UniqueString us=new UniqueString(input);
		boolean isUnique=us.check();
		if(isUnique){
			
			System.out.println("is a unique chars");
		}
		else
			System.out.println("Not unique chars");
		
	}
	
}
