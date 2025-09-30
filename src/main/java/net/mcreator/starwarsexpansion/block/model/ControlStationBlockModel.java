package net.mcreator.starwarsexpansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.block.entity.ControlStationTileEntity;

public class ControlStationBlockModel extends GeoModel<ControlStationTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ControlStationTileEntity animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/controlstation.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ControlStationTileEntity animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/controlstation.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ControlStationTileEntity animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/block/controlstation.png");
	}
}
