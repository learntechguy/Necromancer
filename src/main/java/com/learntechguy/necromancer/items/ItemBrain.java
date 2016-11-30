package com.learntechguy.necromancer.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.learntechguy.necromancer.Necromancer;
import com.learntechguy.necromancer.Reference;

public class ItemBrain extends ItemFood {

	public ItemBrain() {
		super(2, 0.4F, false);
		
		this.setPotionEffect(new PotionEffect(MobEffects.HUNGER, 600, 0), 0.8F);
		
		setUnlocalizedName(Reference.NecromancerItems.BRAIN.getUnlocalizedName());
		setRegistryName(Reference.NecromancerItems.BRAIN.getRegistryName());
		this.setCreativeTab(Necromancer.CREATIVE_TAB);
	}
	
	@Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.isRemote)
        {
            player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 300));
            player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, 300));
        }
    }
}
