package com.learntechguy.necromancer.init;

import com.learntechguy.necromancer.Reference;
import com.learntechguy.necromancer.items.ItemZombieArmor;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModArmor {
	public static ItemArmor zombie_helmet;
	public static ItemArmor zombie_chestplate;
	public static ItemArmor zombie_leggings;
	public static ItemArmor zombie_boots;
	
	public static void init() {
		zombie_helmet = new ItemZombieArmor(Reference.NecromancerArmor.ZOMBIE_HELMET.getRenderIndex(), 
											Reference.NecromancerArmor.ZOMBIE_HELMET.getEquipmentSlot(), 
											Reference.NecromancerArmor.ZOMBIE_HELMET.getUnlocalizedName());
		zombie_chestplate = new ItemZombieArmor(Reference.NecromancerArmor.ZOMBIE_CHESTPLATE.getRenderIndex(), 
												Reference.NecromancerArmor.ZOMBIE_CHESTPLATE.getEquipmentSlot(), 
												Reference.NecromancerArmor.ZOMBIE_CHESTPLATE.getUnlocalizedName());
		zombie_leggings = new ItemZombieArmor(Reference.NecromancerArmor.ZOMBIE_LEGGINGS.getRenderIndex(), 
											  Reference.NecromancerArmor.ZOMBIE_LEGGINGS.getEquipmentSlot(), 
											  Reference.NecromancerArmor.ZOMBIE_LEGGINGS.getUnlocalizedName());
		zombie_boots = new ItemZombieArmor(Reference.NecromancerArmor.ZOMBIE_BOOTS.getRenderIndex(), 
										   Reference.NecromancerArmor.ZOMBIE_BOOTS.getEquipmentSlot(), 
										   Reference.NecromancerArmor.ZOMBIE_BOOTS.getUnlocalizedName());
	}
	
	public static void register() {
		GameRegistry.register(zombie_helmet);
		GameRegistry.register(zombie_chestplate);
		GameRegistry.register(zombie_leggings);
		GameRegistry.register(zombie_boots);
	}

	public static void registerRenders() {
		registerRender(zombie_helmet);
		registerRender(zombie_chestplate);
		registerRender(zombie_leggings);
		registerRender(zombie_boots);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
