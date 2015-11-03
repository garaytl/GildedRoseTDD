package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class GildedRoseTest
{
	@Test
	public void aUpdateItemDecreaseByOneQualityAndSellIn()
	{
		GildedRose myShop = new GildedRose();
		InterfaceItem vestSwag = new Item("+5 Dexterity Vest", 10, 20);
		myShop.updateItem(vestSwag);
		assertEquals(vestSwag.getQuality(),19);
		assertEquals(vestSwag.getSellIn(),9);
		
	}
	@Test
	public void updateItemWhenSellInIsLowerThanZeroDecreaseQualityByTwo()
	{
		GildedRose myShop = new GildedRose();
		InterfaceItem vestSwag = new Item("+5 Dexterity Vest", -1, 20);
		myShop.updateItem(vestSwag);
		assertEquals(vestSwag.getQuality(),18);
		assertEquals(vestSwag.getSellIn(),-2);
	}
	@Test
	public void qualityWillNeverBeLowerThanZero()
	{
		GildedRose myShop = new GildedRose();
		InterfaceItem vestSwag = new Item("+5 Dexterity Vest", -1, 0);
		myShop.updateItem(vestSwag);
		assertEquals(vestSwag.getQuality(),0);
	}
	@Test
	public void qualityIncreaseWithAgeForAgedBrie()
	{
		GildedRose myShop = new GildedRose();
		InterfaceItem fromage = new Item("Aged Brie", 2, 0);
		myShop.updateItem(fromage);
		assertEquals(fromage.getQuality(),1);
		assertEquals(fromage.getSellIn(),1);
	}
}