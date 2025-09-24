package net.mcreator.starwarsexpansion.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.entity.AstromechDroidBlueEntity;

public class AstromechDroidBlueModel extends GeoModel<AstromechDroidBlueEntity> {
	@Override
	public ResourceLocation getAnimationResource(AstromechDroidBlueEntity entity) {
		return new ResourceLocation("star_wars_expansion", "animations/astromechdroid.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AstromechDroidBlueEntity entity) {
		return new ResourceLocation("star_wars_expansion", "geo/astromechdroid.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AstromechDroidBlueEntity entity) {
		return new ResourceLocation("star_wars_expansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
