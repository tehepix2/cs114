package Tester;

import java.util.Arrays;

import comparables.Point;
import comparables.Polynomial;
import pets.Cat;
import pets.Dog;
import pets.Pet;
import pets.Hamster;
import sorting.BasicSorting;

public class Tester {

	public static void main(String[] args) {
		System.out.println("Hw5 - interfaces");
		petExamples();
		hamsterTest();
		
		System.out.println("Hw5 - the Comparable interface");
		//polynomialTest();
		//pointTest();

		
	}
	
	public static void petExamples() {
		// Some examples of using defined interfaces and classes
		Dog lily = new Dog("Lily", 9); 
		Dog poppy = new Dog("Poppy", 3);
		Pet garfield = new Cat("Garfield", 12);
		
		// Use interface pet
		System.out.println(poppy.getName() + " is " + poppy.getAge() + " yo");
		poppy.addFriend(garfield);
		poppy.addFriend(lily);

	}
	
	
	
	public static void hamsterTest() {
		Hamster harry = new Hamster("Harry", 1);
		Pet holly = new Hamster("Holly", 2);
		Cat James = new Cat("James", 4);
		
		// Some test cases
		System.out.println(holly.getName() + " is " + holly.getAge() + " yo");
		harry.addFriend(James);
		harry.addFriend(holly);
		System.out.println(harry.getName() + "'s friends: " + Arrays.toString(harry.getAllFriends()));
		System.out.println(harry.doTrick());
		System.out.println();
		String allpets = "All pets: ";
		Pet[] myPets = new Pet[] {James, harry, holly};
		for (Pet pet: myPets) {
			allpets += pet.getName() + " "; 
		}
		System.out.println(allpets);
	}
	
	
	/*
	 * Test cases for polynomial class
	 */
	public static void polynomialTest() {
		Polynomial p0 = new Polynomial(new int[] {-4,6,5});
		Polynomial p1 = new Polynomial(new int[] {2, -1});
		Polynomial p2 = new Polynomial(new int[] {3,0,4,1});
		Polynomial p3 = new Polynomial(new int[] {-1,4});
		Polynomial p4 = new Polynomial(new int[] {3,-1});
		Polynomial p5 = new Polynomial(new int[] {0,6,5});
		Polynomial p6 = new Polynomial(new int[] {28});
		Polynomial p7 = new Polynomial(new int[] {2, -1});
		Polynomial p8 = new Polynomial(new int[] {0});
		
		Polynomial[] testPolynomials = new Polynomial[] {p0,p1,p2,p3,p4,p5,p6,p7,p8};
		
		// print polynomials
		System.out.println("Test polynomials:");
		for (int i = 0; i < testPolynomials.length;++i) {
			System.out.println(String.format("%s ,  degree %s", testPolynomials[i], 
					testPolynomials[i].getDegree()));
		}
		System.out.println();
		
		// sort
		System.out.println("**Sorting polynomial list**");
		BasicSorting.bubbleSort(testPolynomials);
		System.out.println();
		
		// After Sorting
		for (int i = 0; i < testPolynomials.length;++i) {
			System.out.println(String.format("%s ,  degree %s", testPolynomials[i], 
					testPolynomials[i].getDegree()));
		}
		System.out.println();
	}
	
	/*
	 * Test cases for class Point
	 */
	public static void pointTest() {
		Point p1 = new Point(5, 7);
		Point p2 = new Point(-4, 10);
		Point p3 = new Point(1, 3);
		Point p4 = new Point(-4, 3);
		Point p5 = new Point(2, -2);
		
		Point[] arrPoints = new Point[] {p1,p2,p3,p4,p5};
		
		BasicSorting.insertionSort(arrPoints);
		System.out.println();
		
		// After Sorting
		System.out.println("Print in order:");
		for (int i = 0; i < arrPoints.length;++i) {
			System.out.println(arrPoints[i]);
		}
	}

}
