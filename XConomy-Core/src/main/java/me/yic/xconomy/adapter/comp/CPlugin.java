package me.yic.xconomy.adapter.comp;


import me.yic.xconomy.adapter.iPlugin;

import java.io.ByteArrayOutputStream;

@SuppressWarnings("unused")
public class CPlugin implements iPlugin {
    public CPlugin() {
        throw new UnsupportedOperationException("stub");
    }

    @Override
    public boolean getOnlinePlayersisEmpty() {
        throw new UnsupportedOperationException("stub");
    }

    @Override
    public void broadcastMessage(String message) {
        throw new UnsupportedOperationException("stub");
    }

    @Override
    public void runTaskAsynchronously(Runnable runnable) {
        throw new UnsupportedOperationException("stub");
    }

    @Override
    public void sendPluginMessage(String channel, ByteArrayOutputStream stream) {
        throw new UnsupportedOperationException("stub");
    }
}
