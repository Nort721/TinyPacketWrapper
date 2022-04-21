package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayClientSteerVehicle extends PacketWrapper {
	public static final PacketType TYPE = PacketType.Play.Client.STEER_VEHICLE;

	public WrapperPlayClientSteerVehicle(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	/**
	 * Retrieve Sideways.
	 * <p>
	 * Notes: positive to the left of the player
	 * 
	 * @return The current Sideways
	 */
	public float getSideways() {
		return packetData.getFloat().read(0);
	}

	/**
	 * Set Sideways.
	 * 
	 * @param value - new value.
	 */
	public void setSideways(float value) {
		packetData.getFloat().write(0, value);
	}

	/**
	 * Retrieve Forward.
	 * <p>
	 * Notes: positive forward
	 * 
	 * @return The current Forward
	 */
	public float getForward() {
		return packetData.getFloat().read(1);
	}

	/**
	 * Set Forward.
	 * 
	 * @param value - new value.
	 */
	public void setForward(float value) {
		packetData.getFloat().write(1, value);
	}

	public boolean isJump() {
		return packetData.getBooleans().read(0);
	}

	public void setJump(boolean value) {
		packetData.getBooleans().write(0, value);
	}

	public boolean isUnmount() {
		return packetData.getBooleans().read(1);
	}

	public void setUnmount(boolean value) {
		packetData.getBooleans().write(1, value);
	}

}
