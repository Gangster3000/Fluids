package upgrade.objects.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockFluidEffectBase extends BlockFluidClassic
{
	private EnumParticleTypes particle;
	private int dur, ampli;
	private Potion effect;

	public BlockFluidEffectBase(String name, Fluid fluid, EnumParticleTypes particle, Potion potion_effect, int duration, int amplifier)
	{
		super(fluid, Material.WATER);
		this.particle = particle;
		this.ampli = amplifier;
		this.dur = duration * 20;
		this.effect = potion_effect;
	}
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state)
	{
		return EnumBlockRenderType.MODEL;
	}
	
	public void setParticle(EnumParticleTypes particle)
	{
		particle = this.particle;
	}
	
	@Override
	public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
	{
		worldIn.spawnParticle(particle, pos.getX(), pos.getY(), pos.getZ(), 1.2D, 1.2D, 1.2D, 0);
	}
	
	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
	{
		if(entityIn instanceof EntityPlayer)
		{
			((EntityPlayer) entityIn).addPotionEffect(new PotionEffect(effect, dur, ampli));
		}
	}
}
