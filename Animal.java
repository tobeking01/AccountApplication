
public class Animal {

	private String animalName;
	private int age;
	
	
	public Animal(String name, int ages) {
		animalName = name;
		age = ages;
	}
	
	
	public void eat() {
		System.out.println("Yum, yum");
	}
	
	public String toString() {
		String temp = animalName + "\t\t" + age;
		return temp;
	}
	
	
	/**
	 * getAge method
	 * @return
	 */
	public int getAge() {
		return age;
	}

	/**
	 * getName method
	 * @return
	 */
	public String getName() {
		return animalName;
	}

	/**
	 * setAge method
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * setName method
	 * @param name
	 */
	public void setAnimalName(String name) {
		animalName = name;
	}
}
