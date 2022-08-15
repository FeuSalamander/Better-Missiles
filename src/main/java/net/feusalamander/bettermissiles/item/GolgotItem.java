
package net.feusalamander.bettermissiles.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.feusalamander.bettermissiles.itemgroup.BettermissilesItemGroup;
import net.feusalamander.bettermissiles.BettermissilesModElements;

import java.util.List;

@BettermissilesModElements.ModElement.Tag
public class GolgotItem extends BettermissilesModElements.ModElement {
	@ObjectHolder("bettermissiles:golgot")
	public static final Item block = null;

	public GolgotItem(BettermissilesModElements instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(BettermissilesItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("golgot");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("t4 missile"));
			list.add(new StringTextComponent("create a huge explosion"));
		}
	}
}
