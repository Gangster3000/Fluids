package upgrade.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import upgrade.entity.EntityPSkeleton;
import upgrade.entity.render.RenderPSkeleton;
import upgrade.init.BlockInit;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		/*RenderingRegistry.registerEntityRenderingHandler(EntityPSkeleton.class, new IRenderFactory<EntityPSkeleton>() 
		{
			@Override
			public Render<? super EntityPSkeleton> createRenderFor(RenderManager manager) 
			{
				return new RenderPSkeleton(manager);
			}
		});*/
	}
	
	public static void registerCustomMeshesAndStates()
	{
		registerFluid(BlockInit.MOLTEN_COPPER_BLOCK, "upgrade:molten_copper");
		registerFluid(BlockInit.MAGIC_WATER_BLOCK, "upgrade:magic_water");
	}
	
	public static void registerFluid(Block block, String location)
	{
		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(block), new ItemMeshDefinition()
		{
			
			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack)
			{
				return new ModelResourceLocation(location, "fluid");
			}
		});
		ModelLoader.setCustomStateMapper(block, new StateMapperBase()
		{
			
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation(location, "fluid");
			}
		});
	}
}
