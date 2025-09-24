
package net.mcreator.starwarsexpansion.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SaberHandleItem extends Item {
	public SaberHandleItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
