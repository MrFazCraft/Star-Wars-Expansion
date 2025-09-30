package net.mcreator.starwarsexpansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.block.entity.ComputerStationTileEntity;

public class ComputerStationBlockModel extends GeoModel<ComputerStationTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ComputerStationTileEntity animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/computerstation.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ComputerStationTileEntity animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/computerstation.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ComputerStationTileEntity animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/block/computerstation.png");
	}
}
