
package net.feusalamander.bettermissiles.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.feusalamander.bettermissiles.item.OblivionItem;
import net.feusalamander.bettermissiles.BettermissilesModElements;

@BettermissilesModElements.ModElement.Tag
public class BettermissilesItemGroup extends BettermissilesModElements.ModElement {
	public BettermissilesItemGroup(BettermissilesModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabbettermissiles") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(OblivionItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
