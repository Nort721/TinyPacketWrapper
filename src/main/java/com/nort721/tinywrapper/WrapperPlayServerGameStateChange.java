package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayServerGameStateChange extends PacketWrapper {
    public static final PacketType TYPE = PacketType.Play.Server.GAME_STATE_CHANGE;

    public WrapperPlayServerGameStateChange(PacketEvent packetEvent) {
        super(packetEvent, TYPE);
    }

    /**
     * Retrieve Reason.
     *
     * @return The current Reason
     */
    public int getReason() {
        return packetData.getIntegers().read(0);
    }

    /**
     * Set Reason.
     *
     * @param value - new value.
     */
    public void setReason(int value) {
        packetData.getIntegers().write(0, value);
    }

    /**
     * Retrieve Value.
     * <p>
     * Notes: depends on reason
     *
     * @return The current Value
     */
    public float getValue() {
        return packetData.getFloat().read(0);
    }

    /**
     * Set Value.
     *
     * @param value - new value.
     */
    public void setValue(float value) {
        packetData.getFloat().write(0, value);
    }

}
