
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwarsexpansion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.starwarsexpansion.world.inventory.PlanetAnchorGUIMenu;
import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

public class StarWarsExpansionModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, StarWarsExpansionMod.MODID);
	public static final RegistryObject<MenuType<PlanetAnchorGUIMenu>> PLANET_ANCHOR_GUI = REGISTRY.register("planet_anchor_gui", () -> IForgeMenuType.create(PlanetAnchorGUIMenu::new));
}
