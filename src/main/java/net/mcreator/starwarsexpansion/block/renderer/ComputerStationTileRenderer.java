package net.mcreator.starwarsexpansion.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarsexpansion.block.model.ComputerStationBlockModel;
import net.mcreator.starwarsexpansion.block.entity.ComputerStationTileEntity;

public class ComputerStationTileRenderer extends GeoBlockRenderer<ComputerStationTileEntity> {
	public ComputerStationTileRenderer() {
		super(new ComputerStationBlockModel());
	}

	@Override
	public RenderType getRenderType(ComputerStationTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
