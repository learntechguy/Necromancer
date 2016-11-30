package com.learntechguy.necromancer.items;

import com.learntechguy.necromancer.Necromancer;
import com.learntechguy.necromancer.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSkeletonArmor extends ItemArmor {

	public ItemSkeletonArmor(int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String unlocalizedNameIn) {
		super(Reference.skeletonMaterial, renderIndexIn, equipmentSlotIn);
		this.setUnlocalizedName(unlocalizedNameIn);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedNameIn));
		this.setCreativeTab(Necromancer.CREATIVE_TAB);
	}	
}
