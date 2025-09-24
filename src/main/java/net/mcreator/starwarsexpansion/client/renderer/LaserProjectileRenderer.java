package net.mcreator.starwarsexpansion.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarsexpansion.entity.LaserProjectileEntity;
import net.mcreator.starwarsexpansion.client.model.Modellaser;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LaserProjectileRenderer extends EntityRenderer<LaserProjectileEntity> {
	private static final ResourceLocation texture = new ResourceLocation("star_wars_expansion:textures/entities/laser_projectile.png");
	private static final ResourceLocation emissiveTexture = new ResourceLocation("star_wars_expansion:textures/entities/laser_projectile_emissive.png");
	private final Modellaser model;

	public LaserProjectileRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modellaser(context.bakeLayer(Modellaser.LAYER_LOCATION));
	}

	@Override
	public void render(LaserProjectileEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();

		// Render emisivo sin afectar la luz del mundo
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		VertexConsumer emissiveVb = bufferIn.getBuffer(RenderType.eyes(emissiveTexture));
		model.renderToBuffer(poseStack, emissiveVb, 0xF000F0, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();

		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(LaserProjectileEntity entity) {
		return texture;
	}
}
