package Collections.mapProblem;

import java.math.BigDecimal;

public class OrderItem {
	private BigDecimal netValue;
	private int quantity;

	/**
	 * @return the netValue
	 */
	public BigDecimal getNetValue() {
		return netValue;
	}

	/**
	 * @param netValue the netValue to set
	 */
	public void setNetValue(BigDecimal netValue) {
		this.netValue = netValue;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrderItem [netValue=" + netValue + ", quantity=" + quantity + "]";
	}
}
