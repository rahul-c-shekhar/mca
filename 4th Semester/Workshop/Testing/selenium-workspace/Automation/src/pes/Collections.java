package pes;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		List<String> a =new ArrayList<>();
		
		int	n = a.size();
		System.out.println("Array size : "+n);
		
		a.add("a");
		a.add("b");
		a.add("b");
		a.add(null);
		
		n = a.size();
		System.out.println("Array size : "+n);
		
		System.out.println("ArrayList elements : ");	
		for(int i = 0; i < n; i++)
		{
			System.out.println(a.get(i));
		}
	}

}
