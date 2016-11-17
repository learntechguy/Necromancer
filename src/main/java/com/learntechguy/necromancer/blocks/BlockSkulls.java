package com.learntechguy.necromancer.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.learntechguy.necromancer.Reference;

public class BlockSkulls extends Block {
	public BlockSkulls() {
		super(Material.ROCK);
		this.setUnlocalizedName(Reference.NecromancerBlocks.SKULLS.getUnlocalizedName());	
		this.setRegistryName(Reference.NecromancerBlocks.SKULLS.getRegistryName());
	}
}
