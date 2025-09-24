package net.mcreator.starwarsexpansion.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.item.Westar34Item;

public class Westar34ItemModel extends GeoModel<Westar34Item> {
	@Override
	public ResourceLocation getAnimationResource(Westar34Item animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/westar.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Westar34Item animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/westar.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Westar34Item animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/item/westar.png");
	}
}
