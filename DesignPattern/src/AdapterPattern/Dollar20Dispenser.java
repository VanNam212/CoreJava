/**
 * 
 */
package AdapterPattern;

/**
 * @author VanNam212
 *
 */
public class Dollar20Dispenser implements DispenseChain {

	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain next) {
		// TODO Auto-generated method stub
		this.chain = next;
	}

	@Override
	public void dispense(Currency cur) {
		// TODO Auto-generated method stub
		if (cur.getAmount() >= 20) {
			int num = cur.getAmount() / 20;
			int remainder = cur.getAmount() % 20;
			System.out.println("Dispensing " + num + " 20$ note");
			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));
		} else {
			this.chain.dispense(cur);
		}
	}

}
