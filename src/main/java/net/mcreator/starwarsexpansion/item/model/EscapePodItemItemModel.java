package net.mcreator.starwarsexpansion.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.item.EscapePodItemItem;

public class EscapePodItemItemModel extends GeoModel<EscapePodItemItem> {
	@Override
	public ResourceLocation getAnimationResource(EscapePodItemItem animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/pod.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EscapePodItemItem animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/pod.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EscapePodItemItem animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/item/escapepod.png");
	}
}
