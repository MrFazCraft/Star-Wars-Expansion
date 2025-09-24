package net.mcreator.starwarsexpansion.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarsexpansion.block.model.MoistureVaporatorDisplayModel;
import net.mcreator.starwarsexpansion.block.display.MoistureVaporatorDisplayItem;

public class MoistureVaporatorDisplayItemRenderer extends GeoItemRenderer<MoistureVaporatorDisplayItem> {
	public MoistureVaporatorDisplayItemRenderer() {
		super(new MoistureVaporatorDisplayModel());
	}

	@Override
	public RenderType getRenderType(MoistureVaporatorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
