package net.mcreator.starwarsexpansion.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.item.DL44Item;

public class DL44ItemModel extends GeoModel<DL44Item> {
	@Override
	public ResourceLocation getAnimationResource(DL44Item animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/dl44.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DL44Item animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/dl44.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DL44Item animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/item/dl44.png");
	}
}
