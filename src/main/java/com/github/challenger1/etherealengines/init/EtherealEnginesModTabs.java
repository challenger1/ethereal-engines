
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.challenger1.etherealengines.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EtherealEnginesModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(EtherealEnginesModItems.ETHERIUM_BUCKET.get());
			tabData.accept(EtherealEnginesModItems.ETHERIA.get());
		}

		if (tabData.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(EtherealEnginesModBlocks.GROWING_CRYSTAL.get().asItem());
			tabData.accept(EtherealEnginesModBlocks.CRYSTAL_BODY.get().asItem());
		}
	}
}
