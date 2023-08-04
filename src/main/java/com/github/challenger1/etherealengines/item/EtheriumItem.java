
package com.github.challenger1.etherealengines.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import com.github.challenger1.etherealengines.init.EtherealEnginesModFluids;

public class EtheriumItem extends BucketItem {
	public EtheriumItem() {
		super(EtherealEnginesModFluids.ETHERIUM, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
