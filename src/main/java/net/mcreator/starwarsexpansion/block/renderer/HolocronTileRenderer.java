package net.mcreator.starwarsexpansion.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarsexpansion.block.model.HolocronBlockModel;
import net.mcreator.starwarsexpansion.block.entity.HolocronTileEntity;

public class HolocronTileRenderer extends GeoBlockRenderer<HolocronTileEntity> {
	public HolocronTileRenderer() {
		super(new HolocronBlockModel());
	}

	@Override
	public RenderType getRenderType(HolocronTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
