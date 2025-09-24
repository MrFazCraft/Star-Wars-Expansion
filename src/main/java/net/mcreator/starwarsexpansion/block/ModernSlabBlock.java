
package net.mcreator.starwarsexpansion.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class ModernSlabBlock extends SlabBlock {
	public ModernSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1f, 10f).requiresCorrectToolForDrops());
	}
}
