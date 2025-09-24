package net.mcreator.starwarsexpansion.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.item.EE3Item;

public class EE3ItemModel extends GeoModel<EE3Item> {
	@Override
	public ResourceLocation getAnimationResource(EE3Item animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/ee3.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EE3Item animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/ee3.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EE3Item animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/item/ee3.png");
	}
}
