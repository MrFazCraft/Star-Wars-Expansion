package net.mcreator.starwarsexpansion.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarsexpansion.block.model.KoltoTankBlockModel;
import net.mcreator.starwarsexpansion.block.entity.KoltoTankTileEntity;

public class KoltoTankTileRenderer extends GeoBlockRenderer<KoltoTankTileEntity> {
	public KoltoTankTileRenderer() {
		super(new KoltoTankBlockModel());
	}

	@Override
	public RenderType getRenderType(KoltoTankTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
