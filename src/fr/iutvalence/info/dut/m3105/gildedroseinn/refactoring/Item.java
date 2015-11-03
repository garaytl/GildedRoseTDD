package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

public class Item implements InterfaceItem
{
	protected String name;
	protected int sellIn;
	protected int quality;

	public Item(String name, int sellIn, int quality)
	{
		this.setName(name);
		this.setSellIn(sellIn);
		this.setQuality(quality);
	}

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring.InterfaceItem#getName()
	 */
	@Override
	public String getName()
	{
		return this.name;
	}

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring.InterfaceItem#setName(java.lang.String)
	 */
	@Override
	public void setName(String name)
	{
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring.InterfaceItem#getSellIn()
	 */
	@Override
	public int getSellIn()
	{
		return this.sellIn;
	}

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring.InterfaceItem#setSellIn(int)
	 */
	@Override
	public void setSellIn(int sellIn)
	{
		this.sellIn = sellIn;
	}

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring.InterfaceItem#getQuality()
	 */
	@Override
	public int getQuality()
	{
		return this.quality;
	}

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring.InterfaceItem#setQuality(int)
	 */
	@Override
	public void setQuality(int quality)
	{
		this.quality = quality;
	}
	
	/* (non-Javadoc)
	 * @see fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring.InterfaceItem#updateQuality()
	 */
	@Override
	public void updateQuality()
	{
		this.setQuality(this.quality-1);
	}
	
	/* (non-Javadoc)
	 * @see fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring.InterfaceItem#updateSellIn()
	 */
	@Override
	public void updateSellIn()
	{
		this.setSellIn(this.sellIn-1);
	}
	
	public void updateStat()
	{
		this.updateSellIn();
		this.updateQuality();
		if (this.getSellIn()<0)
			this.updateQuality();
		if (this.getQuality()<1)
			this.setQuality(0);
	}
	

}
