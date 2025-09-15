package me.yic.xconomy.adapter.comp;


import me.yic.xconomy.adapter.iPlugin;
import me.yic.xconomy.data.syncdata.PlayerData;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.UUID;

@SuppressWarnings("unused")
public class CPlugin implements iPlugin {
    public CPlugin() {
        throw new UnsupportedOperationException("stub");
    }
    @Override
    public CPlayer getplayer(PlayerData pd) {
        throw new UnsupportedOperationException("stub");
    }

    @Override
    public boolean getOnlinePlayersisEmpty() {
        throw new UnsupportedOperationException("stub");
    }

    @Override
    public int getOnlinePlayerSize(){
        throw new UnsupportedOperationException("stub");
    }

    @Override
    public List<UUID> getOnlinePlayersUUIDs() {
        throw new UnsupportedOperationException("stub");
    }

    @Override
    public void broadcastMessage(String message) {
        throw new UnsupportedOperationException("stub");
    }
    @Override
    public UUID NameToUUID(String name) {
        throw new UnsupportedOperationException("stub");
    }
    @Override
    public boolean isSync() {
        throw new UnsupportedOperationException("stub");
    }
    @Override
    public void runTaskAsynchronously(Runnable ra) {
        throw new UnsupportedOperationException("stub");
    }

    @Override
    public void runTaskLaterAsynchronously(Runnable ra, long time) {
        throw new UnsupportedOperationException("stub");
    }

    @Override
    public void sendPluginMessage(String channel, ByteArrayOutputStream stream) {
        throw new UnsupportedOperationException("stub");
    }

    @Override
    public void registerIncomingPluginChannel(String channel, String classname) {
        throw new UnsupportedOperationException("stub");
    }

    @Override
    public void registerOutgoingPluginChannel(String channel) {
        throw new UnsupportedOperationException("stub");
    }

    @Override
    public void unregisterIncomingPluginChannel(String channel, String classname) {
        throw new UnsupportedOperationException("stub");
    }

    @Override
    public void unregisterOutgoingPluginChannel(String channel) {
        throw new UnsupportedOperationException("stub");
    }
}
