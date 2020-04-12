package upgrade.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import upgrade.Upgrade;
import upgrade.command.CommandTeleportDimension;
import upgrade.entity.render.RenderCopperChest;
import upgrade.entity.tileentity.TileEntityCopperChest;
import upgrade.init.BiomeInit;
import upgrade.init.BlockInit;
import upgrade.init.DimensionInit;
import upgrade.init.EnchantmentInit;
import upgrade.init.EntityInit;
import upgrade.init.FluidInit;
import upgrade.init.ItemInit;
import upgrade.util.interfaces.IHasModel;
import upgrade.world.gen.WorldGenCustomOres;
import upgrade.world.gen.WorldGenCustomStructures;
import upgrade.world.types.WorldTypeCopper;
import upgrade.world.types.WorldTypeTryGen;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		Upgrade.proxy.registerItemRenderer(Item.getItemFromBlock(BlockInit.COPPER_CHEST), 0);
		
		for(Item item : ItemInit.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : BlockInit.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}
	
	public static void preInitRegistries()
	{
		FluidInit.registerFluids();

		RenderHandler.registerCustomMeshesAndStates();
	}
	
	public static void initRegistries()
	{
		//rimuovere le // quando si avranno dei suoni
		//SoundHandler.registerSounds();
		//NetworkRegistry.INSTANCE.registerGuiHandler(Upgrade.instance, new GUIHandler());
	}
	
	public static void postInitRegistries()
	{
		
	}
	
	public static void serverRegistries(FMLServerStartingEvent event)
	{
		
	}
}
