package net.mcreator.starwarsexpansion.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.entity.ProtocolDroidPinkEntity;

public class ProtocolDroidPinkModel extends GeoModel<ProtocolDroidPinkEntity> {
	@Override
	public ResourceLocation getAnimationResource(ProtocolDroidPinkEntity entity) {
		return new ResourceLocation("star_wars_expansion", "animations/protocoldroid.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ProtocolDroidPinkEntity entity) {
		return new ResourceLocation("star_wars_expansion", "geo/protocoldroid.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ProtocolDroidPinkEntity entity) {
		return new ResourceLocation("star_wars_expansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
