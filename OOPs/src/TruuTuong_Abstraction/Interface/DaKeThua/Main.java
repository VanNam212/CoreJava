/**
 * 
 */
package TruuTuong_Abstraction.Interface.DaKeThua;

/**
 * @author VanNam212
 *
 */
public class Main implements Printable, Showable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		main.show();
		main.print();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print");
	}

}
