package net.mcreator.darkness_unbound;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@Elementsdarkness_unbound.ModElement.Tag
public class MCreatorAetheritePickaxe extends Elementsdarkness_unbound.ModElement {
	@ObjectHolder("darkness_unbound:aetheritepickaxe")
	public static final Item block = null;

	public MCreatorAetheritePickaxe(Elementsdarkness_unbound instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2000;
			}

			public float getEfficiency() {
				return 13f;
			}

			public float getAttackDamage() {
				return 5f;
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
		}.setRegistryName("aetheritepickaxe"));
	}
}
