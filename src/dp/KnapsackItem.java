package dp;

public class KnapsackItem {
	
	private int itemWeight;
	private int itemValue;
	
	
	public KnapsackItem(int itemValue, int itemWeight) {
		super();
		this.itemWeight = itemWeight;
		this.itemValue = itemValue;
	}
	/**
	 * @return the itemWeight
	 */
	public int getItemWeight() {
		return itemWeight;
	}
	/**
	 * @param itemWeight the itemWeight to set
	 */
	public void setItemWeight(int itemWeight) {
		this.itemWeight = itemWeight;
	}
	/**
	 * @return the itemValue
	 */
	public int getItemValue() {
		return itemValue;
	}
	/**
	 * @param itemValue the itemValue to set
	 */
	public void setItemValue(int itemValue) {
		this.itemValue = itemValue;
	}
	
	

}
