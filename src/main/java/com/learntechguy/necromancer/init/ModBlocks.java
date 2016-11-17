package com.learntechguy.necromancer.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.learntechguy.necromancer.blocks.BlockPike;
import com.learntechguy.necromancer.blocks.BlockSkulls;

public class ModBlocks {
	
	public static Block pike;
	public static Block skulls;
	
	public static void init() {
		pike = new BlockPike();
		skulls = new BlockSkulls();
	}
	
	public static void register() {
		registerBlock(pike);
		registerBlock(skulls);
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(pike);
		registerRender(skulls);
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
