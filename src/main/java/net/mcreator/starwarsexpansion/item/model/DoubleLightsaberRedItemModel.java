package net.mcreator.starwarsexpansion.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.item.DoubleLightsaberRedItem;

public class DoubleLightsaberRedItemModel extends GeoModel<DoubleLightsaberRedItem> {
	@Override
	public ResourceLocation getAnimationResource(DoubleLightsaberRedItem animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/doublelightsaber.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DoubleLightsaberRedItem animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/doublelightsaber.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DoubleLightsaberRedItem animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/item/lightsaber_red.png");
	}
}
