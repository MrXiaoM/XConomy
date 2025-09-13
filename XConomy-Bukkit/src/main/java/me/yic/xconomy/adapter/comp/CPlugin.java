package me.yic.xconomy.adapter.comp;


import com.google.common.collect.Iterables;
import me.yic.xconomy.XConomy;
import me.yic.xconomy.adapter.iPlugin;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.io.ByteArrayOutputStream;

@SuppressWarnings("unused")
public class CPlugin implements iPlugin {
    @Override
    public boolean getOnlinePlayersisEmpty() {
        return Bukkit.getOnlinePlayers().isEmpty();
    }

    @Override
    public void broadcastMessage(String message) {
        Bukkit.broadcastMessage(message);
    }


    @Override
    public void runTaskAsynchronously(Runnable runnable) {
        Bukkit.getScheduler().runTaskAsynchronously(XConomy.getInstance(), runnable);
    }

    @Override
    public void sendPluginMessage(String channel, ByteArrayOutputStream stream) {
        Player p = Iterables.getFirst(Bukkit.getOnlinePlayers(), null);
        if (p != null) {
            p.sendPluginMessage(XConomy.getInstance(), channel, stream.toByteArray());
            //System.out.println("已发送通信包 " + channel);
        }
    }
}
