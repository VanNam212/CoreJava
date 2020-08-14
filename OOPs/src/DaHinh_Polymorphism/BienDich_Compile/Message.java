/**
 * overloading methods
 */
package DaHinh_Polymorphism.BienDich_Compile;

/**
 * @author VanNam212
 *
 */
public class Message {

	void show() {
		System.out.println("hello");
	}

	void show(String msg) {
		System.out.println(msg);
	}

	String show(int number) {
		return ("it's: " + number);
	}

}
