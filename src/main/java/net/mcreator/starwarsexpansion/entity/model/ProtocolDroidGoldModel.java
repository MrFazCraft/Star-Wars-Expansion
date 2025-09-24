package net.mcreator.starwarsexpansion.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.entity.ProtocolDroidGoldEntity;

public class ProtocolDroidGoldModel extends GeoModel<ProtocolDroidGoldEntity> {
	@Override
	public ResourceLocation getAnimationResource(ProtocolDroidGoldEntity entity) {
		return new ResourceLocation("star_wars_expansion", "animations/protocoldroid.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ProtocolDroidGoldEntity entity) {
		return new ResourceLocation("star_wars_expansion", "geo/protocoldroid.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ProtocolDroidGoldEntity entity) {
		return new ResourceLocation("star_wars_expansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
