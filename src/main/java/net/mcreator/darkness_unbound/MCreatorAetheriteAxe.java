package net.mcreator.darkness_unbound;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

@Elementsdarkness_unbound.ModElement.Tag
public class MCreatorAetheriteAxe extends Elementsdarkness_unbound.ModElement {
	@ObjectHolder("darkness_unbound:aetheriteaxe")
	public static final Item block = null;

	public MCreatorAetheriteAxe(Elementsdarkness_unbound instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2000;
			}

			public float getEfficiency() {
				return 13f;
			}

			public float getAttackDamage() {
				return 9f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 28;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MCreatorAetheriteGem.block, (int) (1)));
			}
		}, 1, -3F, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("aetheriteaxe"));
	}
}
