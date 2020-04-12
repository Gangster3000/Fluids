package upgrade.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import scala.Int;
import upgrade.objects.items.ItemBase;
import upgrade.objects.items.ItemOreBase;
import upgrade.objects.items.armour.ArmorBase;
import upgrade.objects.items.armour.ArmorCustomBase;
import upgrade.objects.items.food.ItemCustomFood;
import upgrade.objects.items.food.ItemRice;
import upgrade.objects.items.tools.AxeBase;
import upgrade.objects.items.tools.HoeBase;
import upgrade.objects.items.tools.PickaxeBase;
import upgrade.objects.items.tools.ShovelBase;
import upgrade.objects.items.tools.SimilPickaxe;
import upgrade.objects.items.tools.StaffFire;
import upgrade.objects.items.tools.SwordBase;
import upgrade.util.Reference;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();


}
