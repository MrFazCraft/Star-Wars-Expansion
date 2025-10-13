
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwarsexpansion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StarWarsExpansionModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StarWarsExpansionMod.MODID);
	public static final RegistryObject<CreativeModeTab> FORCE_TAB = REGISTRY.register("force_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.star_wars_expansion.force_tab")).icon(() -> new ItemStack(StarWarsExpansionModItems.BROWN_JEDI_CLOTHES_CHESTPLATE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(StarWarsExpansionModItems.BROWN_JEDI_CLOTHES_CHESTPLATE.get());
				tabData.accept(StarWarsExpansionModItems.GRAY_JEDI_CLOTHES_CHESTPLATE.get());
				tabData.accept(StarWarsExpansionModItems.BLACK_JEDI_CLOTHES_CHESTPLATE.get());
				tabData.accept(StarWarsExpansionModItems.SITH_CLOTHES_CHESTPLATE.get());
				tabData.accept(StarWarsExpansionModItems.BLUE_LIGHTSABER_CLOSED.get());
				tabData.accept(StarWarsExpansionModItems.RED_LIGHTSABER_CLOSED.get());
				tabData.accept(StarWarsExpansionModItems.GREEN_LIGHTSABER_CLOSED.get());
				tabData.accept(StarWarsExpansionModItems.YELLOW_LIGHTSABER_CLOSED.get());
				tabData.accept(StarWarsExpansionModItems.PURPLE_LIGHTSABER_CLOSED.get());
				tabData.accept(StarWarsExpansionModItems.KYBER_CRYSTAL_BLUE.get());
				tabData.accept(StarWarsExpansionModItems.KYBER_CRYSTAL_RED.get());
				tabData.accept(StarWarsExpansionModItems.KYBER_CRYSTAL_GREEN.get());
				tabData.accept(StarWarsExpansionModItems.KYBER_CRYSTAL_YELLOW.get());
				tabData.accept(StarWarsExpansionModItems.KYBER_CRYSTAL_PURPLE.get());
				tabData.accept(StarWarsExpansionModItems.GRAND_MASTER_JEDI_CLOTHES_CHESTPLATE.get());
				tabData.accept(StarWarsExpansionModItems.JEDI_TEMPLE_GUARD_ARMOR_HELMET.get());
				tabData.accept(StarWarsExpansionModItems.JEDI_TEMPLE_GUARD_ARMOR_CHESTPLATE.get());
				tabData.accept(StarWarsExpansionModItems.JEDI_TEMPLE_GUARD_ARMOR_LEGGINGS.get());
				tabData.accept(StarWarsExpansionModItems.BLUE_DOUBLE_LIGHTSABER_CLOSED.get());
				tabData.accept(StarWarsExpansionModItems.RED_DOUBLE_LIGHTSABER_CLOSED.get());
				tabData.accept(StarWarsExpansionModItems.GREEN_DOUBLE_LIGHTSABER_CLOSED.get());
				tabData.accept(StarWarsExpansionModItems.YELLOW_DOUBLE_LIGHTSABER_CLOSED.get());
				tabData.accept(StarWarsExpansionModItems.PURPLE_DOUBLE_LIGHTSABER_CLOSED.get());
			}).build());
	public static final RegistryObject<CreativeModeTab> TROOPER_TAB = REGISTRY.register("trooper_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.star_wars_expansion.trooper_tab")).icon(() -> new ItemStack(StarWarsExpansionModItems.CLONE_ARMOR_HELMET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(StarWarsExpansionModItems.CLONE_ARMOR_HELMET.get());
				tabData.accept(StarWarsExpansionModItems.CLONE_ARMOR_CHESTPLATE.get());
				tabData.accept(StarWarsExpansionModItems.CLONE_ARMOR_LEGGINGS.get());
				tabData.accept(StarWarsExpansionModItems.CLONE_ARMOR_501_HELMET.get());
				tabData.accept(StarWarsExpansionModItems.CLONE_ARMOR_501_CHESTPLATE.get());
				tabData.accept(StarWarsExpansionModItems.CLONE_ARMOR_501_LEGGINGS.get());
				tabData.accept(StarWarsExpansionModItems.CLONE_ARMOR_212_HELMET.get());
				tabData.accept(StarWarsExpansionModItems.CLONE_ARMOR_212_CHESTPLATE.get());
				tabData.accept(StarWarsExpansionModItems.CLONE_ARMOR_212_LEGGINGS.get());
				tabData.accept(StarWarsExpansionModItems.CLONE_ARMOR_41_HELMET.get());
				tabData.accept(StarWarsExpansionModItems.CLONE_ARMOR_41_CHESTPLATE.get());
				tabData.accept(StarWarsExpansionModItems.CLONE_ARMOR_41_LEGGINGS.get());
				tabData.accept(StarWarsExpansionModItems.BLASTER_E_11.get());
				tabData.accept(StarWarsExpansionModItems.BESKAR_ARMOR_HELMET.get());
				tabData.accept(StarWarsExpansionModItems.BESKAR_ARMOR_CHESTPLATE.get());
				tabData.accept(StarWarsExpansionModItems.BESKAR_ARMOR_LEGGINGS.get());
				tabData.accept(StarWarsExpansionModItems.VIBROBLADE.get());
				tabData.accept(StarWarsExpansionModItems.DOONIUM_ARMOR_CHESTPLATE.get());
				tabData.accept(StarWarsExpansionModItems.DOONIUM_ARMOR_LEGGINGS.get());
				tabData.accept(StarWarsExpansionModItems.STABILIZER_MASK_HELMET.get());
				tabData.accept(StarWarsExpansionModItems.VIBRO_AXE.get());
				tabData.accept(StarWarsExpansionModItems.INTERFACE_BAND_HELMET.get());
				tabData.accept(StarWarsExpansionModItems.STUN_BATON.get());
				tabData.accept(StarWarsExpansionModItems.DL_44.get());
				tabData.accept(StarWarsExpansionModItems.WESTAR_34.get());
				tabData.accept(StarWarsExpansionModItems.EE_3.get());
				tabData.accept(StarWarsExpansionModItems.GADERFFII_STICK.get());
				tabData.accept(StarWarsExpansionModItems.STORMTROOPER_ARMOR_HELMET.get());
				tabData.accept(StarWarsExpansionModItems.STORMTROOPER_ARMOR_CHESTPLATE.get());
				tabData.accept(StarWarsExpansionModItems.STORMTROOPER_ARMOR_LEGGINGS.get());
				tabData.accept(StarWarsExpansionModItems.SNOW_SUIT_HELMET.get());
				tabData.accept(StarWarsExpansionModItems.SNOW_SUIT_CHESTPLATE.get());
				tabData.accept(StarWarsExpansionModItems.SNOW_SUIT_LEGGINGS.get());
			}).withTabsBefore(FORCE_TAB.getId()).build());
	public static final RegistryObject<CreativeModeTab> ITEMS_TAB = REGISTRY.register("items_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.star_wars_expansion.items_tab")).icon(() -> new ItemStack(StarWarsExpansionModItems.DOONIUM_INGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(StarWarsExpansionModItems.DOONIUM_INGOT.get());
				tabData.accept(StarWarsExpansionModItems.SABER_HANDLE.get());
				tabData.accept(StarWarsExpansionModItems.BESKAR_INGOT.get());
				tabData.accept(StarWarsExpansionModItems.RAW_BANTHA_MEAT.get());
				tabData.accept(StarWarsExpansionModItems.COOKED_BANTHA_MEAT.get());
				tabData.accept(StarWarsExpansionModItems.BANHTA_HORN.get());
				tabData.accept(StarWarsExpansionModItems.GALACTIC_CREDIT.get());
				tabData.accept(StarWarsExpansionModItems.GALACTIC_CREDIT_GOLD.get());
				tabData.accept(StarWarsExpansionModItems.KRYKNA_LEG.get());
				tabData.accept(StarWarsExpansionModItems.KRYKNA_STRING.get());
				tabData.accept(StarWarsExpansionModItems.BANTHA_MILK.get());
				tabData.accept(StarWarsExpansionModItems.ARGES_FROG_LEG.get());
				tabData.accept(StarWarsExpansionModItems.MEILOORUN.get());
				tabData.accept(StarWarsExpansionModItems.JOGAN.get());
				tabData.accept(StarWarsExpansionModItems.PLASTOID.get());
				tabData.accept(StarWarsExpansionModItems.RUBBER.get());
				tabData.accept(StarWarsExpansionModItems.COMPUTER_TIP.get());
				tabData.accept(StarWarsExpansionModItems.BANTHA_LEATHER.get());
				tabData.accept(StarWarsExpansionModItems.QUADANIUM_INGOT.get());
				tabData.accept(StarWarsExpansionModItems.ELECTRONIC_BOARD.get());
				tabData.accept(StarWarsExpansionModItems.SABER_EMITTER.get());
				tabData.accept(StarWarsExpansionModBlocks.HOLOCRON.get().asItem());
				tabData.accept(StarWarsExpansionModItems.REPARATION_KIT.get());
				tabData.accept(StarWarsExpansionModItems.TAUNTAUN_LEATHER.get());
				tabData.accept(StarWarsExpansionModItems.AURODIUM_INGOT.get());
			}).withTabsBefore(TROOPER_TAB.getId()).build());
	public static final RegistryObject<CreativeModeTab> DROID_TAB = REGISTRY.register("droid_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.star_wars_expansion.droid_tab")).icon(() -> new ItemStack(StarWarsExpansionModItems.R_2_D_2.get())).displayItems((parameters, tabData) -> {
				tabData.accept(StarWarsExpansionModItems.R_2_D_2.get());
				tabData.accept(StarWarsExpansionModItems.C_3_PO.get());
				tabData.accept(StarWarsExpansionModItems.R_4_P_17.get());
				tabData.accept(StarWarsExpansionModItems.R_2_KT.get());
				tabData.accept(StarWarsExpansionModItems.TC_14.get());
				tabData.accept(StarWarsExpansionModItems.I_82.get());
				tabData.accept(StarWarsExpansionModItems.GNK.get());
				tabData.accept(StarWarsExpansionModItems.MSE_6.get());
				tabData.accept(StarWarsExpansionModItems.B_1.get());
				tabData.accept(StarWarsExpansionModItems.T_3_M_4_ITEM.get());
			}).withTabsBefore(ITEMS_TAB.getId()).build());
	public static final RegistryObject<CreativeModeTab> VEHICLES_TAB = REGISTRY.register("vehicles_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.star_wars_expansion.vehicles_tab")).icon(() -> new ItemStack(StarWarsExpansionModItems.LANDSPEEDER_ITEM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(StarWarsExpansionModItems.LANDSPEEDER_ITEM.get());
				tabData.accept(StarWarsExpansionModItems.X_WING_ITEM.get());
				tabData.accept(StarWarsExpansionModItems.SPEEDER_BIKE_ITEM.get());
				tabData.accept(StarWarsExpansionModItems.TIE_FIGHTER_ITEM.get());
				tabData.accept(StarWarsExpansionModItems.ESCAPE_POD_ITEM.get());
				tabData.accept(StarWarsExpansionModItems.ATST_ITEM.get());
				tabData.accept(StarWarsExpansionModItems.SNOWSPEEDER_ITEM.get());
			}).withTabsBefore(DROID_TAB.getId()).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(StarWarsExpansionModItems.RODIAN_GREEN_SPAWN_EGG.get());
			tabData.accept(StarWarsExpansionModItems.ITHORIAN_SPAWN_EGG.get());
			tabData.accept(StarWarsExpansionModItems.JAWA_SPAWN_EGG.get());
			tabData.accept(StarWarsExpansionModItems.TWI_LEK_DEFAULT_SPAWN_EGG.get());
			tabData.accept(StarWarsExpansionModItems.TUSKEN_RAIDER_SPAWN_EGG.get());
			tabData.accept(StarWarsExpansionModItems.BANTHA_SPAWN_EGG.get());
			tabData.accept(StarWarsExpansionModItems.KRYKNA_SPAWN_EGG.get());
			tabData.accept(StarWarsExpansionModItems.ARGES_FROG_SPAWN_EGG.get());
			tabData.accept(StarWarsExpansionModItems.HUMAN_SPAWN_EGG.get());
			tabData.accept(StarWarsExpansionModItems.TAUNTAUN_SPAWN_EGG.get());
			tabData.accept(StarWarsExpansionModItems.GAMORREAN_SPAWN_EGG.get());
			tabData.accept(StarWarsExpansionModItems.HUTT_SPAWN_EGG.get());
			tabData.accept(StarWarsExpansionModItems.PIRATE_SPAWN_EGG.get());
			tabData.accept(StarWarsExpansionModItems.EWOK_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(StarWarsExpansionModBlocks.TATOOINE_SAND.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.TATOOINE_SANDSTONE.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.TATOOINE_SANDSTONE_STAIRS.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.TATOOINE_SANDSTONE_SLAB.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.TATOOINE_SANDSTONE_WALL.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.TATOOINE_DOOR.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.MODERN_LANTERN.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.MOISTURE_VAPORATOR.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.DOONIUM_ORE.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.METAL_BLOCK.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.METAL_STAIRS.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.METAL_SLAB.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.WORKSPACE_BENCH.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.CONTROL_PANEL.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.MODERN_PILLAR.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.MODERN_STAIRS.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.MODERN_SLAB.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.CANTINA_LIGHT.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.RUBBER_ORE.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.QUADANIUM_ORE.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.MODERN_BOOKSHELF.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.COPPER_SANDSTONE_ORE.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.HOTH_SNOW.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.HOTH_STONE.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.AURODIUM_ORE.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.METAL_TRAPDOOR.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.GRID_METAL_BLOCK.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.COMPUTER_STATION.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.CONTROL_STATION.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.REDWOOD_LOG.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(StarWarsExpansionModBlocks.MODERN_CRATE.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.MODERN_CRATE_2.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.MODERN_CRATE_3.get().asItem());
			tabData.accept(StarWarsExpansionModBlocks.MODERN_CRATE_4.get().asItem());
		}
	}
}
