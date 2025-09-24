package net.mcreator.starwarsexpansion.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.entity.KryknaEntity;

public class KryknaModel extends GeoModel<KryknaEntity> {
	@Override
	public ResourceLocation getAnimationResource(KryknaEntity entity) {
		return new ResourceLocation("star_wars_expansion", "animations/krykna.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(KryknaEntity entity) {
		return new ResourceLocation("star_wars_expansion", "geo/krykna.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(KryknaEntity entity) {
		return new ResourceLocation("star_wars_expansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
