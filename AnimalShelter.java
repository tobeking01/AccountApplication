import java.util.Iterator;

/**
 * 
 * 
 * @author TOON001 Project Name: Animal Shelter Desc: An application for the
 *         Animal shelter
 *
 */
public class AnimalShelter implements Iterable<Dog> {

	private String shelterName;
	private Dog[] dog;
	private int numAnimals;
	private static int numShelters = 0;
	private int shelterId;

	/**
	 * Constructor based on Shelter name and maxAnimals allowed in the shelter(added
	 * into array)
	 * 
	 * @param name
	 * @param maxAnimals
	 */
	public AnimalShelter(String name, int maxAnimals, int shelterIds) {
		shelterName = name;
		dog = new Dog[maxAnimals];
		numAnimals = 0;
		numShelters++;
		shelterId = shelterIds;
	}

	public boolean removeDog(Dog dogToRemove) {
		int index = findStore(dogToRemove);
		if(index == -1) {
			return false;
		}
		for (int i = index + 1; i < numAnimals; i++) {
			dog[i - 1] = dog[i];
		}
		numAnimals--;
		return true;
	}
	
	public int findStore(Dog target) {
		for(int i = 0; i < numAnimals; i++) {
			if(dog[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * method to add a dog into the Animal Shelter array
	 * 
	 * @param dogToAdd
	 */
	public void addAnimal(Dog dogToAdd) {
//		dog[numAnimals++] = dogToAdd;
		if (numAnimals < dog.length) {
			int i;
			for (i = numAnimals -1; i >=0 && dog[i].compareTo(dogToAdd) > 0; i--) {
				dog[i +1] = dog[i];
			}
			dog[i+1]= dogToAdd;
			numAnimals++;	
		}else {
			System.out.println("Full");
		}
	}

	/**
	 * method to add a dog into Animal shelter based on Dog class constructor
	 * (parameters)
	 * 
	 * @param bullDog
	 * @param age
	 * @param name
	 */
	public void addAnimal(String name, int age) {
		addAnimal(new Dog("shleby", 2));
	}

	/**
	 * Linear search: used if you do not know how many things are in an array
	 * collection contains method using linear search to find true if a dog is in
	 * this Animal shelter
	 * 
	 * @param target
	 * @return
	 */
	public boolean contains(Dog target) {
		for (int i = 0; i < numAnimals; i++) {
			if (dog[i].equals(target)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Linear search: used if you do not know how many things are in an array
	 * collection contains method using linear search to find true if an age is in
	 * this Animal shelter
	 * 
	 * @param target
	 * @return
	 */
	public boolean containsDogAge(int target) {
		for (int i = 0; i < numAnimals; i++) {
			if (dog[i].getAge() == target) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Linear search: used if you do not know how many things are in an array
	 * collection method to find the array position(cage Index) where the dog can be
	 * found in an Animal Shelter
	 * 
	 * @param target
	 * @return
	 */
	public int cageIndex(Dog target) {
		for (int i = 0; i < numAnimals; i++) {
			if (dog[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Linear search: used if you do not know how many things are in an array
	 * collection method to find the array position(cage Index) where the dog can be
	 * found in an Animal Shelter based on dogName
	 * 
	 * @param target
	 * @return
	 */
	public int searchDogName(Dog target) {
		for (int i = 0; i < numAnimals; i++) {
			if (dog[i].getName().equalsIgnoreCase(target.getName())) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Dog class method to find the min age of the dogs in an Animal Shelter
	 * 
	 * @return minAge
	 */
	public Dog minAge() {
		Dog min = dog[0];
		for (int i = 0; i < numAnimals; i++) {
			if (min.getAge() > dog[i].getAge()) {
				min = dog[i];
			}
		}
		return min;
	}

	/**
	 * Dog class method to find the max age of the dogs in an Animal Shelter
	 * 
	 * @return maxAge
	 */
	public Dog maxAge() {
		Dog max = dog[0];
		for (int i = 0; i < numAnimals; i++) {
			if (max.getAge() < dog[i].getAge())
				max = dog[i];
		}
		return max;
	}

	/**
	 * getName method
	 * 
	 * @return
	 */
	public String getShelterName() {
		return shelterName;
	}

	/**
	 * getNumAnimals method
	 * 
	 * @return
	 */
	public int getNumAnimals() {
		return numAnimals;
	}

	/**
	 * @return ShelterId
	 */
	public int getShelterId() {
		return shelterId;
	}

	/**
	 * toString method for Animal Shelter based on Dog toString
	 */
	public String toString() {
		String temp = "";
		temp += "Shelter" + shelterId + "\n";
		temp += "Shelter Name: " + shelterName + "\n";
		temp += "Pet name \t Age\n";
		temp += "************************************\n";
		for (int i = 0; i < numAnimals; i++) {
			temp += dog[i] + "\n";
		}

		return temp;
	}

	 @Override
	 public Iterator<Dog> iterator() {
	 return new DogIterator();
	 }

	private class DogIterator implements Iterator<Dog> {

		int cursor = 0;

		@Override
		public boolean hasNext() {
			return cursor < numAnimals;
		}

		@Override
		public Dog next() {
			return dog[cursor++];
		}

	}
}
