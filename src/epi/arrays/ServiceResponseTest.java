package epi.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServiceResponseTest {

	public static void main(String[] args) {
		
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		
		List<Dog> dogs = Arrays.asList(d1, d2);
		
		List<Cat> cats = Arrays.asList(c1, c2);
		
		List<? extends Animal> animals_1 = cats;
		
		
		List<Animal> animals = new ArrayList<>();
				
		animals.addAll(dogs);
		animals.addAll(cats);
		
		useSoundMethodOfAnimal(animals);
		
		ServiceRespose<Dog> dogsResponse = new ServiceRespose<>();
		dogsResponse.add(d1);
		dogsResponse.add(d2);
		
		ServiceRespose<Cat> catsResponse = new ServiceRespose<>();
		catsResponse.add(c1);
		catsResponse.add(c2);
		
	}
	
	public static void useSoundMethodOfAnimal(List<Animal> animals){
		for(Animal animal: animals){
			animal.makeSound();
		}
	}
}
