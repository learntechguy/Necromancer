package com.learntechguy.necromancer.blocks;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.google.common.base.Predicate;
import com.learntechguy.necromancer.Reference;

public class BlockPike extends Block {
	public static final PropertyDirection FACING = PropertyDirection.create("facing", new Predicate<EnumFacing>()
		    {
		        public boolean apply(@Nullable EnumFacing p_apply_1_)
		        {
		            return p_apply_1_ != EnumFacing.DOWN;
		        }
		    });			
	public BlockPike() {
		super(Material.WOOD);
		this.setUnlocalizedName(Reference.NecromancerBlocks.PIKE.getUnlocalizedName());
		this.setRegistryName(Reference.NecromancerBlocks.PIKE.getRegistryName());
		this.setCreativeTab(CreativeTabs.MATERIALS);
		this.setHardness(1.0f);
		this.setHarvestLevel("axe",  1);
	}
	
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    public boolean isPassable(IBlockAccess worldIn, BlockPos pos)
    {
        return false;
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
        for (EnumFacing enumfacing : FACING.getAllowedValues())
        {
            if (this.canPlaceAt(worldIn, pos, enumfacing))
            {
                return true;
            }
        }

        return false;
    }

    private boolean canPlaceAt(World worldIn, BlockPos pos, EnumFacing facing)
    {
        BlockPos blockpos = pos.offset(facing.getOpposite());
        return facing.equals(EnumFacing.UP) && this.canPlaceOn(worldIn, blockpos);
    }
}
