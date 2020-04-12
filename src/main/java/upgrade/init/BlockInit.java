package upgrade.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundEvent;
import upgrade.objects.blocks.Block3DCustomBase;
import upgrade.objects.blocks.BlockBase;
import upgrade.objects.blocks.BlockCopperChest;
import upgrade.objects.blocks.BlockDoorBase;
import upgrade.objects.blocks.BlockFluidBase;
import upgrade.objects.blocks.BlockFluidEffectBase;
import upgrade.objects.blocks.BlockOreBase;
import upgrade.objects.blocks.BlockRicePlant;
import upgrade.objects.blocks.BlockTeleport;
import upgrade.objects.blocks.machines.BlockGlowstoneGenerator;
import upgrade.objects.blocks.machines.sinterer.BlockElectricSinteringFurnace;
import upgrade.objects.blocks.machines.sinterer.BlockSinteringFurnace;
import upgrade.objects.blocks.trees.BlockCustomLeaves;
import upgrade.objects.blocks.trees.BlockCustomLogs;
import upgrade.objects.blocks.trees.BlockCustomPlanks;
import upgrade.objects.blocks.trees.BlockCustomSaplings;


public class BlockInit 
{
	
	public static IBlockState state;
	
	//setBlockUnbreakable when hardness = -1.0F
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block MOLTEN_COPPER_BLOCK = new BlockFluidBase("molten_copper", FluidInit.MOLTEN_COPPER_FLUID, Material.LAVA, Material.WATER, Blocks.DIAMOND_BLOCK.getDefaultState(), Blocks.EMERALD_BLOCK.getDefaultState(), SoundEvents.ITEM_BUCKET_EMPTY_LAVA, EnumParticleTypes.CLOUD, EnumParticleTypes.CRIT_MAGIC);
	
	public static final Block MAGIC_WATER_BLOCK = new BlockFluidEffectBase("magic_water", FluidInit.MAGIC_WATER_FLUID, EnumParticleTypes.DAMAGE_INDICATOR, MobEffects.GLOWING, 15, 1);
}
