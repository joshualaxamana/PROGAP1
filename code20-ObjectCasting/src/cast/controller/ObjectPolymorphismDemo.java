package cast.controller;

import cast.model.*;

public class ObjectPolymorphismDemo {

	public static void main(String[] args) {
		
		//polymorphism
		//<parent class> obj = new <child class>();
		
		//widening or implicit or upcasting
		Animal animal = new Mammal();
		displayMessage(animal);
		
		//now change te animal to become Avian
		//widening or implicit or upcasting
		animal = new Avian();
		displayMessage(animal);
		
		//what about Reptile, no problem
		//widening or implicit or upcasting
		animal = new Reptile();
		displayMessage(animal);
		
		animal = new Canine();
		displayMessage(animal);
		
		animal = new Feline();
		displayMessage(animal);
		
		animal = new Owl();
		displayMessage(animal);
		
		animal = new Hawk();
		displayMessage(animal);
		
		animal = new Crocodile();
		displayMessage(animal);
		
		animal = new Cobra();
		displayMessage(animal);
		
	}
	
	public static void displayMessage(Animal obj) {
		if (obj instanceof Canine) {
			//narrowing or explicit or downcasting
			/*Mammal mammal = (Mammal) obj;
			mammal.display();*/
			
			//or
			((Canine)obj).display();
		} else if (obj instanceof Canine) {
			((Canine)obj).display();
		} else if (obj instanceof Feline) {
			((Feline)obj).display();
		} else if (obj instanceof Owl) {
			((Owl)obj).display();
		} else if (obj instanceof Hawk) {
			((Hawk)obj).display();
		} else if (obj instanceof Crocodile) {
			((Crocodile)obj).display();
		} else if (obj instanceof Cobra) {
			((Cobra)obj).display();
		} else if (obj instanceof Mammal) {
			//narrowing or explicit or downcasting
			/*Mammal mammal = (Mammal) obj;
			mammal.display();*/
			
			//or
			((Mammal)obj).display();
			
		} else if (obj instanceof Avian) {
			((Avian)obj).display();
			
		} else if (obj instanceof Reptile) {
			((Reptile)obj).display();
			
		} else if (obj instanceof Animal) {
			((Animal)obj).display();
			
		}
	}

}
