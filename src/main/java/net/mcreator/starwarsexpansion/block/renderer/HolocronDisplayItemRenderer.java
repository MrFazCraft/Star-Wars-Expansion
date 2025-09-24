package net.mcreator.starwarsexpansion.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarsexpansion.block.model.HolocronDisplayModel;
import net.mcreator.starwarsexpansion.block.display.HolocronDisplayItem;

public class HolocronDisplayItemRenderer extends GeoItemRenderer<HolocronDisplayItem> {
	public HolocronDisplayItemRenderer() {
		super(new HolocronDisplayModel());
	}

	@Override
	public RenderType getRenderType(HolocronDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
