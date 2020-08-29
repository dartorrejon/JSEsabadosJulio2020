package com.educacionit.tiposdecolecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class AppDemostracion {

	public static void main(String[] args) {
		//Solucionamos la falta de Sincronizacion 
		//mediante metodos que actuan de wrapper 
		//Set set = Collections.synchronizedSet( new HashSet());
		//SortedSet sortedSet = Collections.synchronizedSortedSet( new TreeSet());
		//Set set2 = Collections.synchronizedSet( new LinkedHashSet());
		
		List list = Collections.synchronizedList(new ArrayList());
		List list2 = Collections.synchronizedList(new LinkedList());
		
		List milista = new ArrayList<>();
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		milista.add(obj1);
		milista.add(obj2);
		milista.add(obj3);
		milista.add(obj1);
		milista.add(obj2);
		milista.add(obj3);
		
		System.out.println("Esta vacia la lista ?" +milista.isEmpty());
		System.out.println("cuntos elemento tiene la lista ? " +milista.size());
		
		
		
		
		
		
		final Set hashSet = new HashSet( 1_000_000);
		final Long startHashSetTime = System.currentTimeMillis();
		for(int i = 0 ; i < 1_000_000 ; i++ ) {
			hashSet.add(i);
		}		
		final Long endHashSetTime = System.currentTimeMillis();
		System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));
		
		final Set treeSet = new TreeSet();
		final Long startTreeSetTime = System.currentTimeMillis();
		for(int i = 0 ; i < 1_000_000 ; i++ ) {
			treeSet.add(i);
		}	
		final Long endTreeSetTime = System.currentTimeMillis();
		System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));
		
		
		final Set linkedHashSet = new LinkedHashSet(1_000_000);
		final Long startLinkedSetTime = System.currentTimeMillis();
		for(int i = 0 ; i < 1_000_000 ; i++ ) {
			linkedHashSet.add(i);
		}	
		final Long endLinkedSetTime = System.currentTimeMillis();
		System.out.println("Time spent by LinkedHashSet: " + (endLinkedSetTime - startLinkedSetTime));
		
		
	}

}
