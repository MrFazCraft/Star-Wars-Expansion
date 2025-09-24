package net.mcreator.starwarsexpansion.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.entity.GonkDroidEntity;

public class GonkDroidModel extends GeoModel<GonkDroidEntity> {
	@Override
	public ResourceLocation getAnimationResource(GonkDroidEntity entity) {
		return new ResourceLocation("star_wars_expansion", "animations/gonk.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GonkDroidEntity entity) {
		return new ResourceLocation("star_wars_expansion", "geo/gonk.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GonkDroidEntity entity) {
		return new ResourceLocation("star_wars_expansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
