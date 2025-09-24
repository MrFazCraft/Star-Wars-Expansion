package net.mcreator.starwarsexpansion.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.entity.SpeederBikeEntity;

public class SpeederBikeModel extends GeoModel<SpeederBikeEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpeederBikeEntity entity) {
		return new ResourceLocation("star_wars_expansion", "animations/speederbike.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpeederBikeEntity entity) {
		return new ResourceLocation("star_wars_expansion", "geo/speederbike.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpeederBikeEntity entity) {
		return new ResourceLocation("star_wars_expansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
