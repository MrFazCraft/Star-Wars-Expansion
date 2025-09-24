package net.mcreator.starwarsexpansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.block.display.StatueDisplayItem;

public class StatueDisplayModel extends GeoModel<StatueDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StatueDisplayItem animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/statue.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StatueDisplayItem animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/statue.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StatueDisplayItem entity) {
		return new ResourceLocation("star_wars_expansion", "textures/block/statue.png");
	}
}
