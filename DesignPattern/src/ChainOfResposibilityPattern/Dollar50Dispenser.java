/**
 * 
 */
package ChainOfResposibilityPattern;

/**
 * @author VanNam212
 *
 */
public class Dollar50Dispenser implements DispenseChain {

	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain next) {
		// TODO Auto-generated method stub
		this.chain = next;
	}

	@Override
	public void dispense(Currency cur) {
		// TODO Auto-generated method stub
		if (cur.getAmount() >= 50) {
			int num = cur.getAmount() / 50;
			int remainder = cur.getAmount() % 50;
			System.out.println("Dispensing " + num + " 50$ note");
			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));
		} else {
			this.chain.dispense(cur);
		}
	}

}
