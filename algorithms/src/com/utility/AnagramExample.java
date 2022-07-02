package com.utility;

import java.util.HashMap;

class AnagramDemo{
	
	String st1,st2;
	
	public AnagramDemo(String str1,String str2){
		
		st1=str1;
		st2=str2;
	}
	
	public boolean isAnag(){
		
		int len1,len2;
		HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
		
		len1=st1.length();
		len2=st2.length();
		 
		if(len1!=len2){
			System.out.println("both String cant be anagrams....");
		    System.exit(-1);
		 
		}
		
		if(len1==len2){
		for(int i=0;i<len1;i++){
		
			if(!mp.containsKey(st1.charAt(i)))
			 mp.put(st1.charAt(i),1);
			else{
				 
				mp.put(st1.charAt(i),mp.get(st1.charAt(i))+1);
			}
			
			
		}
		
		System.out.println(mp.toString());
		
			for(int j=0;j<len2;j++){
				
		      		mp.put(st2.charAt(j),mp.get(st2.charAt(j)-1));
			
				
		}
			System.out.println(mp.toString());
	
		for(Integer ar:mp.values()){
			
			if(ar!=null){
				
				System.out.println("Both Strings cant be anagrams!!!! Exiting");
				System.exit(-1);
				
			}
		}
		
		System.out.println("Both Strings are Anagrams!!!");
		}
		
		
		return true;
	}
}


public class AnagramExample {

	public static void main(String...arg){

		AnagramDemo ad=new AnagramDemo("abcnb","abcbn");
		ad.isAnag();
		
	}
	
}
