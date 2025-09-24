package net.mcreator.starwarsexpansion.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarsexpansion.block.model.ControlPanelDisplayModel;
import net.mcreator.starwarsexpansion.block.display.ControlPanelDisplayItem;

public class ControlPanelDisplayItemRenderer extends GeoItemRenderer<ControlPanelDisplayItem> {
	public ControlPanelDisplayItemRenderer() {
		super(new ControlPanelDisplayModel());
	}

	@Override
	public RenderType getRenderType(ControlPanelDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
