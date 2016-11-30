package com.learntechguy.necromancer;

import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Reference {
	public static final String MOD_ID = "necromancer";
	public static final String NAME = "Necromancer";
	public static final String VERSION = "0.1";
	public static final String ACCEPTED_VERSIONS = "[1.10]";
	
	public static final String CLIENT_PROXY_CLASS = "com.learntechguy.necromancer.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.learntechguy.necromancer.proxy.ServerProxy";
	
	public static enum NecromancerItems {
		BRAIN("brain"),
		ZOMBIE_ARMOR("zombie_armor");
		
		private String unlocalizedName;
		private String registryName;
		
		NecromancerItems(String name) {
			this.unlocalizedName = name;
			this.registryName = MOD_ID + ":" + name;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
	
	public static enum NecromancerBlocks {
		PIKE("pike"),
		SKULLS("skulls");
		
		private String unlocalizedName;
		private String registryName;
		
		NecromancerBlocks(String name) {
			this.unlocalizedName = name;
			this.registryName = MOD_ID + ":" + name;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}

	public static final ArmorMaterial zombieMaterial = EnumHelper.addArmorMaterial("zombie", MOD_ID+":zombie", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	
	public static enum NecromancerArmor {
		ZOMBIE_HELMET(zombieMaterial, 1, EntityEquipmentSlot.HEAD, "zombie_helmet"),
		ZOMBIE_CHESTPLATE(zombieMaterial, 1, EntityEquipmentSlot.CHEST, "zombie_chestplate"),
		ZOMBIE_LEGGINGS(zombieMaterial, 2, EntityEquipmentSlot.LEGS, "zombie_leggings"),
		ZOMBIE_BOOTS(zombieMaterial, 1, EntityEquipmentSlot.FEET, "zombie_boots");
		
		private ArmorMaterial material;
		private int renderIndex;
		private EntityEquipmentSlot equipmentSlot;
		private String unlocalizedName;
		
		NecromancerArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String unlocalizedNameIn)
        {
            this.material = materialIn;
            this.renderIndex = renderIndexIn;
            this.equipmentSlot = equipmentSlotIn;
            this.unlocalizedName = unlocalizedNameIn;
        }
			

        public ArmorMaterial getMaterial()
        {
            return this.material;
        }

        public int getRenderIndex()
        {
            return this.renderIndex;
        }

        public EntityEquipmentSlot getEquipmentSlot()
        {
            return this.equipmentSlot;
        }

        public String getUnlocalizedName()
        {
            return this.unlocalizedName;
        }
    }
}