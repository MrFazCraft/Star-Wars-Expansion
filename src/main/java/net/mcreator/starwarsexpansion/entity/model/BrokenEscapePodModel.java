package net.mcreator.starwarsexpansion.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.entity.BrokenEscapePodEntity;

public class BrokenEscapePodModel extends GeoModel<BrokenEscapePodEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenEscapePodEntity entity) {
		return new ResourceLocation("star_wars_expansion", "animations/pod.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenEscapePodEntity entity) {
		return new ResourceLocation("star_wars_expansion", "geo/pod.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenEscapePodEntity entity) {
		return new ResourceLocation("star_wars_expansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
