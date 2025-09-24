package net.mcreator.starwarsexpansion.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.entity.ArgesFrogEntity;

public class ArgesFrogModel extends GeoModel<ArgesFrogEntity> {
	@Override
	public ResourceLocation getAnimationResource(ArgesFrogEntity entity) {
		return new ResourceLocation("star_wars_expansion", "animations/arges.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArgesFrogEntity entity) {
		return new ResourceLocation("star_wars_expansion", "geo/arges.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArgesFrogEntity entity) {
		return new ResourceLocation("star_wars_expansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
