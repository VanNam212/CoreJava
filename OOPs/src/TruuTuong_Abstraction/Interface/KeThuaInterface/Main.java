/**
 * 
 */
package TruuTuong_Abstraction.Interface.KeThuaInterface;

/**
 * @author VanNam212
 *
 */
public class Main implements Showable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj = new Main();
		obj.print();
		obj.show();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
	}

}
