package net.mcreator.starwarsexpansion.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.entity.AstromechDroidPinkEntity;

public class AstromechDroidPinkModel extends GeoModel<AstromechDroidPinkEntity> {
	@Override
	public ResourceLocation getAnimationResource(AstromechDroidPinkEntity entity) {
		return new ResourceLocation("star_wars_expansion", "animations/astromechdroid.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AstromechDroidPinkEntity entity) {
		return new ResourceLocation("star_wars_expansion", "geo/astromechdroid.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AstromechDroidPinkEntity entity) {
		return new ResourceLocation("star_wars_expansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
