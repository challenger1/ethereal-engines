
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.challenger1.etherealengines.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import com.github.challenger1.etherealengines.item.EtheriumItem;
import com.github.challenger1.etherealengines.item.EtheriaItem;
import com.github.challenger1.etherealengines.item.CrystalShardItem;
import com.github.challenger1.etherealengines.EtherealEnginesMod;

public class EtherealEnginesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EtherealEnginesMod.MODID);
	public static final RegistryObject<Item> ETHERIUM_BUCKET = REGISTRY.register("etherium_bucket", () -> new EtheriumItem());
	public static final RegistryObject<Item> ETHEREAL_BLOCK = block(EtherealEnginesModBlocks.ETHEREAL_BLOCK);
	public static final RegistryObject<Item> ETHERIA = REGISTRY.register("etheria", () -> new EtheriaItem());
	public static final RegistryObject<Item> ETHEREAL_STONE = block(EtherealEnginesModBlocks.ETHEREAL_STONE);
	public static final RegistryObject<Item> GROWING_CRYSTAL = doubleBlock(EtherealEnginesModBlocks.GROWING_CRYSTAL);
	public static final RegistryObject<Item> CRYSTAL_BODY = block(EtherealEnginesModBlocks.CRYSTAL_BODY);
	public static final RegistryObject<Item> CRYSTAL_APEX = block(EtherealEnginesModBlocks.CRYSTAL_APEX);
	public static final RegistryObject<Item> CRYSTAL_SHARD = REGISTRY.register("crystal_shard", () -> new CrystalShardItem());
	public static final RegistryObject<Item> WIZARD_SPAWN_EGG = REGISTRY.register("wizard_spawn_egg", () -> new ForgeSpawnEggItem(EtherealEnginesModEntities.WIZARD, -10092340, -10079488, new Item.Properties()));
	public static final RegistryObject<Item> BLACKEST_BLOCK = block(EtherealEnginesModBlocks.BLACKEST_BLOCK);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
