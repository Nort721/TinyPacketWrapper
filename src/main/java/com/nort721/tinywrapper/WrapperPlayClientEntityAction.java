package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.EnumWrappers.PlayerAction;
import org.bukkit.World;
import org.bukkit.entity.Entity;

public class WrapperPlayClientEntityAction extends PacketWrapper {
	public static final PacketType TYPE = PacketType.Play.Client.ENTITY_ACTION;

	public WrapperPlayClientEntityAction(PacketEvent packetEvent) {
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
	 * Retrieve Action ID.
	 * <p>
	 * Notes: the ID of the action, see below.
	 * 
	 * @return The current Action ID
	 */
	public PlayerAction getAction() {
		return packetData.getPlayerActions().read(0);
	}

	/**
	 * Set Action ID.
	 * 
	 * @param value - new value.
	 */
	public void setAction(PlayerAction value) {
		packetData.getPlayerActions().write(0, value);
	}

	/**
	 * Retrieve Jump Boost.
	 * <p>
	 * Notes: horse jump boost. Ranged from 0 -> 100.
	 * 
	 * @return The current Jump Boost
	 */
	public int getJumpBoost() {
		return packetData.getIntegers().read(1);
	}

	/**
	 * Set Jump Boost.
	 * 
	 * @param value - new value.
	 */
	public void setJumpBoost(int value) {
		packetData.getIntegers().write(1, value);
	}

}
