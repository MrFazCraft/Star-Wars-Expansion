package net.mcreator.starwarsexpansion.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarsexpansion.block.model.ComputerStationDisplayModel;
import net.mcreator.starwarsexpansion.block.display.ComputerStationDisplayItem;

public class ComputerStationDisplayItemRenderer extends GeoItemRenderer<ComputerStationDisplayItem> {
	public ComputerStationDisplayItemRenderer() {
		super(new ComputerStationDisplayModel());
	}

	@Override
	public RenderType getRenderType(ComputerStationDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
