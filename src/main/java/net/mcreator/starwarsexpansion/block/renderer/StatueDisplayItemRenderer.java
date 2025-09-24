package net.mcreator.starwarsexpansion.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarsexpansion.block.model.StatueDisplayModel;
import net.mcreator.starwarsexpansion.block.display.StatueDisplayItem;

public class StatueDisplayItemRenderer extends GeoItemRenderer<StatueDisplayItem> {
	public StatueDisplayItemRenderer() {
		super(new StatueDisplayModel());
	}

	@Override
	public RenderType getRenderType(StatueDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
