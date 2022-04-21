package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.WrappedDataWatcher;
import com.nort721.godseye.utils.server.ServerVersion;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.util.Vector;

import java.util.UUID;

public class WrapperPlayServerNamedEntitySpawn extends PacketWrapper {
    public static final PacketType TYPE =
            PacketType.Play.Server.NAMED_ENTITY_SPAWN;

    public WrapperPlayServerNamedEntitySpawn(PacketEvent packetEvent) {
        super(packetEvent, TYPE);
    }

    /**
     * Retrieve Entity ID.
     * <p>
     * Notes: entity's ID
     *
     * @return The current Entity ID
     */
    public int getEntityID() {
        return packetData.getIntegers().read(0);
    }

    /**
     * Set Entity ID.
     *
     * @param value - new value.
     */
    public void setEntityID(int value) {
        packetData.getIntegers().write(0, value);
    }

    /**
     * Retrieve the entity of the painting that will be spawned.
     *
     * @param world - the current world of the entity.
     * @return The spawned entity.
     */
    public Entity getEntity(World world) {
        return packetData.getEntityModifier(world).read(0);
    }

    /**
     * Retrieve the entity of the painting that will be spawned.
     *
     * @param event - the packet event.
     * @return The spawned entity.
     */
    public Entity getEntity(PacketEvent event) {
        return getEntity(event.getPlayer().getWorld());
    }

    /**
     * Retrieve Player UUID.
     * <p>
     * Notes: player's UUID
     *
     * @return The current Player UUID
     */
    public UUID getPlayerUUID() {
        return packetData.getUUIDs().read(0);
    }

    /**
     * Set Player UUID.
     *
     * @param value - new value.
     */
    public void setPlayerUUID(UUID value) {
        packetData.getUUIDs().write(0, value);
    }

    /**
     * Retrieve the position of the spawned entity as a vector.
     *
     * @return The position as a vector.
     */
    public Vector getPosition() {
        return new Vector(getX(), getY(), getZ());
    }

    /**
     * Set the position of the spawned entity using a vector.
     *
     * @param position - the new position.
     */
    public void setPosition(Vector position) {
        setX(position.getX());
        setY(position.getY());
        setZ(position.getZ());
    }

    public double getX() {
        return ServerVersion.getServerVersion().isAbove(ServerVersion.V1_8_8) ? packetData.getDoubles().read(0) : ((double) packetData.getIntegers().read(0));
    }

    public void setX(double value) {
        packetData.getDoubles().write(0, value);
    }

    public double getY() {
        return ServerVersion.getServerVersion().isAbove(ServerVersion.V1_8_8) ? packetData.getDoubles().read(1) : ((double) packetData.getIntegers().read(1));
    }

    public void setY(double value) {
        packetData.getDoubles().write(1, value);
    }

    public double getZ() {
        return ServerVersion.getServerVersion().isAbove(ServerVersion.V1_8_8) ? packetData.getDoubles().read(2) : ((double) packetData.getIntegers().read(2));
    }

    public void setZ(double value) {
        packetData.getDoubles().write(2, value);
    }

    /**
     * Retrieve the yaw of the spawned entity.
     *
     * @return The current Yaw
     */
    public float getYaw() {
        return (packetData.getBytes().read(0) * 360.F) / 256.0F;
    }

    /**
     * Set the yaw of the spawned entity.
     *
     * @param value - new yaw.
     */
    public void setYaw(float value) {
        packetData.getBytes().write(0, (byte) (value * 256.0F / 360.0F));
    }

    /**
     * Retrieve the pitch of the spawned entity.
     *
     * @return The current pitch
     */
    public float getPitch() {
        return (packetData.getBytes().read(1) * 360.F) / 256.0F;
    }

    /**
     * Set the pitch of the spawned entity.
     *
     * @param value - new pitch.
     */
    public void setPitch(float value) {
        packetData.getBytes().write(1, (byte) (value * 256.0F / 360.0F));
    }

    /**
     * Retrieve Metadata.
     * <p>
     * Notes: the client will crash if no metadata is sent
     *
     * @return The current Metadata
     */
    public WrappedDataWatcher getMetadata() {
        return packetData.getDataWatcherModifier().read(0);
    }

    /**
     * Set Metadata.
     *
     * @param value - new value.
     */
    public void setMetadata(WrappedDataWatcher value) {
        packetData.getDataWatcherModifier().write(0, value);
    }

}
