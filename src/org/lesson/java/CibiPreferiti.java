package org.lesson.java;

public class CibiPreferiti {

	public static void main(String[] args) {
		String[] favoriteFoods = {"CARBONARA", "PIZZA", "HAMBURGER", "PASTA AL PESTO", "ARROSTO", "SPEZZATINO"};
		
		System.out.println(favoriteFoods.length);
		System.out.println(favoriteFoods[0]);
		System.out.println(favoriteFoods[favoriteFoods.length - 1]);
		
		
		// CIBO IN MEZZO AL ARRAY
		System.out.println(favoriteFoods[favoriteFoods.length / 2 - 1] );

	}

}
