package com.learntechguy.necromancer.proxy;

import net.minecraftforge.fml.client.registry.ClientRegistry;

import com.learntechguy.necromancer.init.ModArmor;
import com.learntechguy.necromancer.init.ModBlocks;
import com.learntechguy.necromancer.init.ModItems;
import com.learntechguy.necromancer.tileentity.TileEntityPike;
import com.learntechguy.necromancer.tileentity.render.RendererPike;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		ModArmor.registerRenders();
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPike.class, new RendererPike());
	}

}
