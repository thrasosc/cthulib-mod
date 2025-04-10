package net.pixeldreamstudios.cthulib.forge;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ClientPlayerNetworkEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.pixeldreamstudios.cthulib.CthuLib;
import net.pixeldreamstudios.cthulib.util.client.PromoMessageHandler;

@Mod(CthuLib.MOD_ID)
@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class CthuLibForgeClient {
  @SubscribeEvent
  public static void onJoin(ClientPlayerNetworkEvent.LoggingIn event) {
    PromoMessageHandler.onJoinServer();
  }
}
