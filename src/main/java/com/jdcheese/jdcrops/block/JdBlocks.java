package com.jdcheese.jdcrops.block;

import com.jdcheese.jdcrops.JdCrops;
import com.jdcheese.jdcrops.block.custom.*;
import com.jdcheese.jdcrops.worldgen.tree.JdTreeGrowers;
import net.minecraft.core.Registry;
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
            properties -> new MaloBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block BEAR_BERRY_BUSH = registerBlockWithoutBlockItem("bear_berry_bush",
            properties -> new BearBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block BLACK_BERRY_BUSH = registerBlockWithoutBlockItem("black_berry_bush",
            properties -> new BlackBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block BLACK_CURRANT_BUSH = registerBlockWithoutBlockItem("black_currant_bush",
            properties -> new BlackCurrantBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block BLACK_MUL_BERRY_BUSH = registerBlockWithoutBlockItem("black_mul_berry_bush",
            properties -> new BlackMulBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block BLUE_BERRY_BUSH = registerBlockWithoutBlockItem("blue_berry_bush",
            properties -> new BlueBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block BOYSEN_BERRY_BUSH = registerBlockWithoutBlockItem("boysen_berry_bush",
            properties -> new BoysenBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block BUFFALO_BERRY_BUSH = registerBlockWithoutBlockItem("buffalo_berry_bush",
            properties -> new BuffaloBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block CAPE_GOOSE_BERRY_BUSH = registerBlockWithoutBlockItem("cape_goose_berry_bush",
            properties -> new CapeGooseBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block CAPER_BERRY_BUSH = registerBlockWithoutBlockItem("caper_berry_bush",
            properties -> new CaperBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block CEDAR_BERRY_BUSH = registerBlockWithoutBlockItem("cedar_berry_bush",
            properties -> new CedarBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block CHOKE_BERRY_BUSH = registerBlockWithoutBlockItem("choke_berry_bush",
            properties -> new ChokeBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block CHOKE_CHERRY_BERRY_BUSH = registerBlockWithoutBlockItem("choke_cherry_berry_bush",
            properties -> new ChokeCherryBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block CLOUD_BERRY_BUSH = registerBlockWithoutBlockItem("cloud_berry_bush",
            properties -> new CloudBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block CRAN_BERRY_BUSH = registerBlockWithoutBlockItem("cran_berry_bush",
            properties -> new CranBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block DEW_BERRY_BUSH = registerBlockWithoutBlockItem("dew_berry_bush",
            properties -> new DewBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block ELDER_BERRY_BUSH = registerBlockWithoutBlockItem("elder_berry_bush",
            properties -> new ElderBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block GOJI_BERRY_BUSH = registerBlockWithoutBlockItem("goji_berry_bush",
            properties -> new GojiBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block GOOSE_BERRY_BUSH = registerBlockWithoutBlockItem("goose_berry_bush",
            properties -> new GooseBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block HONEY_BERRY_BUSH = registerBlockWithoutBlockItem("honey_berry_bush",
            properties -> new HoneyBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block HUCKLE_BERRY_BUSH = registerBlockWithoutBlockItem("huckle_berry_bush",
            properties -> new HuckleBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block JOSTA_BERRY_BUSH = registerBlockWithoutBlockItem("josta_berry_bush",
            properties -> new JostaBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block JUNE_BERRY_BUSH = registerBlockWithoutBlockItem("june_berry_bush",
            properties -> new JuneBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block JUNIPER_BERRY_BUSH = registerBlockWithoutBlockItem("juniper_berry_bush",
            properties -> new JuniperBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block KIWI_BERRY_BUSH = registerBlockWithoutBlockItem("kiwi_berry_bush",
            properties -> new KiwiBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block LINGON_BERRY_BUSH = registerBlockWithoutBlockItem("lingon_berry_bush",
            properties -> new LingonBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block LOGAN_BERRY_BUSH = registerBlockWithoutBlockItem("logan_berry_bush",
            properties -> new LoganBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block RASP_BERRY_BUSH = registerBlockWithoutBlockItem("rasp_berry_bush",
            properties -> new RaspBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block RED_CURRANT_BUSH = registerBlockWithoutBlockItem("red_currant_bush",
            properties -> new RedCurrantBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block RED_MUL_BERRY_BUSH = registerBlockWithoutBlockItem("red_mul_berry_bush",
            properties -> new RedMulBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block SALMON_BERRY_BUSH = registerBlockWithoutBlockItem("salmon_berry_bush",
            properties -> new SalmonBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block SEA_BUCKTHORN_BERRY_BUSH = registerBlockWithoutBlockItem("sea_buckthron_berry_bush",
            properties -> new SeaBuckthornBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block TAY_BERRY_BUSH = registerBlockWithoutBlockItem("tay_berry_bush",
            properties -> new TayBerryBushBlock(properties
                    .randomTicks()
                    .noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .pushReaction(PushReaction.POPPED)
            ));

    public static final Block WHITE_CURRANT_BUSH = registerBlockWithoutBlockItem("white_currant_bush",
            properties -> new WhiteCurrantBushBlock(properties
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

    public static final Block CHERRY_SAPLING = registerBlock("cherry_sapling",
            properties -> new SaplingBlock(JdTreeGrowers.CHERRY_TREE, properties.mapColor(MapColor.GRASS).noCollision()
                    .randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.POPPED)));

    public static final Block BLACK_CHERRY_SAPLING = registerBlock("black_cherry_sapling",
            properties -> new SaplingBlock(JdTreeGrowers.BLACK_CHERRY_TREE, properties.mapColor(MapColor.GRASS).noCollision()
                    .randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.POPPED)));

    public static final Block BANANA_SAPLING = registerBlock("banana_sapling",
            properties -> new SaplingBlock(JdTreeGrowers.BANANA_TREE, properties.mapColor(MapColor.GRASS).noCollision()
                    .randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.POPPED)));

    public static final Block POTTED_APPLE_SAPLING = registerBlockWithoutBlockItem("potted_apple_sapling",
            properties -> new FlowerPotBlock(APPLE_SAPLING, properties.mapColor(MapColor.GRASS).noOcclusion()
                    .instabreak().pushReaction(PushReaction.POPPED)));

    public static final Block POTTED_CHERRY_SAPLING = registerBlockWithoutBlockItem("potted_cherry_sapling",
            properties -> new FlowerPotBlock(CHERRY_SAPLING, properties.mapColor(MapColor.GRASS).noOcclusion()
                    .instabreak().pushReaction(PushReaction.POPPED)));

    public static final Block POTTED_BLACK_CHERRY_SAPLING = registerBlockWithoutBlockItem("potted_black_cherry_sapling",
            properties -> new FlowerPotBlock(BLACK_CHERRY_SAPLING, properties.mapColor(MapColor.GRASS).noOcclusion()
                    .instabreak().pushReaction(PushReaction.POPPED)));

    public static final Block POTTED_BANANA_SAPLING = registerBlockWithoutBlockItem("potted_banana_sapling",
            properties -> new FlowerPotBlock(BANANA_SAPLING, properties.mapColor(MapColor.GRASS).noOcclusion()
                    .instabreak().pushReaction(PushReaction.POPPED)));

    public static final Block APPLE_CROP = registerBlockWithoutBlockItem("apple_crop",
            properties -> new AppleCropBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noOcclusion().sound(SoundType.BIG_DRIPLEAF).pushReaction(PushReaction.PUSH_PULL)));

    public static final Block ACAI_CROP = registerBlockWithoutBlockItem("acai_crop",
            properties -> new AcaiCropBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noOcclusion().sound(SoundType.BIG_DRIPLEAF).pushReaction(PushReaction.PUSH_PULL)));

    public static final Block CHERRY_CROP = registerBlockWithoutBlockItem("cherry_crop",
            properties -> new CherryCropBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noOcclusion().sound(SoundType.BIG_DRIPLEAF).pushReaction(PushReaction.PUSH_PULL)));

    public static final Block BLACK_CHERRY_CROP = registerBlockWithoutBlockItem("black_cherry_crop",
            properties -> new BlackCherryCropBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noOcclusion().sound(SoundType.BIG_DRIPLEAF).pushReaction(PushReaction.PUSH_PULL)));

    public static final Block BANANA_CROP = registerBlockWithoutBlockItem("banana_crop",
            properties -> new BananaCropBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noOcclusion().sound(SoundType.BIG_DRIPLEAF).pushReaction(PushReaction.PUSH_PULL)));

    public static final Block FERMENTING_BLOCK = registerBlock("fermenting_block",
            properties -> new FermentingBlock(properties
                    .strength(0.5f).noOcclusion()));

    public static final Block PRESSING_BLOCK = registerBlock("pressing_block",
            properties -> new PressingBlock(properties
                    .strength(0.5f).noOcclusion()));

    public static final Block MILL_BLOCK = registerBlock("mill_block",
            properties -> new MillBlock(properties
                    .strength(0.5f).noOcclusion()));

    public static final Block DRYING_BLOCK = registerBlock("drying_block",
            properties -> new DryingBlock(properties
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
