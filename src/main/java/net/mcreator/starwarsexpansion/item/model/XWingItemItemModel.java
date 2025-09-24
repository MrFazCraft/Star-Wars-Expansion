package net.mcreator.starwarsexpansion.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.item.XWingItemItem;

public class XWingItemItemModel extends GeoModel<XWingItemItem> {
	@Override
	public ResourceLocation getAnimationResource(XWingItemItem animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/xwingitem.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(XWingItemItem animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/xwingitem.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(XWingItemItem animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/item/xwing.png");
	}
}
