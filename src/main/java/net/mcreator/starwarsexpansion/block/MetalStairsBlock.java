
package net.mcreator.starwarsexpansion.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class MetalStairsBlock extends StairBlock {
	public MetalStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(2f, 15f).requiresCorrectToolForDrops());
	}

	@Override
	public float getExplosionResistance() {
		return 15f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}
}
