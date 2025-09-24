
package net.mcreator.starwarsexpansion.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GalacticCreditGoldItem extends Item {
	public GalacticCreditGoldItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
