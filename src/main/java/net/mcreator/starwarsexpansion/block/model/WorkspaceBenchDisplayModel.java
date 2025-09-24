package net.mcreator.starwarsexpansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.block.display.WorkspaceBenchDisplayItem;

public class WorkspaceBenchDisplayModel extends GeoModel<WorkspaceBenchDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WorkspaceBenchDisplayItem animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/bench.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WorkspaceBenchDisplayItem animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/bench.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WorkspaceBenchDisplayItem entity) {
		return new ResourceLocation("star_wars_expansion", "textures/block/bench.png");
	}
}
