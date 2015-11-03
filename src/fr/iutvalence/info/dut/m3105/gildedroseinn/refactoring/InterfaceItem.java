package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

public interface InterfaceItem {

	public abstract String getName();

	public abstract void setName(String name);

	public abstract int getSellIn();

	public abstract void setSellIn(int sellIn);

	public abstract int getQuality();

	public abstract void setQuality(int quality);

	public abstract void updateQuality();

	public abstract void updateSellIn();
	
	public abstract void updateStat();

}