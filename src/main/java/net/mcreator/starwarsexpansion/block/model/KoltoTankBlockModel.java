package net.mcreator.starwarsexpansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.block.entity.KoltoTankTileEntity;

public class KoltoTankBlockModel extends GeoModel<KoltoTankTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(KoltoTankTileEntity animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/koltotank.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(KoltoTankTileEntity animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/koltotank.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(KoltoTankTileEntity animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/block/koltotank.png");
	}
}
