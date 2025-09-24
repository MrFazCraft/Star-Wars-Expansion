
package net.mcreator.starwarsexpansion.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GalacticCreditItem extends Item {
	public GalacticCreditItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
