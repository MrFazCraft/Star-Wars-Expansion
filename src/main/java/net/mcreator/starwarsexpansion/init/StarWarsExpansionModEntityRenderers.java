
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwarsexpansion.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.starwarsexpansion.client.renderer.XWingRenderer;
import net.mcreator.starwarsexpansion.client.renderer.TwiLekPinkRenderer;
import net.mcreator.starwarsexpansion.client.renderer.TwiLekOrangeRenderer;
import net.mcreator.starwarsexpansion.client.renderer.TwiLekDefaultRenderer;
import net.mcreator.starwarsexpansion.client.renderer.TwiLekBlueRenderer;
import net.mcreator.starwarsexpansion.client.renderer.TuskenRaiderRenderer;
import net.mcreator.starwarsexpansion.client.renderer.TauntaunSaddleRenderer;
import net.mcreator.starwarsexpansion.client.renderer.TauntaunRenderer;
import net.mcreator.starwarsexpansion.client.renderer.TIEFighterRenderer;
import net.mcreator.starwarsexpansion.client.renderer.T3M4Renderer;
import net.mcreator.starwarsexpansion.client.renderer.SpeederBikeRenderer;
import net.mcreator.starwarsexpansion.client.renderer.SnowspeederRenderer;
import net.mcreator.starwarsexpansion.client.renderer.RodianRedRenderer;
import net.mcreator.starwarsexpansion.client.renderer.RodianGreenRenderer;
import net.mcreator.starwarsexpansion.client.renderer.RodianDefaultRenderer;
import net.mcreator.starwarsexpansion.client.renderer.RodianBlueRenderer;
import net.mcreator.starwarsexpansion.client.renderer.ProtocolDroidWhiteRenderer;
import net.mcreator.starwarsexpansion.client.renderer.ProtocolDroidPinkRenderer;
import net.mcreator.starwarsexpansion.client.renderer.ProtocolDroidGoldRenderer;
import net.mcreator.starwarsexpansion.client.renderer.MouseDroidRenderer;
import net.mcreator.starwarsexpansion.client.renderer.LaserProjectileRenderer;
import net.mcreator.starwarsexpansion.client.renderer.LandspeederRenderer;
import net.mcreator.starwarsexpansion.client.renderer.KryknaRenderer;
import net.mcreator.starwarsexpansion.client.renderer.JawaRenderer;
import net.mcreator.starwarsexpansion.client.renderer.IthorianRenderer;
import net.mcreator.starwarsexpansion.client.renderer.HumanRenderer;
import net.mcreator.starwarsexpansion.client.renderer.GonkDroidRenderer;
import net.mcreator.starwarsexpansion.client.renderer.EscapePodRenderer;
import net.mcreator.starwarsexpansion.client.renderer.EnemyLaserProjectileRenderer;
import net.mcreator.starwarsexpansion.client.renderer.BrokenEscapePodRenderer;
import net.mcreator.starwarsexpansion.client.renderer.BattleDroidRenderer;
import net.mcreator.starwarsexpansion.client.renderer.BanthaRenderer;
import net.mcreator.starwarsexpansion.client.renderer.AstromechDroidRedRenderer;
import net.mcreator.starwarsexpansion.client.renderer.AstromechDroidPinkRenderer;
import net.mcreator.starwarsexpansion.client.renderer.AstromechDroidBlueRenderer;
import net.mcreator.starwarsexpansion.client.renderer.ArgesFrogRenderer;
import net.mcreator.starwarsexpansion.client.renderer.ATSTRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StarWarsExpansionModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(StarWarsExpansionModEntities.ASTROMECH_DROID_BLUE.get(), AstromechDroidBlueRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.PROTOCOL_DROID_GOLD.get(), ProtocolDroidGoldRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.ASTROMECH_DROID_RED.get(), AstromechDroidRedRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.ASTROMECH_DROID_PINK.get(), AstromechDroidPinkRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.PROTOCOL_DROID_WHITE.get(), ProtocolDroidWhiteRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.PROTOCOL_DROID_PINK.get(), ProtocolDroidPinkRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.GONK_DROID.get(), GonkDroidRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.LASER_PROJECTILE.get(), LaserProjectileRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.MOUSE_DROID.get(), MouseDroidRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.RODIAN_GREEN.get(), RodianGreenRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.RODIAN_BLUE.get(), RodianBlueRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.RODIAN_RED.get(), RodianRedRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.RODIAN_DEFAULT.get(), RodianDefaultRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.ITHORIAN.get(), IthorianRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.JAWA.get(), JawaRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.TWI_LEK_BLUE.get(), TwiLekBlueRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.TWI_LEK_ORANGE.get(), TwiLekOrangeRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.TWI_LEK_PINK.get(), TwiLekPinkRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.TWI_LEK_DEFAULT.get(), TwiLekDefaultRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.TUSKEN_RAIDER.get(), TuskenRaiderRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.BANTHA.get(), BanthaRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.BATTLE_DROID.get(), BattleDroidRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.ENEMY_LASER_PROJECTILE.get(), EnemyLaserProjectileRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.KRYKNA.get(), KryknaRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.ARGES_FROG.get(), ArgesFrogRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.HUMAN.get(), HumanRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.LANDSPEEDER.get(), LandspeederRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.X_WING.get(), XWingRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.T_3_M_4.get(), T3M4Renderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.SPEEDER_BIKE.get(), SpeederBikeRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.TIE_FIGHTER.get(), TIEFighterRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.ESCAPE_POD.get(), EscapePodRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.BROKEN_ESCAPE_POD.get(), BrokenEscapePodRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.ATST.get(), ATSTRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.SNOWSPEEDER.get(), SnowspeederRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.TAUNTAUN.get(), TauntaunRenderer::new);
		event.registerEntityRenderer(StarWarsExpansionModEntities.TAUNTAUN_SADDLE.get(), TauntaunSaddleRenderer::new);
	}
}
