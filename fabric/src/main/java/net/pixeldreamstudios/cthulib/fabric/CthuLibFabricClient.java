package net.pixeldreamstudios.cthulib.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.pixeldreamstudios.cthulib.util.client.HourlyMessageHandler;

public final class CthuLibFabricClient implements ClientModInitializer {
  @Override
  public void onInitializeClient() {
    ClientTickEvents.END_CLIENT_TICK.register(
        client -> {
          HourlyMessageHandler.onClientTick();
        });
  }
}
