package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.WrappedWatchableObject;
import org.bukkit.World;
import org.bukkit.entity.Entity;

import java.util.List;

public class WrapperPlayServerEntityMetadata extends PacketWrapper {
	public static final PacketType TYPE =
			PacketType.Play.Server.ENTITY_METADATA;

	public WrapperPlayServerEntityMetadata(PacketEvent packetEvent) {
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
	 * Retrieve Metadata.
	 * 
	 * @return The current Metadata
	 */
	public List<WrappedWatchableObject> getMetadata() {
		return packetData.getWatchableCollectionModifier().read(0);
	}

	/**
	 * Set Metadata.
	 * 
	 * @param value - new value.
	 */
	public void setMetadata(List<WrappedWatchableObject> value) {
		packetData.getWatchableCollectionModifier().write(0, value);
	}
}
