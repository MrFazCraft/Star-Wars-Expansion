
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwarsexpansion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.starwarsexpansion.entity.XWingEntity;
import net.mcreator.starwarsexpansion.entity.TwiLekPinkEntity;
import net.mcreator.starwarsexpansion.entity.TwiLekOrangeEntity;
import net.mcreator.starwarsexpansion.entity.TwiLekDefaultEntity;
import net.mcreator.starwarsexpansion.entity.TwiLekBlueEntity;
import net.mcreator.starwarsexpansion.entity.TuskenRaiderEntity;
import net.mcreator.starwarsexpansion.entity.TauntaunSaddleEntity;
import net.mcreator.starwarsexpansion.entity.TauntaunEntity;
import net.mcreator.starwarsexpansion.entity.TIEFighterEntity;
import net.mcreator.starwarsexpansion.entity.T3M4Entity;
import net.mcreator.starwarsexpansion.entity.SpeederBikeEntity;
import net.mcreator.starwarsexpansion.entity.SnowspeederEntity;
import net.mcreator.starwarsexpansion.entity.RodianRedEntity;
import net.mcreator.starwarsexpansion.entity.RodianGreenEntity;
import net.mcreator.starwarsexpansion.entity.RodianDefaultEntity;
import net.mcreator.starwarsexpansion.entity.RodianBlueEntity;
import net.mcreator.starwarsexpansion.entity.ProtocolDroidWhiteEntity;
import net.mcreator.starwarsexpansion.entity.ProtocolDroidPinkEntity;
import net.mcreator.starwarsexpansion.entity.ProtocolDroidGoldEntity;
import net.mcreator.starwarsexpansion.entity.MouseDroidEntity;
import net.mcreator.starwarsexpansion.entity.LaserProjectileEntity;
import net.mcreator.starwarsexpansion.entity.LandspeederEntity;
import net.mcreator.starwarsexpansion.entity.KryknaEntity;
import net.mcreator.starwarsexpansion.entity.JawaEntity;
import net.mcreator.starwarsexpansion.entity.IthorianEntity;
import net.mcreator.starwarsexpansion.entity.HumanEntity;
import net.mcreator.starwarsexpansion.entity.GonkDroidEntity;
import net.mcreator.starwarsexpansion.entity.EscapePodEntity;
import net.mcreator.starwarsexpansion.entity.EnemyLaserProjectileEntity;
import net.mcreator.starwarsexpansion.entity.BrokenEscapePodEntity;
import net.mcreator.starwarsexpansion.entity.BattleDroidEntity;
import net.mcreator.starwarsexpansion.entity.BanthaEntity;
import net.mcreator.starwarsexpansion.entity.AstromechDroidRedEntity;
import net.mcreator.starwarsexpansion.entity.AstromechDroidPinkEntity;
import net.mcreator.starwarsexpansion.entity.AstromechDroidBlueEntity;
import net.mcreator.starwarsexpansion.entity.ArgesFrogEntity;
import net.mcreator.starwarsexpansion.entity.ATSTEntity;
import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StarWarsExpansionModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, StarWarsExpansionMod.MODID);
	public static final RegistryObject<EntityType<AstromechDroidBlueEntity>> ASTROMECH_DROID_BLUE = register("astromech_droid_blue", EntityType.Builder.<AstromechDroidBlueEntity>of(AstromechDroidBlueEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AstromechDroidBlueEntity::new).fireImmune().sized(0.5f, 1.3f));
	public static final RegistryObject<EntityType<ProtocolDroidGoldEntity>> PROTOCOL_DROID_GOLD = register("protocol_droid_gold", EntityType.Builder.<ProtocolDroidGoldEntity>of(ProtocolDroidGoldEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ProtocolDroidGoldEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<AstromechDroidRedEntity>> ASTROMECH_DROID_RED = register("astromech_droid_red", EntityType.Builder.<AstromechDroidRedEntity>of(AstromechDroidRedEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AstromechDroidRedEntity::new).fireImmune().sized(0.5f, 1.3f));
	public static final RegistryObject<EntityType<AstromechDroidPinkEntity>> ASTROMECH_DROID_PINK = register("astromech_droid_pink", EntityType.Builder.<AstromechDroidPinkEntity>of(AstromechDroidPinkEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AstromechDroidPinkEntity::new).fireImmune().sized(0.5f, 1.3f));
	public static final RegistryObject<EntityType<ProtocolDroidWhiteEntity>> PROTOCOL_DROID_WHITE = register("protocol_droid_white", EntityType.Builder.<ProtocolDroidWhiteEntity>of(ProtocolDroidWhiteEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ProtocolDroidWhiteEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<ProtocolDroidPinkEntity>> PROTOCOL_DROID_PINK = register("protocol_droid_pink", EntityType.Builder.<ProtocolDroidPinkEntity>of(ProtocolDroidPinkEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ProtocolDroidPinkEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<GonkDroidEntity>> GONK_DROID = register("gonk_droid",
			EntityType.Builder.<GonkDroidEntity>of(GonkDroidEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GonkDroidEntity::new).fireImmune().sized(0.6f, 2f));
	public static final RegistryObject<EntityType<LaserProjectileEntity>> LASER_PROJECTILE = register("laser_projectile", EntityType.Builder.<LaserProjectileEntity>of(LaserProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(LaserProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.3f, 0.3f));
	public static final RegistryObject<EntityType<MouseDroidEntity>> MOUSE_DROID = register("mouse_droid", EntityType.Builder.<MouseDroidEntity>of(MouseDroidEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(MouseDroidEntity::new).fireImmune().sized(0.3f, 0.6f));
	public static final RegistryObject<EntityType<RodianGreenEntity>> RODIAN_GREEN = register("rodian_green",
			EntityType.Builder.<RodianGreenEntity>of(RodianGreenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RodianGreenEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RodianBlueEntity>> RODIAN_BLUE = register("rodian_blue",
			EntityType.Builder.<RodianBlueEntity>of(RodianBlueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RodianBlueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RodianRedEntity>> RODIAN_RED = register("rodian_red",
			EntityType.Builder.<RodianRedEntity>of(RodianRedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RodianRedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RodianDefaultEntity>> RODIAN_DEFAULT = register("rodian_default",
			EntityType.Builder.<RodianDefaultEntity>of(RodianDefaultEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RodianDefaultEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<IthorianEntity>> ITHORIAN = register("ithorian",
			EntityType.Builder.<IthorianEntity>of(IthorianEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(IthorianEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JawaEntity>> JAWA = register("jawa",
			EntityType.Builder.<JawaEntity>of(JawaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JawaEntity::new)

					.sized(0.6f, 1.2f));
	public static final RegistryObject<EntityType<TwiLekBlueEntity>> TWI_LEK_BLUE = register("twi_lek_blue",
			EntityType.Builder.<TwiLekBlueEntity>of(TwiLekBlueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TwiLekBlueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TwiLekOrangeEntity>> TWI_LEK_ORANGE = register("twi_lek_orange",
			EntityType.Builder.<TwiLekOrangeEntity>of(TwiLekOrangeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TwiLekOrangeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TwiLekPinkEntity>> TWI_LEK_PINK = register("twi_lek_pink",
			EntityType.Builder.<TwiLekPinkEntity>of(TwiLekPinkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TwiLekPinkEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TwiLekDefaultEntity>> TWI_LEK_DEFAULT = register("twi_lek_default",
			EntityType.Builder.<TwiLekDefaultEntity>of(TwiLekDefaultEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TwiLekDefaultEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TuskenRaiderEntity>> TUSKEN_RAIDER = register("tusken_raider",
			EntityType.Builder.<TuskenRaiderEntity>of(TuskenRaiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TuskenRaiderEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BanthaEntity>> BANTHA = register("bantha",
			EntityType.Builder.<BanthaEntity>of(BanthaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BanthaEntity::new)

					.sized(2f, 2f));
	public static final RegistryObject<EntityType<BattleDroidEntity>> BATTLE_DROID = register("battle_droid",
			EntityType.Builder.<BattleDroidEntity>of(BattleDroidEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BattleDroidEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnemyLaserProjectileEntity>> ENEMY_LASER_PROJECTILE = register("enemy_laser_projectile", EntityType.Builder.<EnemyLaserProjectileEntity>of(EnemyLaserProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(EnemyLaserProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.2f, 0.2f));
	public static final RegistryObject<EntityType<KryknaEntity>> KRYKNA = register("krykna",
			EntityType.Builder.<KryknaEntity>of(KryknaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KryknaEntity::new)

					.sized(0.6f, 1.2f));
	public static final RegistryObject<EntityType<ArgesFrogEntity>> ARGES_FROG = register("arges_frog",
			EntityType.Builder.<ArgesFrogEntity>of(ArgesFrogEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ArgesFrogEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HumanEntity>> HUMAN = register("human",
			EntityType.Builder.<HumanEntity>of(HumanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HumanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LandspeederEntity>> LANDSPEEDER = register("landspeeder", EntityType.Builder.<LandspeederEntity>of(LandspeederEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LandspeederEntity::new).fireImmune().sized(2f, 0.8f));
	public static final RegistryObject<EntityType<XWingEntity>> X_WING = register("x_wing",
			EntityType.Builder.<XWingEntity>of(XWingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(XWingEntity::new).fireImmune().sized(6f, 2f));
	public static final RegistryObject<EntityType<T3M4Entity>> T_3_M_4 = register("t_3_m_4",
			EntityType.Builder.<T3M4Entity>of(T3M4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(T3M4Entity::new).fireImmune().sized(0.5f, 1.3f));
	public static final RegistryObject<EntityType<SpeederBikeEntity>> SPEEDER_BIKE = register("speeder_bike", EntityType.Builder.<SpeederBikeEntity>of(SpeederBikeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpeederBikeEntity::new).fireImmune().sized(2f, 0.8f));
	public static final RegistryObject<EntityType<TIEFighterEntity>> TIE_FIGHTER = register("tie_fighter", EntityType.Builder.<TIEFighterEntity>of(TIEFighterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(TIEFighterEntity::new).fireImmune().sized(2f, 4.5f));
	public static final RegistryObject<EntityType<EscapePodEntity>> ESCAPE_POD = register("escape_pod",
			EntityType.Builder.<EscapePodEntity>of(EscapePodEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EscapePodEntity::new).fireImmune().sized(2f, 6f));
	public static final RegistryObject<EntityType<BrokenEscapePodEntity>> BROKEN_ESCAPE_POD = register("broken_escape_pod", EntityType.Builder.<BrokenEscapePodEntity>of(BrokenEscapePodEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BrokenEscapePodEntity::new).fireImmune().sized(3f, 2f));
	public static final RegistryObject<EntityType<ATSTEntity>> ATST = register("atst",
			EntityType.Builder.<ATSTEntity>of(ATSTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ATSTEntity::new).fireImmune().sized(3f, 9f));
	public static final RegistryObject<EntityType<SnowspeederEntity>> SNOWSPEEDER = register("snowspeeder", EntityType.Builder.<SnowspeederEntity>of(SnowspeederEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SnowspeederEntity::new).fireImmune().sized(6f, 2f));
	public static final RegistryObject<EntityType<TauntaunEntity>> TAUNTAUN = register("tauntaun",
			EntityType.Builder.<TauntaunEntity>of(TauntaunEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TauntaunEntity::new)

					.sized(1f, 2f));
	public static final RegistryObject<EntityType<TauntaunSaddleEntity>> TAUNTAUN_SADDLE = register("tauntaun_saddle",
			EntityType.Builder.<TauntaunSaddleEntity>of(TauntaunSaddleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TauntaunSaddleEntity::new)

					.sized(1f, 2f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			AstromechDroidBlueEntity.init();
			ProtocolDroidGoldEntity.init();
			AstromechDroidRedEntity.init();
			AstromechDroidPinkEntity.init();
			ProtocolDroidWhiteEntity.init();
			ProtocolDroidPinkEntity.init();
			GonkDroidEntity.init();
			MouseDroidEntity.init();
			RodianGreenEntity.init();
			RodianBlueEntity.init();
			RodianRedEntity.init();
			RodianDefaultEntity.init();
			IthorianEntity.init();
			JawaEntity.init();
			TwiLekBlueEntity.init();
			TwiLekOrangeEntity.init();
			TwiLekPinkEntity.init();
			TwiLekDefaultEntity.init();
			TuskenRaiderEntity.init();
			BanthaEntity.init();
			BattleDroidEntity.init();
			KryknaEntity.init();
			ArgesFrogEntity.init();
			HumanEntity.init();
			LandspeederEntity.init();
			XWingEntity.init();
			T3M4Entity.init();
			SpeederBikeEntity.init();
			TIEFighterEntity.init();
			EscapePodEntity.init();
			BrokenEscapePodEntity.init();
			ATSTEntity.init();
			SnowspeederEntity.init();
			TauntaunEntity.init();
			TauntaunSaddleEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ASTROMECH_DROID_BLUE.get(), AstromechDroidBlueEntity.createAttributes().build());
		event.put(PROTOCOL_DROID_GOLD.get(), ProtocolDroidGoldEntity.createAttributes().build());
		event.put(ASTROMECH_DROID_RED.get(), AstromechDroidRedEntity.createAttributes().build());
		event.put(ASTROMECH_DROID_PINK.get(), AstromechDroidPinkEntity.createAttributes().build());
		event.put(PROTOCOL_DROID_WHITE.get(), ProtocolDroidWhiteEntity.createAttributes().build());
		event.put(PROTOCOL_DROID_PINK.get(), ProtocolDroidPinkEntity.createAttributes().build());
		event.put(GONK_DROID.get(), GonkDroidEntity.createAttributes().build());
		event.put(MOUSE_DROID.get(), MouseDroidEntity.createAttributes().build());
		event.put(RODIAN_GREEN.get(), RodianGreenEntity.createAttributes().build());
		event.put(RODIAN_BLUE.get(), RodianBlueEntity.createAttributes().build());
		event.put(RODIAN_RED.get(), RodianRedEntity.createAttributes().build());
		event.put(RODIAN_DEFAULT.get(), RodianDefaultEntity.createAttributes().build());
		event.put(ITHORIAN.get(), IthorianEntity.createAttributes().build());
		event.put(JAWA.get(), JawaEntity.createAttributes().build());
		event.put(TWI_LEK_BLUE.get(), TwiLekBlueEntity.createAttributes().build());
		event.put(TWI_LEK_ORANGE.get(), TwiLekOrangeEntity.createAttributes().build());
		event.put(TWI_LEK_PINK.get(), TwiLekPinkEntity.createAttributes().build());
		event.put(TWI_LEK_DEFAULT.get(), TwiLekDefaultEntity.createAttributes().build());
		event.put(TUSKEN_RAIDER.get(), TuskenRaiderEntity.createAttributes().build());
		event.put(BANTHA.get(), BanthaEntity.createAttributes().build());
		event.put(BATTLE_DROID.get(), BattleDroidEntity.createAttributes().build());
		event.put(KRYKNA.get(), KryknaEntity.createAttributes().build());
		event.put(ARGES_FROG.get(), ArgesFrogEntity.createAttributes().build());
		event.put(HUMAN.get(), HumanEntity.createAttributes().build());
		event.put(LANDSPEEDER.get(), LandspeederEntity.createAttributes().build());
		event.put(X_WING.get(), XWingEntity.createAttributes().build());
		event.put(T_3_M_4.get(), T3M4Entity.createAttributes().build());
		event.put(SPEEDER_BIKE.get(), SpeederBikeEntity.createAttributes().build());
		event.put(TIE_FIGHTER.get(), TIEFighterEntity.createAttributes().build());
		event.put(ESCAPE_POD.get(), EscapePodEntity.createAttributes().build());
		event.put(BROKEN_ESCAPE_POD.get(), BrokenEscapePodEntity.createAttributes().build());
		event.put(ATST.get(), ATSTEntity.createAttributes().build());
		event.put(SNOWSPEEDER.get(), SnowspeederEntity.createAttributes().build());
		event.put(TAUNTAUN.get(), TauntaunEntity.createAttributes().build());
		event.put(TAUNTAUN_SADDLE.get(), TauntaunSaddleEntity.createAttributes().build());
	}
}
