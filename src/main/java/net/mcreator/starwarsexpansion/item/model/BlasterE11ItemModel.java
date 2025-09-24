package net.mcreator.starwarsexpansion.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.item.BlasterE11Item;

public class BlasterE11ItemModel extends GeoModel<BlasterE11Item> {
	@Override
	public ResourceLocation getAnimationResource(BlasterE11Item animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/blaster.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlasterE11Item animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/blaster.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlasterE11Item animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/item/blaster.png");
	}
}
