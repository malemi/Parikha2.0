package pmarket;
import currencies.Money;
import market.Product;

/**
 * 
 */

/**
 * @author m
 *
 */
public class pProduct extends Product {

	@Deprecated
	public pProduct() {
		super();
	}

	private static final String KEY_LEVEL = "Level";

	public String getLevel()    {
		return ( String ) this.getUnderlyingNode().getProperty( KEY_LEVEL );
	}

	public void setLevel( String level)    {
		this.getUnderlyingNode().setProperty( KEY_LEVEL, level);
	}



}
