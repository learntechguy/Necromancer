package com.learntechguy.necromancer.init;

import com.learntechguy.necromancer.blocks.BlockPike;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block pike;
	
	public static void init() {
		pike = new BlockPike();
	}
	
	public static void register() {
		GameRegistry.register(pike);
	}
	
	public static void registerRenders() {
		registerRender(pike);
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
