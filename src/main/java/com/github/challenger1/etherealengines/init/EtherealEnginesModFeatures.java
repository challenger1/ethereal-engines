
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.challenger1.etherealengines.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import com.github.challenger1.etherealengines.world.features.plants.GrowingCrystalFeature;
import com.github.challenger1.etherealengines.world.features.ores.BlackestBlockFeature;
import com.github.challenger1.etherealengines.world.features.WizardsDungeonFeature;
import com.github.challenger1.etherealengines.EtherealEnginesMod;

@Mod.EventBusSubscriber
public class EtherealEnginesModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, EtherealEnginesMod.MODID);
	public static final RegistryObject<Feature<?>> GROWING_CRYSTAL = REGISTRY.register("growing_crystal", GrowingCrystalFeature::new);
	public static final RegistryObject<Feature<?>> BLACKEST_BLOCK = REGISTRY.register("blackest_block", BlackestBlockFeature::new);
	public static final RegistryObject<Feature<?>> WIZARDS_DUNGEON = REGISTRY.register("wizards_dungeon", WizardsDungeonFeature::new);
}
