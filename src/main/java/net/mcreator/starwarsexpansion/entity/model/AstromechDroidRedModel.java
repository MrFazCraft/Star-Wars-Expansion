package net.mcreator.starwarsexpansion.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.entity.AstromechDroidRedEntity;

public class AstromechDroidRedModel extends GeoModel<AstromechDroidRedEntity> {
	@Override
	public ResourceLocation getAnimationResource(AstromechDroidRedEntity entity) {
		return new ResourceLocation("star_wars_expansion", "animations/astromechdroid.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AstromechDroidRedEntity entity) {
		return new ResourceLocation("star_wars_expansion", "geo/astromechdroid.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AstromechDroidRedEntity entity) {
		return new ResourceLocation("star_wars_expansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
