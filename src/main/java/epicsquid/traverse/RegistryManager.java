package epicsquid.traverse;

import epicsquid.traverse.Traverse;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Traverse.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryManager {

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {

	}
}