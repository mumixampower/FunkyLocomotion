package com.rwtema.funkylocomotion.blocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TileBooster extends TilePowered {
	public TileBooster() {
		super(TilePusher.maxTiles * TilePusher.powerPerTile);
	}

	@Override
	public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newSate) {
		return oldState.getBlock() != newSate.getBlock();
	}
}
