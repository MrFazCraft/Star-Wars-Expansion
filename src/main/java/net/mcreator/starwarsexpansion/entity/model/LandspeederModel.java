package net.mcreator.starwarsexpansion.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.entity.LandspeederEntity;

public class LandspeederModel extends GeoModel<LandspeederEntity> {
	@Override
	public ResourceLocation getAnimationResource(LandspeederEntity entity) {
		return new ResourceLocation("star_wars_expansion", "animations/speeder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LandspeederEntity entity) {
		return new ResourceLocation("star_wars_expansion", "geo/speeder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LandspeederEntity entity) {
		return new ResourceLocation("star_wars_expansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
