package fr.redboxing.headless;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class HeadlessFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("Running HeadlessFabric v" + FabricLoader.getInstance().getModContainer("headless-fabric").get().getMetadata().getVersion() + " by RedBoxing");
    }
}
