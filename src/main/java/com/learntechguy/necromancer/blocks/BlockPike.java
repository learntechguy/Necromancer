package com.learntechguy.necromancer.blocks;

import com.learntechguy.necromancer.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPike extends Block {

	public BlockPike() {
		super(Material.WOOD);
		setUnlocalizedName(Reference.NecromancerBlocks.PIKE.getUnlocalizedName());
		setRegistryName(Reference.NecromancerBlocks.PIKE.getRegistryName());
		this.setCreativeTab(CreativeTabs.MATERIALS);
	}
}
