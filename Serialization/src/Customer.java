import java.io.Serializable;

/**
 * 
 */

/**
 * @author VanNam212
 *
 */
public class Customer implements Serializable {

	// để đảm bảo chắc chắn rằng đối tượng trước và sau khi serialization là một
	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private transient String address; // không được serialization

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	// getter - setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
