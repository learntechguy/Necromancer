package com.learntechguy.necromancer.items;

import com.learntechguy.necromancer.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBrain extends Item {

	public ItemBrain() {
		setUnlocalizedName(Reference.NecromancerItems.BRAIN.getUnlocalizedName());
		setRegistryName(Reference.NecromancerItems.BRAIN.getRegistryName());
		this.setCreativeTab(CreativeTabs.MATERIALS);
	}
}
