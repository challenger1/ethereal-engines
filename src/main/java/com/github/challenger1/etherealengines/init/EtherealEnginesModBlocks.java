
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.challenger1.etherealengines.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.github.challenger1.etherealengines.block.EtherealBlockBlock;
import com.github.challenger1.etherealengines.EtherealEnginesMod;

public class EtherealEnginesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EtherealEnginesMod.MODID);
	public static final RegistryObject<Block> ETHEREAL_BLOCK = REGISTRY.register("ethereal_block", () -> new EtherealBlockBlock());
}
