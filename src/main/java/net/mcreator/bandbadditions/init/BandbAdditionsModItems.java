
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bandbadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.bandbadditions.item.BombItem;
import net.mcreator.bandbadditions.BandbAdditionsMod;

public class BandbAdditionsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BandbAdditionsMod.MODID);
	public static final RegistryObject<Item> BOMB = REGISTRY.register("bomb", () -> new BombItem());
}
