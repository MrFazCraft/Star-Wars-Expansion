package net.mcreator.starwarsexpansion.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.entity.T3M4Entity;

public class T3M4Model extends GeoModel<T3M4Entity> {
	@Override
	public ResourceLocation getAnimationResource(T3M4Entity entity) {
		return new ResourceLocation("star_wars_expansion", "animations/t3m4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(T3M4Entity entity) {
		return new ResourceLocation("star_wars_expansion", "geo/t3m4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(T3M4Entity entity) {
		return new ResourceLocation("star_wars_expansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
