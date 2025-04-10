package net.pixeldreamstudios.cthulib.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.pixeldreamstudios.cthulib.util.client.PromoMessageHandler;

public final class CthuLibFabricClient implements ClientModInitializer {
  @Override
  public void onInitializeClient() {
    ClientPlayConnectionEvents.JOIN.register(
        (handler, sender, client) -> {
          client.execute(() -> PromoMessageHandler.onJoinServer());
        });
  }
}
