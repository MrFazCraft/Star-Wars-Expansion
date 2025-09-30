
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwarsexpansion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.starwarsexpansion.block.entity.WorkspaceBenchTileEntity;
import net.mcreator.starwarsexpansion.block.entity.StatueTileEntity;
import net.mcreator.starwarsexpansion.block.entity.MoistureVaporatorTileEntity;
import net.mcreator.starwarsexpansion.block.entity.KoltoTankTileEntity;
import net.mcreator.starwarsexpansion.block.entity.HolocronTileEntity;
import net.mcreator.starwarsexpansion.block.entity.ControlStationTileEntity;
import net.mcreator.starwarsexpansion.block.entity.ControlPanelTileEntity;
import net.mcreator.starwarsexpansion.block.entity.ComputerStationTileEntity;
import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

public class StarWarsExpansionModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, StarWarsExpansionMod.MODID);
	public static final RegistryObject<BlockEntityType<MoistureVaporatorTileEntity>> MOISTURE_VAPORATOR = REGISTRY.register("moisture_vaporator",
			() -> BlockEntityType.Builder.of(MoistureVaporatorTileEntity::new, StarWarsExpansionModBlocks.MOISTURE_VAPORATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<WorkspaceBenchTileEntity>> WORKSPACE_BENCH = REGISTRY.register("workspace_bench",
			() -> BlockEntityType.Builder.of(WorkspaceBenchTileEntity::new, StarWarsExpansionModBlocks.WORKSPACE_BENCH.get()).build(null));
	public static final RegistryObject<BlockEntityType<ControlPanelTileEntity>> CONTROL_PANEL = REGISTRY.register("control_panel",
			() -> BlockEntityType.Builder.of(ControlPanelTileEntity::new, StarWarsExpansionModBlocks.CONTROL_PANEL.get()).build(null));
	public static final RegistryObject<BlockEntityType<HolocronTileEntity>> HOLOCRON = REGISTRY.register("holocron", () -> BlockEntityType.Builder.of(HolocronTileEntity::new, StarWarsExpansionModBlocks.HOLOCRON.get()).build(null));
	public static final RegistryObject<BlockEntityType<StatueTileEntity>> STATUE = REGISTRY.register("statue", () -> BlockEntityType.Builder.of(StatueTileEntity::new, StarWarsExpansionModBlocks.STATUE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ComputerStationTileEntity>> COMPUTER_STATION = REGISTRY.register("computer_station",
			() -> BlockEntityType.Builder.of(ComputerStationTileEntity::new, StarWarsExpansionModBlocks.COMPUTER_STATION.get()).build(null));
	public static final RegistryObject<BlockEntityType<ControlStationTileEntity>> CONTROL_STATION = REGISTRY.register("control_station",
			() -> BlockEntityType.Builder.of(ControlStationTileEntity::new, StarWarsExpansionModBlocks.CONTROL_STATION.get()).build(null));
	public static final RegistryObject<BlockEntityType<KoltoTankTileEntity>> KOLTO_TANK = REGISTRY.register("kolto_tank", () -> BlockEntityType.Builder.of(KoltoTankTileEntity::new, StarWarsExpansionModBlocks.KOLTO_TANK.get()).build(null));

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
