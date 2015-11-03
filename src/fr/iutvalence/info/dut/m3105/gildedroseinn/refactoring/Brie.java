package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

public class Brie extends Item{

	public Brie(String name, int sellIn, int quality) 
	{
		super(name, sellIn, quality);	
	}
	
	public void updateQuality()
	{
		this.setQuality(this.quality+1);
	}
	public void updateSellIn()
	{
		this.setSellIn(this.sellIn-1);
	}
	

}
