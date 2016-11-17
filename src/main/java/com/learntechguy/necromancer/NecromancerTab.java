package com.learntechguy.necromancer;

import com.learntechguy.necromancer.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class NecromancerTab extends CreativeTabs {

	public NecromancerTab() {
		super("tabNecromancer");
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.brain;
	}
	
}
