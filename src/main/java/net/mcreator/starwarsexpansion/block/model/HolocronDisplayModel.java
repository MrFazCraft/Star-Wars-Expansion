package net.mcreator.starwarsexpansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.block.display.HolocronDisplayItem;

public class HolocronDisplayModel extends GeoModel<HolocronDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(HolocronDisplayItem animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/holocron.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HolocronDisplayItem animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/holocron.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HolocronDisplayItem entity) {
		return new ResourceLocation("star_wars_expansion", "textures/block/holocron_block.png");
	}
}
