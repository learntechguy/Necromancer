package com.learntechguy.necromancer.init;

import com.learntechguy.necromancer.items.ItemZombieArmor;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.minecart.MinecartCollisionEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	public static void register() {
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.zombie_helmet), "FFF", "F F", 'F', Items.ROTTEN_FLESH);
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.zombie_chestplate), "F F", "FFF", "FFF", 'F', Items.ROTTEN_FLESH);
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.zombie_leggings), "FFF", "F F", "F F", 'F', Items.ROTTEN_FLESH);
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.zombie_boots), "F F", "F F", 'F', Items.ROTTEN_FLESH);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.skeleton_helmet), "BBB", "B B", 'B', Items.BONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.skeleton_chestplate), "B B", "BBB", "BBB", 'B', Items.BONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.skeleton_leggings), "BBB", "B B", "B B", 'B', Items.BONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.skeleton_boots), "B B", "B B", 'B', Items.BONE);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModArmor.fleshNbone_helmet), ModArmor.zombie_helmet, ModArmor.skeleton_helmet);
		GameRegistry.addShapelessRecipe(new ItemStack(ModArmor.fleshNbone_chestplate), ModArmor.zombie_chestplate, ModArmor.skeleton_chestplate);
		GameRegistry.addShapelessRecipe(new ItemStack(ModArmor.fleshNbone_leggings), ModArmor.zombie_leggings, ModArmor.skeleton_leggings);
		GameRegistry.addShapelessRecipe(new ItemStack(ModArmor.fleshNbone_boots), ModArmor.zombie_boots, ModArmor.skeleton_boots);
	}
}
