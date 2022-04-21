package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.World;
import org.bukkit.entity.Entity;

public class WrapperPlayServerRelEntityMoveLook extends PacketWrapper {
	public static final PacketType TYPE =
			PacketType.Play.Server.REL_ENTITY_MOVE_LOOK;

	public WrapperPlayServerRelEntityMoveLook(PacketEvent packetEvent) {
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
	 * Retrieve DX.
	 * 
	 * @return The current DX
	 */
	public double getDx() {
		return packetData.getShorts().read(0) / 4096D;
	}

	/**
	 * Set DX.
	 *
	 * @param value - new value.
	 */
	public void setDx(double value) {
		packetData.getShorts().write(0, (short) (value * 4096));
	}

	/**
	 * Retrieve DY.
	 *
	 * @return The current DY
	 */
	public double getDy() {
		return packetData.getShorts().read(1) / 4096D;
	}

	/**
	 * Set DY.
	 *
	 * @param value - new value.
	 */
	public void setDy(double value) {
		packetData.getShorts().write(1, (short) (value * 4096));
	}

	/**
	 * Retrieve DZ.
	 *
	 * @return The current DZ
	 */
	public double getDz() {
		return packetData.getShorts().read(2) / 4096D;
	}

	/**
	 * Set DZ.
	 *
	 * @param value - new value.
	 */
	public void setDz(double value) {
		packetData.getShorts().write(2, (short) (value * 4096));
	}

	/**
	 * Retrieve the yaw of the current entity.
	 * 
	 * @return The current Yaw
	 */
	public float getYaw() {
		return (packetData.getBytes().read(0) * 360.F) / 256.0F;
	}

	/**
	 * Set the yaw of the current entity.
	 * 
	 * @param value - new yaw.
	 */
	public void setYaw(float value) {
		packetData.getBytes().write(0, (byte) (value * 256.0F / 360.0F));
	}

	/**
	 * Retrieve the pitch of the current entity.
	 * 
	 * @return The current pitch
	 */
	public float getPitch() {
		return (packetData.getBytes().read(1) * 360.F) / 256.0F;
	}

	/**
	 * Set the pitch of the current entity.
	 * 
	 * @param value - new pitch.
	 */
	public void setPitch(float value) {
		packetData.getBytes().write(1, (byte) (value * 256.0F / 360.0F));
	}

	/**
	 * Retrieve On Ground.
	 * 
	 * @return The current On Ground
	 */
	public boolean getOnGround() {
		return packetData.getBooleans().read(0);
	}

	/**
	 * Set On Ground.
	 * 
	 * @param value - new value.
	 */
	public void setOnGround(boolean value) {
		packetData.getBooleans().write(0, value);
	}
}
