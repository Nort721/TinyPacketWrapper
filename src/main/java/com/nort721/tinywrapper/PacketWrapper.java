package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import com.google.common.base.Preconditions;
import com.nort721.godseye.utils.packet.Packets;
import lombok.Getter;
import org.bukkit.entity.Player;

import java.lang.reflect.InvocationTargetException;

@Getter
public abstract class PacketWrapper {
    protected PacketEvent packetEvent;
    protected PacketContainer packetData;

    /**
     * Constructs a new strongly typed wrapper for the given packet.
     *
     * @param packetEvent - the packet event.
     * @param type        - the packet type.
     */
    protected PacketWrapper(PacketEvent packetEvent, PacketType type) {
        Preconditions.checkNotNull(packetEvent, "Packet event cannot be NULL.");
        /* This is here because we are using the flying wrapper for types of Position and Look as well */
        if (!Packets.FLYING.contains(type) && !Packets.TRANSACTION_CLIENT.contains(type) && !Packets.TRANSACTION_SERVER.contains(type)) {
            Preconditions.checkArgument(packetEvent.getPacketType() == type, packetEvent.getPacketType() + " is not a packet of type " + type);
        }
        this.packetEvent = packetEvent;
        this.packetData = packetEvent.getPacket();
    }

    public PacketType getPacketType() {
        return packetEvent.getPacketType();
    }

    /**
     * Send this packet to the target
     *
     * @param target - the target
     * @throws RuntimeException If the packet cannot be sent.
     */
    public void sendPacket(Player target) {
        try {
            ProtocolLibrary.getProtocolManager().sendServerPacket(target, packetEvent.getPacket());
        } catch (InvocationTargetException e) {
            throw new RuntimeException("Cannot send packet.", e);
        }
    }

    /**
     * Send this packet to all online players.
     */
    public void broadcastPacket() {
        ProtocolLibrary.getProtocolManager().broadcastServerPacket(packetEvent.getPacket());
    }
}
