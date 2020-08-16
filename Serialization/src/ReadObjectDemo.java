import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 
 */

/**
 * @author VanNam212
 *
 */
public class ReadObjectDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("src/customer.dat")));
		System.out.println("Customer after deserialization:");
		
		/**
		 * Method readObject() sẽ chuyển byte thành đối tượng Trường address là
		 * transient nên sau khi deserialization sẽ không có dữ liệu.
		 */
		Customer customer = (Customer) ois.readObject();
		System.out.println(customer);
		ois.close();

	}

}
