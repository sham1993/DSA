package com.shamshad.Arrays_ArraysList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
      
      list.add(12);
      list.add(122);
      list.add(1332);
      list.add(13332);
      list.add(1232324);
      
      System.out.println(list);
      
      list.set(1, 777);
      
      System.out.println(list);
      
      System.out.println(list.contains(122));
      
      
	}

}
