
package net.mcreator.starwarsexpansion.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarsexpansion.entity.model.EscapePodModel;
import net.mcreator.starwarsexpansion.entity.layer.EscapePodLayer;
import net.mcreator.starwarsexpansion.entity.EscapePodEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class EscapePodRenderer extends GeoEntityRenderer<EscapePodEntity> {
	public EscapePodRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new EscapePodModel());
		this.shadowRadius = 0f;
		this.addRenderLayer(new EscapePodLayer(this));
	}

	@Override
	public RenderType getRenderType(EscapePodEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, EscapePodEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(EscapePodEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
