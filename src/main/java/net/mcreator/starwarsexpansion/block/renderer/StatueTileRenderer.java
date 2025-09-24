package net.mcreator.starwarsexpansion.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarsexpansion.block.model.StatueBlockModel;
import net.mcreator.starwarsexpansion.block.entity.StatueTileEntity;

public class StatueTileRenderer extends GeoBlockRenderer<StatueTileEntity> {
	public StatueTileRenderer() {
		super(new StatueBlockModel());
	}

	@Override
	public RenderType getRenderType(StatueTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
