
package com.github.challenger1.etherealengines.fluid;

public abstract class EtheriumFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> EtherealEnginesModFluidTypes.ETHERIUM_TYPE.get(), () -> EtherealEnginesModFluids.ETHERIUM.get(),
			() -> EtherealEnginesModFluids.FLOWING_ETHERIUM.get()).explosionResistance(100f).tickRate(20).slopeFindDistance(2).bucket(() -> EtherealEnginesModItems.ETHERIUM_BUCKET.get())
			.block(() -> (LiquidBlock) EtherealEnginesModBlocks.ETHERIUM.get());

	private EtheriumFluid() {
		super(PROPERTIES);
	}

	public static class Source extends EtheriumFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends EtheriumFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
