
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bandbadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.bandbadditions.block.SoulberryPlantGrownBlock;
import net.mcreator.bandbadditions.block.SoulberryPlantBlock;
import net.mcreator.bandbadditions.BandbAdditionsMod;

public class BandbAdditionsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BandbAdditionsMod.MODID);
	public static final RegistryObject<Block> SOULBERRY_PLANT_GROWN = REGISTRY.register("soulberry_plant_grown", () -> new SoulberryPlantGrownBlock());
	public static final RegistryObject<Block> SOULBERRY_PLANT = REGISTRY.register("soulberry_plant", () -> new SoulberryPlantBlock());
}
