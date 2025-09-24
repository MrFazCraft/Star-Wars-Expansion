package net.mcreator.starwarsexpansion.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.item.TIEFighterItemItem;

public class TIEFighterItemItemModel extends GeoModel<TIEFighterItemItem> {
	@Override
	public ResourceLocation getAnimationResource(TIEFighterItemItem animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/tie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TIEFighterItemItem animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/tie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TIEFighterItemItem animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/item/tie_fighter.png");
	}
}
