package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import com.nort721.godseye.utils.server.ServerVersion;

public class WrapperPlayServerKeepAlive extends PacketWrapper {
    public static final PacketType TYPE = PacketType.Play.Server.KEEP_ALIVE;

    public WrapperPlayServerKeepAlive(PacketEvent packetEvent) {
        super(packetEvent, TYPE);
    }

    /**
     * Retrieve Keep Alive ID.
     *
     * @return The current Keep Alive ID
     */
    public long getKeepAliveId() {
        return ServerVersion.getServerVersion().isOrAbove(ServerVersion.V1_12) ? packetData.getLongs().read(0) : (long) packetData.getIntegers().read(0);
    }

    /**
     * Set Keep Alive ID.
     *
     * @param value - new value.
     */
    public void setKeepAliveId(long value) {
        packetData.getLongs().write(0, value);
    }

}
