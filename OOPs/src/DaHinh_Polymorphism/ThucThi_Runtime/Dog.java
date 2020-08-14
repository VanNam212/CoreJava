/**
 * 
 */
package DaHinh_Polymorphism.ThucThi_Runtime;

/**
 * @author VanNam212
 *
 */
public class Dog extends Animal {

	int number = 2;

	void eat() {
		System.out.println("dog is eating...");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Dog();
		animal.eat(); // dog is eating...
		System.out.println(animal.number); // 1
	}

}
