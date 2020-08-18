/**
 * 
 */
package AdapterPattern;

/**
 * @author VanNam212
 *
 */
public interface DispenseChain {

	void setNextChain(DispenseChain next);

	void dispense(Currency cur);

}
