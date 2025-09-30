package net.mcreator.starwarsexpansion.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarsexpansion.block.model.ControlStationDisplayModel;
import net.mcreator.starwarsexpansion.block.display.ControlStationDisplayItem;

public class ControlStationDisplayItemRenderer extends GeoItemRenderer<ControlStationDisplayItem> {
	public ControlStationDisplayItemRenderer() {
		super(new ControlStationDisplayModel());
	}

	@Override
	public RenderType getRenderType(ControlStationDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
