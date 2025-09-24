package net.mcreator.starwarsexpansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.block.display.MoistureVaporatorDisplayItem;

public class MoistureVaporatorDisplayModel extends GeoModel<MoistureVaporatorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MoistureVaporatorDisplayItem animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/watervaporizer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MoistureVaporatorDisplayItem animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/watervaporizer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MoistureVaporatorDisplayItem entity) {
		return new ResourceLocation("star_wars_expansion", "textures/block/water_vaporizer.png");
	}
}
