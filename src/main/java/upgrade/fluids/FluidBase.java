package upgrade.fluids;

import java.awt.Color;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidBase extends Fluid
{

	public FluidBase(String fluidName, ResourceLocation still, ResourceLocation flowing, int temperature, int density, int viscosity, int luminosity, boolean isGaseous)
	{
		super(fluidName, still, flowing);
		setUnlocalizedName(fluidName);
		setTemperature(temperature);
		setDensity(density);
		setViscosity(viscosity);
		setLuminosity(luminosity);
		setGaseous(isGaseous);
	}

}
