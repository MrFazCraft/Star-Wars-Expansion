package net.mcreator.starwarsexpansion.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarsexpansion.block.model.MoistureVaporatorBlockModel;
import net.mcreator.starwarsexpansion.block.entity.MoistureVaporatorTileEntity;

public class MoistureVaporatorTileRenderer extends GeoBlockRenderer<MoistureVaporatorTileEntity> {
	public MoistureVaporatorTileRenderer() {
		super(new MoistureVaporatorBlockModel());
	}

	@Override
	public RenderType getRenderType(MoistureVaporatorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
