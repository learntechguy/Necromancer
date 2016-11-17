package com.learntechguy.necromancer.blocks;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.google.common.base.Predicate;
import com.learntechguy.necromancer.Necromancer;
import com.learntechguy.necromancer.Reference;

public class BlockPike extends Block {
	private static final AxisAlignedBB PIKE_AABB = new AxisAlignedBB(0.4375D, 0.0D, 0.4375D, 0.5625D, 1.875D, 0.5625D);
	
	public BlockPike() {
		super(Material.WOOD);
		this.setUnlocalizedName(Reference.NecromancerBlocks.PIKE.getUnlocalizedName());	
		this.setRegistryName(Reference.NecromancerBlocks.PIKE.getRegistryName());
		this.setCreativeTab(Necromancer.CREATIVE_TAB);
		this.setHardness(1.0f);
		this.setHarvestLevel("axe",  1);
	}
	
	@Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
	
	@Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }
	
	@Override
    public boolean isPassable(IBlockAccess worldIn, BlockPos pos)
    {
        return false;
    }
    
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
    	return PIKE_AABB;
    }
    
    @Override
    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, java.util.List<AxisAlignedBB> collidingBoxes, net.minecraft.entity.Entity entityIn) {
    	super.addCollisionBoxToList(pos, entityBox, collidingBoxes, PIKE_AABB);
    }
    

	private boolean canPlaceOn(World worldIn, BlockPos pos)
    {
        IBlockState state = worldIn.getBlockState(pos);
        if (state.isSideSolid(worldIn, pos, EnumFacing.UP))
        {
            return true;
        }
        else
        {
            return state.getBlock().canPlaceTorchOnTop(state, worldIn, pos);
        }
    }

    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
    {
    	if (this.canPlaceAt(worldIn, pos, EnumFacing.UP))
            {
                return true;
            }

        return false;
    }

    private boolean canPlaceAt(World worldIn, BlockPos pos, EnumFacing facing)
    {
        BlockPos blockpos = pos.offset(facing.getOpposite());
        return facing.equals(EnumFacing.UP) && this.canPlaceOn(worldIn, blockpos);
    }
    
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn)
    {
    	if (worldIn.getBlockState(pos).getBlock() == this && !this.canPlaceAt(worldIn, pos, EnumFacing.UP)) {
    		this.dropBlockAsItem(worldIn, pos, state, 0);
            worldIn.setBlockToAir(pos);
        }
    }

}
