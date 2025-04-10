package net.pixeldreamstudios.cthulib.util.client;

import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.network.chat.ClickEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;

public class PromoMessageHandler {
  private static final String TARGET_SERVER = "playcdu.co";
  private static final Component PART_1 = Component.literal("Use code ");
  private static final Component PART_2 =
      Component.literal("PixelDream").withStyle(Style.EMPTY.withColor(ChatFormatting.LIGHT_PURPLE));
  private static final Component PART_3 =
      Component.literal(" (case-sensitive) for 30% off on the ");
  private static final Component PART_4 =
      Component.literal("CDU Store")
          .withStyle(
              Style.EMPTY
                  .withClickEvent(
                      new ClickEvent(ClickEvent.Action.OPEN_URL, "https://store.playcdu.co"))
                  .withUnderlined(true));
  private static final Component PART_5 = Component.literal("!");
  private static final Component promoMessage =
      PART_1.copy().append(PART_2).append(PART_3).append(PART_4).append(PART_5);

  public static void onJoinServer() {
    Minecraft mc = Minecraft.getInstance();
    ServerData server = mc.getCurrentServer();

    if (server != null && server.ip.toLowerCase().contains(TARGET_SERVER)) {
      mc.player.sendSystemMessage(promoMessage);
    }
  }
}
