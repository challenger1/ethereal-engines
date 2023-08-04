
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package com.github.challenger1.etherealengines.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import com.github.challenger1.etherealengines.fluid.types.EtheriumFluidType;
import com.github.challenger1.etherealengines.EtherealEnginesMod;

public class EtherealEnginesModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, EtherealEnginesMod.MODID);
	public static final RegistryObject<FluidType> ETHERIUM_TYPE = REGISTRY.register("etherium", () -> new EtheriumFluidType());
}
