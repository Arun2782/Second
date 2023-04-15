package org.inter;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Learner {
	
	public static void main(String[] args) {
		
	
	List<ArrayList<String>> l = new LinkedList<ArrayList<String>>();
	ArrayList<String> a = new ArrayList<>();
	
	a.add("subbu");
	a.add("subbu@123");
	a.add("1234566");
	ArrayList<String> a1 = new ArrayList<>();
	
	a1.add("raj");
	a1.add("raj@123");
	a1.add("1234566");
ArrayList<String> a2 = new ArrayList<>();
	
	a2.add("meena");
	a2.add("meena@123");
	a2.add("1234566");
	
	System.out.println(a2.get(2));
	
	l.add(a);
	l.add(a1);
	l.add(a2);
	String arrayList = l.get(2).get(1);
	System.out.println(arrayList);
	
	

}}