package net.mcreator.starwarsexpansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.block.entity.WorkspaceBenchTileEntity;

public class WorkspaceBenchBlockModel extends GeoModel<WorkspaceBenchTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WorkspaceBenchTileEntity animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/bench.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WorkspaceBenchTileEntity animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/bench.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WorkspaceBenchTileEntity animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/block/bench.png");
	}
}
