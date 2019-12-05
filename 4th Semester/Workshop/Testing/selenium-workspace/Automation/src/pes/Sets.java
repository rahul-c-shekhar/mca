package pes;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		
		//Creating object of hashSet
		Set<String> hs = new HashSet<String>();
	
		//Adding data to the set
		hs.add("a");
		hs.add("b");
		hs.add("b");
		hs.add("c");
		hs.add(null);
		
		//To get the size of the hashSet
		int count = hs.size();
		System.out.println("Set size : "+count);
		
		System.out.println("After adding the data : ");
		
		//To print each data in the hashSet
		for(String s :hs)
		{
			System.out.println(s);
		}
	
		//To remove the data in the hashSet
		hs.remove(null);
		
		System.out.println("After removing the data : ");
		
		//To print each data in the hashSet
		for(String s :hs)
		{
			System.out.println(s);
		}
	}

}
