
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.starwarsexpansion.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class StarWarsExpansionModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == StarWarsExpansionModVillagerProfessions.BUTCHER_TRADER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.RAW_BANTHA_MEAT.get(), 15),

					new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get(), 5), 10, 5, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.BUTCHER_TRADER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.BANHTA_HORN.get(), 5),

					new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get(), 5), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.BANTHA_MILK.get()),

					new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get(), 10), 10, 5, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.BUTCHER_TRADER.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.KRYKNA_LEG.get(), 5),

					new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get(), 5), 10, 15, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.KRYKNA_STRING.get(), 5),

					new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get(), 5), 10, 15, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.BUTCHER_TRADER.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.ARGES_FROG_LEG.get(), 5),

					new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get(), 5), 10, 15, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.BUTCHER_TRADER.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get(), 2),

					new ItemStack(StarWarsExpansionModItems.MEILOORUN.get()), 10, 25, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get()),

					new ItemStack(Items.CARROT, 5), 10, 25, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.BUTCHER_TRADER.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get(), 2),

					new ItemStack(StarWarsExpansionModItems.JOGAN.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get()),

					new ItemStack(Items.POTATO, 5), 10, 5, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.WEAPONSMITH_TRADER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.DOONIUM_INGOT.get(), 24), new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT_GOLD.get(), 2),
					new ItemStack(StarWarsExpansionModItems.DOONIUM_ARMOR_CHESTPLATE.get()), 10, 5, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.WEAPONSMITH_TRADER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.DOONIUM_INGOT.get(), 24), new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT_GOLD.get(), 2),
					new ItemStack(StarWarsExpansionModItems.DOONIUM_ARMOR_LEGGINGS.get()), 10, 5, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.WEAPONSMITH_TRADER.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.DOONIUM_INGOT.get(), 20), new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT_GOLD.get()),
					new ItemStack(StarWarsExpansionModItems.VIBROBLADE.get()), 10, 15, 0.05f));
			event.getTrades().get(2).add(
					new BasicItemListing(new ItemStack(StarWarsExpansionModItems.DOONIUM_INGOT.get(), 20), new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT_GOLD.get()), new ItemStack(StarWarsExpansionModItems.VIBRO_AXE.get()), 10, 15, 0.05f));
			event.getTrades().get(2).add(
					new BasicItemListing(new ItemStack(StarWarsExpansionModItems.DOONIUM_INGOT.get(), 15), new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get(), 48), new ItemStack(StarWarsExpansionModItems.STUN_BATON.get()), 10, 15, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.WEAPONSMITH_TRADER.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.DOONIUM_INGOT.get(), 20), new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT_GOLD.get()),
					new ItemStack(StarWarsExpansionModItems.BLASTER_E_11.get()), 10, 15, 0.05f));
			event.getTrades().get(2).add(
					new BasicItemListing(new ItemStack(StarWarsExpansionModItems.DOONIUM_INGOT.get(), 25), new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT_GOLD.get()), new ItemStack(StarWarsExpansionModItems.DL_44.get()), 10, 15, 0.05f));
			event.getTrades().get(2).add(
					new BasicItemListing(new ItemStack(StarWarsExpansionModItems.DOONIUM_INGOT.get(), 30), new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT_GOLD.get()), new ItemStack(StarWarsExpansionModItems.WESTAR_34.get()), 10, 15, 0.05f));
			event.getTrades().get(2)
					.add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.DOONIUM_INGOT.get(), 35), new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT_GOLD.get()), new ItemStack(StarWarsExpansionModItems.EE_3.get()), 10, 15, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.WEAPONSMITH_TRADER.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.PLASTOID.get(), 5),

					new ItemStack(StarWarsExpansionModItems.CLONE_ARMOR_HELMET.get()), 10, 25, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.PLASTOID.get(), 7),

					new ItemStack(StarWarsExpansionModItems.CLONE_ARMOR_CHESTPLATE.get()), 10, 25, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.WEAPONSMITH_TRADER.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.PLASTOID.get(), 8),

					new ItemStack(StarWarsExpansionModItems.CLONE_ARMOR_LEGGINGS.get()), 10, 25, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.WEAPONSMITH_TRADER.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.BANTHA_LEATHER.get(), 20), new ItemStack(StarWarsExpansionModItems.KRYKNA_STRING.get(), 15),
					new ItemStack(StarWarsExpansionModItems.BROWN_JEDI_CLOTHES_CHESTPLATE.get()), 10, 35, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.BANTHA_LEATHER.get(), 20), new ItemStack(StarWarsExpansionModItems.KRYKNA_STRING.get(), 15),
					new ItemStack(StarWarsExpansionModItems.GRAY_JEDI_CLOTHES_CHESTPLATE.get()), 10, 35, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.BANTHA_LEATHER.get(), 20), new ItemStack(StarWarsExpansionModItems.KRYKNA_STRING.get(), 15),
					new ItemStack(StarWarsExpansionModItems.BLACK_JEDI_CLOTHES_CHESTPLATE.get()), 10, 35, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.WEAPONSMITH_TRADER.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.DOONIUM_INGOT.get(), 5), new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT_GOLD.get()),
					new ItemStack(StarWarsExpansionModItems.STABILIZER_MASK_HELMET.get()), 10, 45, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.DOONIUM_INGOT.get(), 5), new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT_GOLD.get()),
					new ItemStack(StarWarsExpansionModItems.INTERFACE_BAND_HELMET.get()), 10, 45, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.LUMBERJACK_TRADER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.OAK_LOG, 2),

					new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.BIRCH_LOG, 2),

					new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.SPRUCE_LOG, 2),

					new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.ACACIA_LOG, 2),

					new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.DARK_OAK_LOG, 2),

					new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.JUNGLE_LOG, 2),

					new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get()), 10, 5, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.LUMBERJACK_TRADER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get()),

					new ItemStack(Blocks.OAK_LOG), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get()),

					new ItemStack(Blocks.BIRCH_LOG), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get()),

					new ItemStack(Blocks.SPRUCE_LOG), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get()),

					new ItemStack(Blocks.ACACIA_LOG), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get()),

					new ItemStack(Blocks.DARK_OAK_LOG), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get()),

					new ItemStack(Blocks.JUNGLE_LOG), 10, 5, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.SPACESHIP_TRADER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.QUADANIUM_INGOT.get(), 32), new ItemStack(StarWarsExpansionModItems.ELECTRONIC_BOARD.get(), 16),
					new ItemStack(StarWarsExpansionModItems.LANDSPEEDER_ITEM.get()), 10, 15, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.QUADANIUM_INGOT.get(), 16), new ItemStack(StarWarsExpansionModItems.ELECTRONIC_BOARD.get(), 16),
					new ItemStack(StarWarsExpansionModItems.ESCAPE_POD_ITEM.get()), 10, 5, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.SPACESHIP_TRADER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.QUADANIUM_INGOT.get(), 64), new ItemStack(StarWarsExpansionModItems.ELECTRONIC_BOARD.get(), 32),
					new ItemStack(StarWarsExpansionModItems.X_WING_ITEM.get()), 10, 15, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.SPACESHIP_TRADER.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.QUADANIUM_INGOT.get(), 48), new ItemStack(StarWarsExpansionModItems.ELECTRONIC_BOARD.get(), 20),
					new ItemStack(StarWarsExpansionModItems.SPEEDER_BIKE_ITEM.get()), 10, 35, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.SPACESHIP_TRADER.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.QUADANIUM_INGOT.get(), 64), new ItemStack(StarWarsExpansionModItems.ELECTRONIC_BOARD.get(), 32),
					new ItemStack(StarWarsExpansionModItems.TIE_FIGHTER_ITEM.get()), 10, 35, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.BUTCHER_TRADER.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.QUADANIUM_INGOT.get(), 64), new ItemStack(StarWarsExpansionModItems.ELECTRONIC_BOARD.get(), 64),
					new ItemStack(StarWarsExpansionModItems.ATST_ITEM.get()), 10, 60, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.QUADANIUM_INGOT.get(), 32), new ItemStack(StarWarsExpansionModItems.ELECTRONIC_BOARD.get()),
					new ItemStack(StarWarsExpansionModItems.SNOWSPEEDER_ITEM.get()), 10, 60, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.DROID_TRADER.get()) {
			event.getTrades().get(1).add(
					new BasicItemListing(new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get(), 48), new ItemStack(StarWarsExpansionModItems.ELECTRONIC_BOARD.get(), 5), new ItemStack(StarWarsExpansionModItems.R_2_D_2.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(
					new BasicItemListing(new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get(), 48), new ItemStack(StarWarsExpansionModItems.ELECTRONIC_BOARD.get(), 5), new ItemStack(StarWarsExpansionModItems.R_4_P_17.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(
					new BasicItemListing(new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get(), 48), new ItemStack(StarWarsExpansionModItems.ELECTRONIC_BOARD.get(), 5), new ItemStack(StarWarsExpansionModItems.R_2_KT.get()), 10, 5, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.DROID_TRADER.get()) {
			event.getTrades().get(1).add(
					new BasicItemListing(new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get(), 48), new ItemStack(StarWarsExpansionModItems.ELECTRONIC_BOARD.get(), 5), new ItemStack(StarWarsExpansionModItems.C_3_PO.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(
					new BasicItemListing(new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get(), 48), new ItemStack(StarWarsExpansionModItems.ELECTRONIC_BOARD.get(), 5), new ItemStack(StarWarsExpansionModItems.TC_14.get()), 10, 5, 0.05f));
			event.getTrades().get(1)
					.add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get(), 48), new ItemStack(StarWarsExpansionModItems.ELECTRONIC_BOARD.get(), 5), new ItemStack(StarWarsExpansionModItems.I_82.get()), 10, 5, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.DROID_TRADER.get()) {
			event.getTrades().get(2)
					.add(new BasicItemListing(new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get(), 32), new ItemStack(StarWarsExpansionModItems.ELECTRONIC_BOARD.get(), 5), new ItemStack(StarWarsExpansionModItems.GNK.get()), 10, 5, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.DROID_TRADER.get()) {
			event.getTrades().get(2).add(
					new BasicItemListing(new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get(), 16), new ItemStack(StarWarsExpansionModItems.ELECTRONIC_BOARD.get(), 51), new ItemStack(StarWarsExpansionModItems.MSE_6.get()), 10, 5, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.MINER_TRADER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.IRON_INGOT, 10),

					new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get(), 10), 10, 5, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.MINER_TRADER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.GOLD_INGOT, 10),

					new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get(), 15), 10, 5, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.MINER_TRADER.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10),

					new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get(), 10), 10, 15, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.MINER_TRADER.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.DIAMOND, 10),

					new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get(), 32), 10, 15, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.MINER_TRADER.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.QUARTZ, 32),

					new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT.get(), 8), 10, 25, 0.05f));
		}
		if (event.getType() == StarWarsExpansionModVillagerProfessions.MINER_TRADER.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.NETHERITE_INGOT),

					new ItemStack(StarWarsExpansionModItems.GALACTIC_CREDIT_GOLD.get(), 2), 10, 25, 0.05f));
		}
	}
}
