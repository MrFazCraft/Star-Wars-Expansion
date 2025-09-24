package net.mcreator.starwarsexpansion.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarsexpansion.block.model.ControlPanelBlockModel;
import net.mcreator.starwarsexpansion.block.entity.ControlPanelTileEntity;

public class ControlPanelTileRenderer extends GeoBlockRenderer<ControlPanelTileEntity> {
	public ControlPanelTileRenderer() {
		super(new ControlPanelBlockModel());
	}

	@Override
	public RenderType getRenderType(ControlPanelTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
