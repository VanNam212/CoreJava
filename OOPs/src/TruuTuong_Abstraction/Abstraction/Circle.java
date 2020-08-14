/**
 * 
 */
package TruuTuong_Abstraction.Abstraction;

/**
 * @author VanNam212
 *
 */
public class Circle extends Shape {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Circle();
		shape.draw(); // draw circle
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw circle");
	}

}
