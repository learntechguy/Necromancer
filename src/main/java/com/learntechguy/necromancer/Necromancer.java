package com.learntechguy.necromancer;

import com.learntechguy.necromancer.init.ModArmor;
import com.learntechguy.necromancer.init.ModBlocks;
import com.learntechguy.necromancer.init.ModCrafting;
import com.learntechguy.necromancer.init.ModItems;
import com.learntechguy.necromancer.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Necromancer {
	
	@Instance
	public static Necromancer instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static CreativeTabs CREATIVE_TAB = new NecromancerTab();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
		
		ModArmor.init();
		ModArmor.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
		MinecraftForge.EVENT_BUS.register(new CommonEvents());
		ModCrafting.register();
	}
	
	@EventHandler
	public void postInit(FMLInitializationEvent event) {
		
	}
}