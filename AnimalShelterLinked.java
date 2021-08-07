
public class AnimalShelterLinked {
	
	private String shelterName;
	private Node<Animal> head;
	private int manyNodes;
	private static int numShelters = 0;
	private int shelterId;

	public AnimalShelterLinked (String name) {
		shelterName = name;
		head = null;
		manyNodes = 0;
		numShelters++;
		shelterId = 0;
	}
	
	public void add(Dog dogToAdd) {
		head = new Node<Animal>(dogToAdd, head);
		manyNodes++;
	}
	
	public void addDogLink(Dog dogToAdd) {
		if (head == null) {
			head = new Node<Animal>(dogToAdd, null);
		}else if (dogToAdd.compareTo((Dog) head.getData()) > 0) {
			head = new Node<Animal>(dogToAdd, head);
		}else {
			Node<Animal> previous = findPreviousNodeAdd(dogToAdd);
			previous.setLink(new Node<Animal>(dogToAdd, previous.getLink()));
		}
	}
	
	public void removeDogLink(Dog dogToRemove) {
		if (head != null && head.getData().equals(dogToRemove)) {
			head = head.getLink();
		}else if (head != null) {
			Node<Animal> previous = findPreviousNodeRemove(dogToRemove);
			previous.setLink(previous.getLink().getLink());
		}
	}
	
	private Node<Animal> findPreviousNodeRemove(Dog dogToRemove) {
		Node<Animal> cursor = head;
		while (cursor.getLink() != null && !cursor.getLink().getData().equals(dogToRemove)) {
			cursor = cursor.getLink();
		}
		return cursor;
	}

	private Node<Animal> findPreviousNodeAdd(Dog dogToAdd) {
		Node<Animal> cursor = head;
		while(cursor.getLink() != null && ((Dog) cursor.getLink().getData()).compareTo(dogToAdd) > 0) {
			cursor = cursor.getLink();
		}
		return cursor;
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
		
		Node<Animal> cursor = head;
		while(cursor != null) {
			temp += cursor.getData() + "\n";
			cursor = cursor.getLink();
		}
		return temp;
	}

}
