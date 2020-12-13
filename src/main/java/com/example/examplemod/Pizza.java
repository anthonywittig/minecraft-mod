package com.example.examplemod;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;

public class Pizza extends SwordItem {

	public Pizza(Properties properties) {
		super(new Tier(), 1000, 1000, properties);
	}
}

class Tier implements IItemTier {

	@Override
	public int getMaxUses() {
		return 3;
	}

	@Override
	public float getEfficiency() {
		return 1000;
	}

	@Override
	public float getAttackDamage() {
		return 1000;
	}

	@Override
	public int getHarvestLevel() {
		return 1000;
	}

	@Override
	public int getEnchantability() {
		return 1000;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return null;
	}
}
