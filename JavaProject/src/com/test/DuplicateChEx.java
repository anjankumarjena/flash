package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateChEx {

	public static void main(String[] args) {
		
		String dup= "HelloHellotest";
		char[]ch = dup.toCharArray();
		List<Character>list= new ArrayList<>();
		
		for(char c:ch){
			list.add(c);
		}

		List<Character> wdup = list.stream().distinct().collect(Collectors.toList());
		 
		String str="";
		for(char c:wdup){
			str = str + c;
		}
		
		System.out.println("without duplicates: "+str);
	}

}
