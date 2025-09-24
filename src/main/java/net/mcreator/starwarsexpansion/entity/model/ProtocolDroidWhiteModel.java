package net.mcreator.starwarsexpansion.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.entity.ProtocolDroidWhiteEntity;

public class ProtocolDroidWhiteModel extends GeoModel<ProtocolDroidWhiteEntity> {
	@Override
	public ResourceLocation getAnimationResource(ProtocolDroidWhiteEntity entity) {
		return new ResourceLocation("star_wars_expansion", "animations/protocoldroid.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ProtocolDroidWhiteEntity entity) {
		return new ResourceLocation("star_wars_expansion", "geo/protocoldroid.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ProtocolDroidWhiteEntity entity) {
		return new ResourceLocation("star_wars_expansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
