
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bandbadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.bandbadditions.BandbAdditionsMod;

public class BandbAdditionsModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, BandbAdditionsMod.MODID);
	public static final RegistryObject<PaintingVariant> BOMB_PAINTING = REGISTRY.register("bomb_painting", () -> new PaintingVariant(32, 32));
}
