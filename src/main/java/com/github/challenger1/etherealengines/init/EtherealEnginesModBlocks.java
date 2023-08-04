
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.challenger1.etherealengines.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import com.github.challenger1.etherealengines.block.GrowingCrystalBlock;
import com.github.challenger1.etherealengines.block.EtheriumBlock;
import com.github.challenger1.etherealengines.block.EtheriaPortalBlock;
import com.github.challenger1.etherealengines.block.EtherealStoneBlock;
import com.github.challenger1.etherealengines.block.EtherealBlockBlock;
import com.github.challenger1.etherealengines.EtherealEnginesMod;

public class EtherealEnginesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EtherealEnginesMod.MODID);
	public static final RegistryObject<Block> ETHERIUM = REGISTRY.register("etherium", () -> new EtheriumBlock());
	public static final RegistryObject<Block> ETHEREAL_BLOCK = REGISTRY.register("ethereal_block", () -> new EtherealBlockBlock());
	public static final RegistryObject<Block> ETHERIA_PORTAL = REGISTRY.register("etheria_portal", () -> new EtheriaPortalBlock());
	public static final RegistryObject<Block> ETHEREAL_STONE = REGISTRY.register("ethereal_stone", () -> new EtherealStoneBlock());
	public static final RegistryObject<Block> GROWING_CRYSTAL = REGISTRY.register("growing_crystal", () -> new GrowingCrystalBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			EtherealStoneBlock.blockColorLoad(event);
		}
	}
}
