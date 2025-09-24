
package net.mcreator.starwarsexpansion.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PlastoidItem extends Item {
	public PlastoidItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
