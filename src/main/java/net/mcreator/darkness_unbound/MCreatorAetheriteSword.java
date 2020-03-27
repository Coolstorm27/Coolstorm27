package net.mcreator.darkness_unbound;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@Elementsdarkness_unbound.ModElement.Tag
public class MCreatorAetheriteSword extends Elementsdarkness_unbound.ModElement {
	@ObjectHolder("darkness_unbound:aetheritesword")
	public static final Item block = null;

	public MCreatorAetheriteSword(Elementsdarkness_unbound instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2000;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 5f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 28;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MCreatorAetheriteGem.block, (int) (1)));
			}
		}, 3, -2.4000000000000001F, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("aetheritesword"));
	}
}
