
package net.mcreator.starwarsexpansion.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class MetalSlabBlock extends SlabBlock {
	public MetalSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(2f, 15f).requiresCorrectToolForDrops());
	}
}
