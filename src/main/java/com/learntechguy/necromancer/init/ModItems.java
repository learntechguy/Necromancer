package com.learntechguy.necromancer.init;

import com.learntechguy.necromancer.Reference;
import com.learntechguy.necromancer.items.ItemBrain;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
		
	public static Item brain;
	
	public static void init() {
		brain = new ItemBrain();
	}
	
	public static void register() {
		GameRegistry.register(brain);
	}
	
	public static void registerRenders() {
		registerRender(brain);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
