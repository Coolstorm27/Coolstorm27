package net.mcreator.darkness_unbound;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

@Elementsdarkness_unbound.ModElement.Tag
public class MCreatorAetheriteHoe extends Elementsdarkness_unbound.ModElement {
	@ObjectHolder("darkness_unbound:aetheritehoe")
	public static final Item block = null;

	public MCreatorAetheriteHoe(Elementsdarkness_unbound instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 2000;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 28;
			}

			public Ingredient getRepairMaterial() {
				return null;
			}
		}, 9f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("aetheritehoe"));
	}
}
