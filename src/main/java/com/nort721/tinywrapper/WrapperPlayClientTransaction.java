package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayClientTransaction extends PacketWrapper {
    public static final PacketType TYPE = PacketType.Play.Client.TRANSACTION;

    public WrapperPlayClientTransaction(PacketEvent packetEvent) {
        super(packetEvent, TYPE);
    }

    /**
     * Retrieve Window ID.
     * <p>
     * Notes: the id of the window that the action occurred in.
     *
     * @return The current Window ID
     */
    public int getWindowId() {
        return packetData.getIntegers().read(0);
    }

    /**
     * Set Window ID.
     *
     * @param value - new value.
     */
    public void setWindowId(byte value) {
        packetData.getIntegers().write(0, (int) value);
    }

    /**
     * Retrieve Action number.
     * <p>
     * Notes: every action that is to be accepted has a unique number. This
     * field corresponds to that number.
     *
     * @return The current Action number
     */
    public int getUID() {
        return packetData.getType() == PacketType.Play.Client.PONG ? packetData.getIntegers().read(0) : packetData.getShorts().read(0);
    }

    /**
     * Set Action number.
     *
     * @param value - new value.
     */
    public void setUID(short value) {
        packetData.getShorts().write(0, value);
    }

    /**
     * Retrieve Accepted.
     * <p>
     * Notes: whether the action was accepted.
     *
     * @return The current Accepted
     */
    public boolean getAccepted() {
        return packetData.getBooleans().read(0);
    }

    /**
     * Set Accepted.
     *
     * @param value - new value.
     */
    public void setAccepted(boolean value) {
        packetData.getBooleans().write(0, value);
    }

}
