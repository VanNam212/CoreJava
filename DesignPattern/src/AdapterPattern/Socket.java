/**
 * 
 */
package AdapterPattern;

/**
 * @author VanNam212
 *
 */
public class Socket {

	public Volt getVolt() {
		return new Volt(120);
	}

}
