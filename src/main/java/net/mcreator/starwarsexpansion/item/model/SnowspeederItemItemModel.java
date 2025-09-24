package net.mcreator.starwarsexpansion.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.item.SnowspeederItemItem;

public class SnowspeederItemItemModel extends GeoModel<SnowspeederItemItem> {
	@Override
	public ResourceLocation getAnimationResource(SnowspeederItemItem animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/snowspeeder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SnowspeederItemItem animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/snowspeeder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SnowspeederItemItem animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/item/snowspeeder.png");
	}
}
