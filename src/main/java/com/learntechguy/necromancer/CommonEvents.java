package com.learntechguy.necromancer;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CommonEvents {

	 @SubscribeEvent
	 public void onEntityTargetedEvent(LivingSetAttackTargetEvent event) {
		 if (event.getTarget() instanceof EntityPlayer && event.getEntity() instanceof EntityZombie) {
			 zombieArmorEffect(event.getEntity());
		 }
	 }

	private void zombieArmorEffect(Entity e) {
		((EntityZombie) e).setAttackTarget(null);
        ((EntityZombie) e).setRevengeTarget(null);
	}
}
