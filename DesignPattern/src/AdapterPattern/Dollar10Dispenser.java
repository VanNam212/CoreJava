/**
 * 
 */
package AdapterPattern;

/**
 * @author VanNam212
 *
 */
public class Dollar10Dispenser implements DispenseChain {

	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain next) {
		// TODO Auto-generated method stub
		this.chain = next;
	}

	@Override
	public void dispense(Currency cur) {
		// TODO Auto-generated method stub
		if (cur.getAmount() >= 10) {
			int num = cur.getAmount() / 10;
			int remainder = cur.getAmount() % 10;
			System.out.println("Dispensing " + num + " 10$ note");
			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));
		} else {
			this.chain.dispense(cur);
		}
	}

}
