package net.mcreator.starwarsexpansion.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.item.DoubleLightsaberYellowItem;

public class DoubleLightsaberYellowItemModel extends GeoModel<DoubleLightsaberYellowItem> {
	@Override
	public ResourceLocation getAnimationResource(DoubleLightsaberYellowItem animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/doublelightsaber.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DoubleLightsaberYellowItem animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/doublelightsaber.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DoubleLightsaberYellowItem animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/item/lightsaber_yellow.png");
	}
}
