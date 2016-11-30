package com.learntechguy.necromancer.tileentity;

import net.minecraft.block.state.IBlockState;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityPike extends TileEntity {
	public int headType = 0;
	public boolean hasHead = false;
	
	public boolean impaleHead(int headType) {
		if (!this.hasHead) {
			this.hasHead = true;
			this.headType = headType;
			markDirty();
			IBlockState state = worldObj.getBlockState(pos);
			worldObj.notifyBlockUpdate(pos, state, state, 3);
			return true;
		}
		
		return false;
	}
	
	public boolean removeHead() {
		if (this.hasHead) {
			this.hasHead = false;
			markDirty();
			IBlockState state = worldObj.getBlockState(pos);
			worldObj.notifyBlockUpdate(pos, state, state, 3);
			return true;
		}
		return false;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		readPacketNBT(compound);
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		writePacketNBT(compound);
		return compound;
	}
	
	@Override
	public NBTTagCompound getUpdateTag() {
		return writeToNBT(new NBTTagCompound());
	}
	
	public void readPacketNBT(NBTTagCompound compound) {
		this.hasHead = compound.getBoolean("hasHead");
		this.headType = compound.getInteger("headType");
	}
	
	public void writePacketNBT(NBTTagCompound compound) {
		compound.setBoolean("hasHead", this.hasHead);
		compound.setInteger("headType", this.headType);
	}
	
	@Override
	public SPacketUpdateTileEntity getUpdatePacket() {
		NBTTagCompound tag = new NBTTagCompound();
		writePacketNBT(tag);
		return new SPacketUpdateTileEntity(pos, 0, tag);
	}
	
	@Override
	public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
		super.onDataPacket(net, pkt);
		readPacketNBT(pkt.getNbtCompound());
	}
}
