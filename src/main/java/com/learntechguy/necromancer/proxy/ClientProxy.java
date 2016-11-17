package com.learntechguy.necromancer.proxy;

import com.learntechguy.necromancer.init.ModArmor;
import com.learntechguy.necromancer.init.ModBlocks;
import com.learntechguy.necromancer.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		ModArmor.registerRenders();
	}

}
