package net.mcreator.starwarsexpansion.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarsexpansion.block.model.KoltoTankDisplayModel;
import net.mcreator.starwarsexpansion.block.display.KoltoTankDisplayItem;

public class KoltoTankDisplayItemRenderer extends GeoItemRenderer<KoltoTankDisplayItem> {
	public KoltoTankDisplayItemRenderer() {
		super(new KoltoTankDisplayModel());
	}

	@Override
	public RenderType getRenderType(KoltoTankDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
