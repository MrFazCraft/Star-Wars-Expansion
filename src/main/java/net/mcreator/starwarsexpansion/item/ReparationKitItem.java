
package net.mcreator.starwarsexpansion.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ReparationKitItem extends Item {
	public ReparationKitItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
