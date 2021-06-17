package com.nort721.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.MinecraftKey;

public class WrapperPlayClientAdvancements extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.ADVANCEMENTS;
    
    public WrapperPlayClientAdvancements(PacketEvent packetEvent) {
        super(packetEvent, TYPE);
    }
    
    /**
     * Retrieve Action.
     * <p>
     * Notes: 0: Opened tab, 1: Closed screen
     * @return The current Action
     */
    public Status getAction() {
        return handle.getEnumModifier(Status.class, 0).readSafely(0);
    }
    
    /**
     * Set Action.
     * @param value - new value.
     */
    public void setAction(Status value) {
        handle.getEnumModifier(Status.class, 0).writeSafely(0, value);
    }
    /**
     * Retrieve Tab ID.
     * <p>
     * Notes: only present if action is Opened tab
     * @return The current Tab ID
     */
    public MinecraftKey getTabId() {
        return handle.getMinecraftKeys().readSafely(0);
    }
    
    /**
     * Set Tab ID.
     * @param value - new value.
     */
    public void setTabId(MinecraftKey value) {
        handle.getMinecraftKeys().writeSafely(0, value);
    }

    public enum Status {
        OPENED_TAB,
        CLOSED_SCREEN;
    }
}
