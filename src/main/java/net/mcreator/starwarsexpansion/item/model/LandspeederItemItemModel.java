package net.mcreator.starwarsexpansion.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.item.LandspeederItemItem;

public class LandspeederItemItemModel extends GeoModel<LandspeederItemItem> {
	@Override
	public ResourceLocation getAnimationResource(LandspeederItemItem animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/speederitem.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LandspeederItemItem animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/speederitem.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LandspeederItemItem animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/item/speeder.png");
	}
}
