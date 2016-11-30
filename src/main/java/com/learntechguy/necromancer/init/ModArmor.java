package com.learntechguy.necromancer.init;

import com.learntechguy.necromancer.Reference;
import com.learntechguy.necromancer.items.ItemFleshNboneArmor;
import com.learntechguy.necromancer.items.ItemSkeletonArmor;
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
	
	public static ItemArmor skeleton_helmet;
	public static ItemArmor skeleton_chestplate;
	public static ItemArmor skeleton_leggings;
	public static ItemArmor skeleton_boots;
	
	public static ItemArmor fleshNbone_helmet;
	public static ItemArmor fleshNbone_chestplate;
	public static ItemArmor fleshNbone_leggings;
	public static ItemArmor fleshNbone_boots;
	
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
		
		
		skeleton_helmet = new ItemSkeletonArmor(Reference.NecromancerArmor.SKELETON_HELMET.getRenderIndex(), 
												Reference.NecromancerArmor.SKELETON_HELMET.getEquipmentSlot(), 
												Reference.NecromancerArmor.SKELETON_HELMET.getUnlocalizedName());
		skeleton_chestplate = new ItemSkeletonArmor(Reference.NecromancerArmor.SKELETON_CHESTPLATE.getRenderIndex(), 
													Reference.NecromancerArmor.SKELETON_CHESTPLATE.getEquipmentSlot(), 
													Reference.NecromancerArmor.SKELETON_CHESTPLATE.getUnlocalizedName());
		skeleton_leggings = new ItemSkeletonArmor(Reference.NecromancerArmor.SKELETON_LEGGINGS.getRenderIndex(), 
											  	  Reference.NecromancerArmor.SKELETON_LEGGINGS.getEquipmentSlot(), 
											  	  Reference.NecromancerArmor.SKELETON_LEGGINGS.getUnlocalizedName());
		skeleton_boots = new ItemSkeletonArmor(Reference.NecromancerArmor.SKELETON_BOOTS.getRenderIndex(), 
										   	   Reference.NecromancerArmor.SKELETON_BOOTS.getEquipmentSlot(), 
										   	   Reference.NecromancerArmor.SKELETON_BOOTS.getUnlocalizedName());
		
		
		
		fleshNbone_helmet = new ItemFleshNboneArmor(Reference.NecromancerArmor.FLESHNBONE_HELMET.getRenderIndex(), 
													Reference.NecromancerArmor.FLESHNBONE_HELMET.getEquipmentSlot(), 
													Reference.NecromancerArmor.FLESHNBONE_HELMET.getUnlocalizedName());
		fleshNbone_chestplate = new ItemFleshNboneArmor(Reference.NecromancerArmor.FLESHNBONE_CHESTPLATE.getRenderIndex(), 
														Reference.NecromancerArmor.FLESHNBONE_CHESTPLATE.getEquipmentSlot(), 
														Reference.NecromancerArmor.FLESHNBONE_CHESTPLATE.getUnlocalizedName());
		fleshNbone_leggings = new ItemFleshNboneArmor(Reference.NecromancerArmor.FLESHNBONE_LEGGINGS.getRenderIndex(), 
											  		  Reference.NecromancerArmor.FLESHNBONE_LEGGINGS.getEquipmentSlot(), 
											  		  Reference.NecromancerArmor.FLESHNBONE_LEGGINGS.getUnlocalizedName());
		fleshNbone_boots = new ItemFleshNboneArmor(Reference.NecromancerArmor.FLESHNBONE_BOOTS.getRenderIndex(), 
										   		   Reference.NecromancerArmor.FLESHNBONE_BOOTS.getEquipmentSlot(), 
										   		   Reference.NecromancerArmor.FLESHNBONE_BOOTS.getUnlocalizedName());
		
		
	}
	
	public static void register() {
		GameRegistry.register(zombie_helmet);
		GameRegistry.register(zombie_chestplate);
		GameRegistry.register(zombie_leggings);
		GameRegistry.register(zombie_boots);
		
		GameRegistry.register(skeleton_helmet);
		GameRegistry.register(skeleton_chestplate);
		GameRegistry.register(skeleton_leggings);
		GameRegistry.register(skeleton_boots);
		
		GameRegistry.register(fleshNbone_helmet);
		GameRegistry.register(fleshNbone_chestplate);
		GameRegistry.register(fleshNbone_leggings);
		GameRegistry.register(fleshNbone_boots);
	}

	public static void registerRenders() {
		registerRender(zombie_helmet);
		registerRender(zombie_chestplate);
		registerRender(zombie_leggings);
		registerRender(zombie_boots);
		
		registerRender(skeleton_helmet);
		registerRender(skeleton_chestplate);
		registerRender(skeleton_leggings);
		registerRender(skeleton_boots);
		
		registerRender(fleshNbone_helmet);
		registerRender(fleshNbone_chestplate);
		registerRender(fleshNbone_leggings);
		registerRender(fleshNbone_boots);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
