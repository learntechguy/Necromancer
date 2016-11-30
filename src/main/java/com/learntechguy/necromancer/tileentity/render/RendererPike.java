package com.learntechguy.necromancer.tileentity.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.learntechguy.necromancer.tileentity.TileEntityPike;

public class RendererPike extends TileEntitySpecialRenderer<TileEntityPike> {
	
	EntityItem ITEM = new EntityItem(Minecraft.getMinecraft().theWorld, 0, 0, 0, new ItemStack(Items.SKULL, 1, 0));
	
	@Override
	public void renderTileEntityAt(TileEntityPike te, double x, double y, double z, float partialTicks, int destroyStage) {
	
		super.renderTileEntityAt(te, x, y, z, partialTicks, destroyStage);
		
		if (te.hasHead) {
			ITEM.setEntityItemStack(new ItemStack(Items.SKULL, 1, te.headType));
			GlStateManager.pushMatrix();
			{
				GlStateManager.translate(x, y, z);
				GlStateManager.translate(0.5, 0.8, 0.5);
				GlStateManager.scale(2, 2, 2);
				Minecraft.getMinecraft().getRenderManager().doRenderEntity(ITEM, 0, 0, 0, 0F, 0F, false);
			}
			GlStateManager.popMatrix();
		}
		
	}	
	
}
