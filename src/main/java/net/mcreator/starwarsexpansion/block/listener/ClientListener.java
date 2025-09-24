package net.mcreator.starwarsexpansion.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.starwarsexpansion.init.StarWarsExpansionModBlockEntities;
import net.mcreator.starwarsexpansion.block.renderer.WorkspaceBenchTileRenderer;
import net.mcreator.starwarsexpansion.block.renderer.StatueTileRenderer;
import net.mcreator.starwarsexpansion.block.renderer.MoistureVaporatorTileRenderer;
import net.mcreator.starwarsexpansion.block.renderer.HolocronTileRenderer;
import net.mcreator.starwarsexpansion.block.renderer.ControlPanelTileRenderer;
import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

@Mod.EventBusSubscriber(modid = StarWarsExpansionMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(StarWarsExpansionModBlockEntities.MOISTURE_VAPORATOR.get(), context -> new MoistureVaporatorTileRenderer());
		event.registerBlockEntityRenderer(StarWarsExpansionModBlockEntities.WORKSPACE_BENCH.get(), context -> new WorkspaceBenchTileRenderer());
		event.registerBlockEntityRenderer(StarWarsExpansionModBlockEntities.CONTROL_PANEL.get(), context -> new ControlPanelTileRenderer());
		event.registerBlockEntityRenderer(StarWarsExpansionModBlockEntities.HOLOCRON.get(), context -> new HolocronTileRenderer());
		event.registerBlockEntityRenderer(StarWarsExpansionModBlockEntities.STATUE.get(), context -> new StatueTileRenderer());
	}
}
