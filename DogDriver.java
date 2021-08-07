//import java.util.Scanner;

/**
 * 
 * @author Tobechi Onwenu
 * Driver class to test Dog class and Animal Shelter
 */
public class DogDriver {

	public static void main(String[] args) {
//		Dog myDog = new Dog(false, 3, "Chuck");
//		Dog yourDog = new Dog(true, 2, "Bobby");
		Dog dog1 = new Dog("Chukky", 5);
		Dog dog2 = new Dog("Terry", 2);
		Dog dog3 = new Dog("Jack", 3);
		Dog dog4 = new Dog("Custo", 5);
		Dog dog5 = new Dog("Mark", 2);
		Dog dog6 = new Dog("Longo", 4);
		Dog dog7 = new Dog("Plies", 6);
		Dog dog8 = new Dog("Sugar", 3);

//		System.out.println("Is dog 1 eating");
//		dog1.eat();
//		System.out.println();
//		System.out.println(myDog.equals(yourDog));
//
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter the name of your dog here: ");
//		String name = input.next();
//
//		System.out.println("Enter the age of your dog here: ");
//		int age = input.nextInt();
//
//		yourDog.setAnimalName(name);
//		yourDog.setAge(age);
//
//		System.out.println("The name of your dog is " + myDog.getName() + " and age is " + myDog.getAge());
//
//		System.out.println(myDog);

		AnimalShelter shelter1 = new AnimalShelter("Save a Pet", 10, 1);
		shelter1.addAnimal(dog4);
		shelter1.addAnimal(dog1);
		shelter1.addAnimal(dog3);
		shelter1.addAnimal(dog2);

		AnimalShelter shelter2 = new AnimalShelter("Give to Pets", 12, 2);
		shelter2.addAnimal(dog5);
		shelter2.addAnimal(dog8);
		shelter2.addAnimal(dog7);
		shelter2.addAnimal(dog6);

		System.out.println(shelter1);

		System.out.println("Does shelter" + shelter1.getShelterId() + " shelter contain " + dog1.getName() + ": "
				+ shelter1.contains(dog1));
		System.out.println("Does " + shelter1.getShelterName() + " shelter contain " + dog2.getName() + ": "
				+ shelter1.contains(dog2));
		System.out.println("Does " + shelter1.getShelterName() + " shelter contain " + dog5.getName() + ": "
				+ shelter1.contains(dog5));
		System.out.println("Does " + shelter1.getShelterName() + " shelter contain an dog of age 2: "
				+ shelter1.containsDogAge(2));
		System.out.println("Does " + shelter1.getShelterName() + " shelter contain an dog of age 7: "
				+ shelter1.containsDogAge(7));
		System.out.println("Shelter1 min age is " + shelter1.minAge().getAge());
		System.out.println("Shelter1 max age is " + shelter1.maxAge().getAge());
		System.out.println("Cage index for " + dog2.getName() + " is " + shelter1.cageIndex(dog2));
		System.out
				.println("Cage index for " + dog4.getName() + " based on dog name is " + shelter1.searchDogName(dog4));
		System.out.println("Cage index is of " + dog5.getName() + " is " + shelter1.cageIndex(dog5) + " which means "
				+ dog5.getName() + " is not found");
		System.out.println("Cage index is of " + dog5.getName() + " based on dog name is "
				+ shelter1.searchDogName(dog5) + " which means " + dog5.getName() + " is not found");

		shelter1.removeDog(dog2);

		System.out.println("\n\n after removal" + shelter1);

		System.out.println("\n\n" + shelter2);

		System.out.println("Does shelter" + shelter2.getShelterId() + " shelter contain " + dog1.getName() + ": "
				+ shelter2.contains(dog1));
		System.out.println("Does " + shelter2.getShelterName() + " shelter contain " + dog5.getName() + ": "
				+ shelter2.contains(dog5));
		System.out.println("Does " + shelter2.getShelterName() + " shelter contain " + dog8.getName() + ": "
				+ shelter2.contains(dog8));
		System.out.println("Does " + shelter2.getShelterName() + " shelter contain an dog of age 4: "
				+ shelter2.containsDogAge(4));
		System.out.println("Does " + shelter2.getShelterName() + " shelter contain an dog of age 1: "
				+ shelter2.containsDogAge(1));
		System.out.println("Shelter2 min age is " + shelter2.minAge().getAge());
		System.out.println("Shelter1 max age is " + shelter2.maxAge().getAge());
		System.out.println("Cage index for " + dog6.getName() + " is " + shelter2.cageIndex(dog6));
		System.out
				.println("Cage index for " + dog7.getName() + " based on dog name is " + shelter2.searchDogName(dog7));
		System.out.println("Cage index is of " + dog3.getName() + " is " + shelter2.cageIndex(dog3) + " which means "
				+ dog3.getName() + " is not found");
		System.out.println("Cage index is of " + dog3.getName() + " based on dog name is "
				+ shelter2.searchDogName(dog3) + " which means " + dog3.getName() + " is not found");

		shelter2.removeDog(dog7);

		System.out.println("\n\n after removal" + shelter2);

		System.out.println("\nDoes shelter1 have desame shelterId as shelter1: " + shelter1.equals(shelter1));
		System.out.println("Does shelter1 have desame shelterId as shelter2: " + shelter1.equals(shelter2) + "\n\n");

		// Iterator enhanced for loop
		for (Dog dog : shelter1) {
			System.out.println(dog);
		}

		AnimalShelterLinked shelterLink = new AnimalShelterLinked("Linked Shelter");
		shelterLink.addDogLink(dog5);
		shelterLink.addDogLink(dog8);
		shelterLink.addDogLink(dog7);
		shelterLink.addDogLink(dog6);

		System.out.println(shelterLink);

		shelterLink.removeDogLink(dog6);

		System.out.println(shelterLink);

	}

}
