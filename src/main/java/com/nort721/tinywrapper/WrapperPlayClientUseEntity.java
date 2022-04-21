package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.EnumWrappers.EntityUseAction;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.util.Vector;

public class WrapperPlayClientUseEntity extends PacketWrapper {
	public static final PacketType TYPE = PacketType.Play.Client.USE_ENTITY;

	public WrapperPlayClientUseEntity(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	/**
	 * Retrieve entity ID of the target.
	 * 
	 * @return The current entity ID
	 */
	public int getTargetID() {
		return packetData.getIntegers().read(0);
	}

	/**
	 * Retrieve the entity that was targeted.
	 * 
	 * @param world - the current world of the entity.
	 * @return The targeted entity.
	 */
	public Entity getTarget(World world) {
		return packetData.getEntityModifier(world).read(0);
	}

	/**
	 * Retrieve the entity that was targeted.
	 * 
	 * @param event - the packet event.
	 * @return The targeted entity.
	 */
	public Entity getTarget(PacketEvent event) {
		return getTarget(event.getPlayer().getWorld());
	}

	/**
	 * Set entity ID of the target.
	 * 
	 * @param value - new value.
	 */
	public void setTargetID(int value) {
		packetData.getIntegers().write(0, value);
	}

	/**
	 * Retrieve Type.
	 * 
	 * @return The current Type
	 */
	public EntityUseAction getType() {
		return packetData.getEntityUseActions().read(0);
	}

	/**
	 * Set Type.
	 * 
	 * @param value - new value.
	 */
	public void setType(EntityUseAction value) {
		packetData.getEntityUseActions().write(0, value);
	}

	/**
	 * Retrieve the target vector.
	 * <p>
	 * Notes: Only if {@link #getType()} is {@link EntityUseAction#INTERACT_AT}.
	 * 
	 * @return The target vector or null
	 */
	public Vector getTargetVector() {
		return packetData.getVectors().read(0);
	}

	/**
	 * Set the target vector.
	 * 
	 * @param value - new value.
	 */
	public void setTargetVector(Vector value) {
		packetData.getVectors().write(0, value);
	}
}
