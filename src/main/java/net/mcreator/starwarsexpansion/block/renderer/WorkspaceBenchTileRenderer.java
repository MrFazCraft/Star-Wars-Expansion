package net.mcreator.starwarsexpansion.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarsexpansion.block.model.WorkspaceBenchBlockModel;
import net.mcreator.starwarsexpansion.block.entity.WorkspaceBenchTileEntity;

public class WorkspaceBenchTileRenderer extends GeoBlockRenderer<WorkspaceBenchTileEntity> {
	public WorkspaceBenchTileRenderer() {
		super(new WorkspaceBenchBlockModel());
	}

	@Override
	public RenderType getRenderType(WorkspaceBenchTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
