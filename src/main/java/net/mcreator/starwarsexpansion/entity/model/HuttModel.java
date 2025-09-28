package net.mcreator.starwarsexpansion.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.entity.HuttEntity;

public class HuttModel extends GeoModel<HuttEntity> {
	@Override
	public ResourceLocation getAnimationResource(HuttEntity entity) {
		return new ResourceLocation("star_wars_expansion", "animations/hutt.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HuttEntity entity) {
		return new ResourceLocation("star_wars_expansion", "geo/hutt.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HuttEntity entity) {
		return new ResourceLocation("star_wars_expansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
