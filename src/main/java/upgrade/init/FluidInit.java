package upgrade.init;

import java.awt.Color;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import upgrade.fluids.FluidBase;

public class FluidInit 
{
	public static final Fluid MOLTEN_COPPER_FLUID = new FluidBase("molten_copper", new ResourceLocation("upgrade:blocks/animate/molten_copper_still"), new ResourceLocation("upgrade:blocks/animate/molten_copper_flow"), 2000, 2500, 5000, 20, false);
	
	public static final Fluid MAGIC_WATER_FLUID = new FluidBase("magic_water", new ResourceLocation("upgrade:blocks/animate/magic_water_still"), new ResourceLocation("upgrade:blocks/animate/magic_water_flow"), 0, 10, 0, 0, false).setColor(Color.PINK);
	
	public static void registerFluids()
	{
		registerFluid(MOLTEN_COPPER_FLUID);
		registerFluid(MAGIC_WATER_FLUID);
	}
	
	public static void registerFluid(Fluid fluid)
	{
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);
	}
}
