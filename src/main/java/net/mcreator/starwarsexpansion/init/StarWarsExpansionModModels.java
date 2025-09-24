
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwarsexpansion.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.starwarsexpansion.client.model.Modeltempleguard;
import net.mcreator.starwarsexpansion.client.model.Modelstormtrooper;
import net.mcreator.starwarsexpansion.client.model.Modelstabilizermask;
import net.mcreator.starwarsexpansion.client.model.Modelsnowsuit;
import net.mcreator.starwarsexpansion.client.model.Modellaser;
import net.mcreator.starwarsexpansion.client.model.Modeljediclothes;
import net.mcreator.starwarsexpansion.client.model.Modelgrandmasterjediclothes;
import net.mcreator.starwarsexpansion.client.model.Modeldooniumarmor;
import net.mcreator.starwarsexpansion.client.model.Modelclonebase;
import net.mcreator.starwarsexpansion.client.model.Modelbeskararmor;
import net.mcreator.starwarsexpansion.client.model.Modelband;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class StarWarsExpansionModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modellaser.LAYER_LOCATION, Modellaser::createBodyLayer);
		event.registerLayerDefinition(Modelsnowsuit.LAYER_LOCATION, Modelsnowsuit::createBodyLayer);
		event.registerLayerDefinition(Modelband.LAYER_LOCATION, Modelband::createBodyLayer);
		event.registerLayerDefinition(Modeltempleguard.LAYER_LOCATION, Modeltempleguard::createBodyLayer);
		event.registerLayerDefinition(Modelstabilizermask.LAYER_LOCATION, Modelstabilizermask::createBodyLayer);
		event.registerLayerDefinition(Modelgrandmasterjediclothes.LAYER_LOCATION, Modelgrandmasterjediclothes::createBodyLayer);
		event.registerLayerDefinition(Modelstormtrooper.LAYER_LOCATION, Modelstormtrooper::createBodyLayer);
		event.registerLayerDefinition(Modeldooniumarmor.LAYER_LOCATION, Modeldooniumarmor::createBodyLayer);
		event.registerLayerDefinition(Modelbeskararmor.LAYER_LOCATION, Modelbeskararmor::createBodyLayer);
		event.registerLayerDefinition(Modeljediclothes.LAYER_LOCATION, Modeljediclothes::createBodyLayer);
		event.registerLayerDefinition(Modelclonebase.LAYER_LOCATION, Modelclonebase::createBodyLayer);
	}
}
