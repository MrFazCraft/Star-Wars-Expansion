package net.mcreator.starwarsexpansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.block.entity.MoistureVaporatorTileEntity;

public class MoistureVaporatorBlockModel extends GeoModel<MoistureVaporatorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MoistureVaporatorTileEntity animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/watervaporizer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MoistureVaporatorTileEntity animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/watervaporizer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MoistureVaporatorTileEntity animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/block/water_vaporizer.png");
	}
}
