package net.mcreator.starwarsexpansion.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarsexpansion.block.model.WorkspaceBenchDisplayModel;
import net.mcreator.starwarsexpansion.block.display.WorkspaceBenchDisplayItem;

public class WorkspaceBenchDisplayItemRenderer extends GeoItemRenderer<WorkspaceBenchDisplayItem> {
	public WorkspaceBenchDisplayItemRenderer() {
		super(new WorkspaceBenchDisplayModel());
	}

	@Override
	public RenderType getRenderType(WorkspaceBenchDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
