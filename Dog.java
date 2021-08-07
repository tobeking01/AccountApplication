/**
 * 
 * @author TOON001 Description: An Application that helps keep trcks of the dogs
 *         in an Animal shelter
 *
 */
public class Dog extends Animal implements Comparable<Dog>{

	private boolean isBullDog;
	private int id;
	private static int dogId = 0;

	/**
	 * Constructor based on the dogName and age
	 * 
	 * @param dogName
	 * @param age
	 */
	public Dog(String name, int age) {
		super(name,age);
		id = ++dogId;
	}

	/**
	 * Constructor based of if bullDog, age and dog name
	 * 
	 * @param bullDog
	 * @param age
	 * @param name
	 */
	public Dog(boolean bullDog, int dogAge, String name) {
		super(name, dogAge);
		isBullDog = bullDog;
		id = ++dogId;

	}
	
	public void eat() {
		super.eat();
		System.out.println("I am eating dog food");
	}

	/**
	 * equals method based on dog id
	 * @param other
	 * @return
	 */
	public boolean equals(Object other) {
		if (other instanceof Dog) {
			return this.id == ((Dog) other).id;
		}else {
			return false;
			}
		}

	/**
	 * getMethod for isBullDog
	 * @return
	 */
	public boolean getIsBullDog() {
		return isBullDog;
	}

	
	/**
	 * getId method
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * setIsBullDog method
	 * @param bullDog
	 */
	public void setIsBullDog(boolean bullDog) {
		isBullDog = bullDog;
	}

	
	/**
	 * setId method
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * toString method for dogName and age
	 */
	public String toString() {
		String temp = super.toString();
//		temp += "\t" + isBullDog + "\t" + id;
		return temp;
	}

	@Override
	public int compareTo(Dog other) {
		return this.id - other.id;
	}

//	public int compareTo(Animal data) {
//		return this.getAge() - data.getAge();
//	}
}
