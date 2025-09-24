package net.mcreator.starwarsexpansion.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.entity.TwiLekBlueEntity;

public class TwiLekBlueModel extends GeoModel<TwiLekBlueEntity> {
	@Override
	public ResourceLocation getAnimationResource(TwiLekBlueEntity entity) {
		return new ResourceLocation("star_wars_expansion", "animations/twilek.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TwiLekBlueEntity entity) {
		return new ResourceLocation("star_wars_expansion", "geo/twilek.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TwiLekBlueEntity entity) {
		return new ResourceLocation("star_wars_expansion", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(TwiLekBlueEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
