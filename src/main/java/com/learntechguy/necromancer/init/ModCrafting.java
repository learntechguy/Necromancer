package com.learntechguy.necromancer.init;

import com.learntechguy.necromancer.items.ItemZombieArmor;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.minecart.MinecartCollisionEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	public static void register() {
		//Zombie armor
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.zombie_helmet), "FFF", "F F", 'F', Items.ROTTEN_FLESH);
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.zombie_chestplate), "F F", "FFF", "FFF", 'F', Items.ROTTEN_FLESH);
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.zombie_leggings), "FFF", "F F", "F F", 'F', Items.ROTTEN_FLESH);
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.zombie_boots), "F F", "F F", 'F', Items.ROTTEN_FLESH);
		
		//Pike
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pike), " II", " SI", "S  ", 'I', Items.IRON_INGOT, 'S', Items.STICK);
	}
}
