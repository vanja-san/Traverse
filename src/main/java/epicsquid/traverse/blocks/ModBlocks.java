package epicsquid.traverse.blocks;

import epicsquid.mysticallib.block.BaseSaplingBlock;
import epicsquid.mysticallib.world.BaseTree;
import epicsquid.traverse.RegistryManager;
import epicsquid.traverse.Traverse;
import epicsquid.traverse.biome.TraverseDefaultBiomeFeatures;
import net.minecraft.block.Block;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.LogBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class ModBlocks {

  private static final Block.Properties LEAVES_PROPS = Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT);

  public static final Block RED_AUTUMNAL_LEAVES = createLeaves("red_autumnal_leaves");
  public static final Block BROWN_AUTUMNAL_LEAVES = createLeaves("brown_autumnal_leaves");
  public static final Block ORANGE_AUTUMNAL_LEAVES = createLeaves("orange_autumnal_leaves");
  public static final Block YELLOW_AUTUMNAL_LEAVES = createLeaves("yellow_autumnal_leaves");

  public static final Block FIR_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(Traverse.MODID, "fir_log");
  public static final Block FIR_LEAVES = createLeaves("fir_leaves");
  public static final Block FIR_SAPLING = new BaseSaplingBlock(new BaseTree(TraverseDefaultBiomeFeatures.FIR_TREE_CONFIG), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(Traverse.MODID, "fir_sapling");

  private static Block createLeaves(String name) {
    return new LeavesBlock(LEAVES_PROPS).setRegistryName(Traverse.MODID, name);
  }
}
