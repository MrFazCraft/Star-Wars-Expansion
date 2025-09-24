package net.mcreator.starwarsexpansion.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.starwarsexpansion.entity.XWingEntity;
import net.mcreator.starwarsexpansion.entity.TIEFighterEntity;
import net.mcreator.starwarsexpansion.entity.SnowspeederEntity;
import net.mcreator.starwarsexpansion.entity.EscapePodEntity;
import net.mcreator.starwarsexpansion.entity.ATSTEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SpaceshipInvisibleConditionProcedure {
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            execute(event, event.player);
        }
    }

    public static void execute(Entity entity) {
        execute(null, entity);
    }

    private static void execute(@Nullable TickEvent event, Entity entity) {
        if (entity == null)
            return;

        // Verifica que esté montando una nave (X-Wing, TIE Fighter, Snowspeeder, Escape Pod o AT-ST)
        if (entity.isPassenger() && (entity.getVehicle() instanceof XWingEntity
                                  || entity.getVehicle() instanceof TIEFighterEntity
                                  || entity.getVehicle() instanceof SnowspeederEntity
                                  || entity.getVehicle() instanceof EscapePodEntity
                                  || entity.getVehicle() instanceof ATSTEntity)) {
            if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
                // Aplica invisibilidad
                _entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 5, 0, false, false));

                // Manejo de armadura solo para jugadores
                if (_entity instanceof Player player) {
                    for (EquipmentSlot slot : new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET}) {
                        ItemStack armorPiece = player.getItemBySlot(slot).copy();
                        if (!armorPiece.isEmpty()) {
                            addToInventory(player, armorPiece);
                            player.setItemSlot(slot, ItemStack.EMPTY);
                        }
                    }
                }
            }
        }
    }

    // Método seguro para añadir al inventario
    private static void addToInventory(Player player, ItemStack stack) {
        if (!stack.isEmpty()) {
            boolean added = player.getInventory().add(stack);
            if (!added) {
                player.drop(stack, false);
            }
        }
    }
}
