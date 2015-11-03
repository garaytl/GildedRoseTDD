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
		Item vestSwag = new Item("+5 Dexterity Vest", 10, 20);
		myShop.updateItem(vestSwag);
		assertEquals(vestSwag.getQuality(),19);
		assertEquals(vestSwag.getSellIn(),9);
		
	}
	

}