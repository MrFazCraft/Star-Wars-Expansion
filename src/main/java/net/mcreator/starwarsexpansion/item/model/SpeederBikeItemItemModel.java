package net.mcreator.starwarsexpansion.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.item.SpeederBikeItemItem;

public class SpeederBikeItemItemModel extends GeoModel<SpeederBikeItemItem> {
	@Override
	public ResourceLocation getAnimationResource(SpeederBikeItemItem animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/speederbike.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpeederBikeItemItem animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/speederbike.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpeederBikeItemItem animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/item/speederbike.png");
	}
}
