
package com.github.challenger1.etherealengines.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class EtheriumBlock extends LiquidBlock {
	public EtheriumBlock() {
		super(() -> EtherealEnginesModFluids.ETHERIUM.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}
}