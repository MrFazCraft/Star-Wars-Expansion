package net.mcreator.starwarsexpansion.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.entity.MouseDroidEntity;

public class MouseDroidModel extends GeoModel<MouseDroidEntity> {
	@Override
	public ResourceLocation getAnimationResource(MouseDroidEntity entity) {
		return new ResourceLocation("star_wars_expansion", "animations/mousedroid.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MouseDroidEntity entity) {
		return new ResourceLocation("star_wars_expansion", "geo/mousedroid.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MouseDroidEntity entity) {
		return new ResourceLocation("star_wars_expansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
