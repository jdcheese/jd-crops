package com.jdcheese.jdcrops.block;

import com.jdcheese.jdcrops.JdCrops;
import com.jdcheese.jdcrops.block.custom.*;
import com.jdcheese.jdcrops.particles.JdParticles;
import com.jdcheese.jdcrops.worldgen.tree.JdTreeGrowers;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.sounds.AmbientLeavesBlockSoundPlayer;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Function;

import static com.jdcheese.jdcrops.particles.JdParticles.ORCHID_LEAVES_PARTICLE;

public class JdBlocks {

    public static final Block HEART_BERRY_BUSH = registerBlockWithoutBlockItem("heart_berry_bush",
            properties -> new HeartBerryBushBlock(properties
                    .mapColor(MapColor.COLOR_GREEN)
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block MALO_BERRY_BUSH = registerBlockWithoutBlockItem("malo_berry_bush",
            properties -> new MaloberryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block STRAWBERRY_CROP = registerBlockWithoutBlockItem("strawberry_crop",
            properties -> new StrawberryCropBlock(properties
                    .randomTicks()
                    .instabreak()
                    .sound(SoundType.CROP)
                    .noCollision()
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block RICE_CROP = registerBlockWithoutBlockItem("rice_crop",
            properties -> new RiceCropBlock(properties
                    .noCollision()
                    .randomTicks()
                    .instabreak()
                    .sound(SoundType.CROP)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block ORCHID_LEAVES = registerBlock("orchid_leaves",
            properties -> new UntintedParticleLeavesBlock(0.01f, ORCHID_LEAVES_PARTICLE, AmbientLeavesBlockSoundPlayer.noAmbientSound(),
                    properties.mapColor(MapColor.PLANT).strength(0.2F).randomTicks().sound(SoundType.AZALEA_LEAVES)
                            .noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(Blocks::never)
                            .ignitedByLava().pushReaction(PushReaction.POPPED).isRedstoneConductor(Blocks::never)));

    public static final Block APPLE_SAPLING = registerBlock("apple_sapling",
            properties -> new SaplingBlock(JdTreeGrowers.APPLE_TREE, properties.mapColor(MapColor.GRASS).noCollision()
                    .randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.POPPED)));

    public static final Block POTTED_APPLE_SAPLING = registerBlockWithoutBlockItem("potted_apple_sapling",
            properties -> new FlowerPotBlock(APPLE_SAPLING, properties.mapColor(MapColor.GRASS).noOcclusion()
                    .instabreak().pushReaction(PushReaction.POPPED)));

    public static final Block APPLE_CROP = registerBlockWithoutBlockItem("apple_crop",
            properties -> new AppleCropBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noOcclusion().sound(SoundType.BIG_DRIPLEAF).pushReaction(PushReaction.PUSH_PULL)));

    public static final Block FERMENTING_BLOCK = registerBlock("fermenting_block",
            properties -> new FermentingBlock(properties
                    .strength(0.5f).noOcclusion()));

    public static final Block PRESSING_BLOCK = registerBlock("pressing_block",
            properties -> new PressingBlock(properties
                    .strength(0.5f).noOcclusion()));


    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }

    private static Block registerBlockWithoutBlockItem(String name, Function<BlockBehaviour.Properties, Block> function) {
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, name), function.apply(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, name)))));
    }

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, name)))));
    }

    public static void registerJdBlocks() {
        JdCrops.LOGGER.info("Registering Mod Blocks for " + JdCrops.MOD_ID);
    }
}
