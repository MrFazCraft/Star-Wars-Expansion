package net.mcreator.starwarsexpansion.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.item.DoubleLightsaberGreenItem;

public class DoubleLightsaberGreenItemModel extends GeoModel<DoubleLightsaberGreenItem> {
	@Override
	public ResourceLocation getAnimationResource(DoubleLightsaberGreenItem animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/doublelightsaber.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DoubleLightsaberGreenItem animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/doublelightsaber.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DoubleLightsaberGreenItem animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/item/lightsaber_green.png");
	}
}
