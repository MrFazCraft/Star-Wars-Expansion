package net.mcreator.starwarsexpansion.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarsexpansion.block.model.ControlStationBlockModel;
import net.mcreator.starwarsexpansion.block.entity.ControlStationTileEntity;

public class ControlStationTileRenderer extends GeoBlockRenderer<ControlStationTileEntity> {
	public ControlStationTileRenderer() {
		super(new ControlStationBlockModel());
	}

	@Override
	public RenderType getRenderType(ControlStationTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
