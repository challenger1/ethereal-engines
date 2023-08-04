
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.challenger1.etherealengines.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import com.github.challenger1.etherealengines.item.EtheriumItem;
import com.github.challenger1.etherealengines.item.EtheriaItem;
import com.github.challenger1.etherealengines.EtherealEnginesMod;

public class EtherealEnginesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EtherealEnginesMod.MODID);
	public static final RegistryObject<Item> ETHERIUM_BUCKET = REGISTRY.register("etherium_bucket", () -> new EtheriumItem());
	public static final RegistryObject<Item> ETHEREAL_BLOCK = block(EtherealEnginesModBlocks.ETHEREAL_BLOCK);
	public static final RegistryObject<Item> ETHERIA = REGISTRY.register("etheria", () -> new EtheriaItem());
	public static final RegistryObject<Item> ETHEREAL_STONE = block(EtherealEnginesModBlocks.ETHEREAL_STONE);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
