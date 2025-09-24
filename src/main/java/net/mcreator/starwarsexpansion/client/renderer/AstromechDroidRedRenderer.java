
package net.mcreator.starwarsexpansion.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarsexpansion.entity.model.AstromechDroidRedModel;
import net.mcreator.starwarsexpansion.entity.layer.AstromechDroidRedLayer;
import net.mcreator.starwarsexpansion.entity.AstromechDroidRedEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AstromechDroidRedRenderer extends GeoEntityRenderer<AstromechDroidRedEntity> {
	public AstromechDroidRedRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new AstromechDroidRedModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new AstromechDroidRedLayer(this));
	}

	@Override
	public RenderType getRenderType(AstromechDroidRedEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, AstromechDroidRedEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 0.7f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
