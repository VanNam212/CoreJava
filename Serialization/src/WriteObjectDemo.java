import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 
 */

/**
 * @author VanNam212
 *
 */
public class WriteObjectDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("src/customer.dat")));
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("kai");
		customer.setAddress("ha noi");

		System.out.println("Customer before serialization:");
		System.out.println(customer);
		
		/**
		 * Method writeObject() sẽ kiểm tra đối tượng được ghi có phải là serializable
		 * không, sau đó sẽ chuyển thành byte và thực hiện khi.
		 */
		oos.writeObject(customer);
		oos.close();
	}

}
