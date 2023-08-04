
package com.github.challenger1.etherealengines.item;

import net.minecraft.network.chat.Component;

public class EtheriumItem extends BucketItem {

	public EtheriumItem() {
		super(EtherealEnginesModFluids.ETHERIUM, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}

}
