package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayClientLook extends PacketWrapper {
	public static final PacketType TYPE = PacketType.Play.Client.LOOK;

	public WrapperPlayClientLook(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	/**
	 * Retrieve Yaw.
	 * <p>
	 * Notes: absolute rotation on the X Axis, in degrees
	 * 
	 * @return The current Yaw
	 */
	public float getYaw() {
		return packetData.getFloat().read(0);
	}

	/**
	 * Set Yaw.
	 * 
	 * @param value - new value.
	 */
	public void setYaw(float value) {
		packetData.getFloat().write(0, value);
	}

	/**
	 * Retrieve Pitch.
	 * <p>
	 * Notes: absolute rotation on the Y Axis, in degrees
	 * 
	 * @return The current Pitch
	 */
	public float getPitch() {
		return packetData.getFloat().read(1);
	}

	/**
	 * Set Pitch.
	 * 
	 * @param value - new value.
	 */
	public void setPitch(float value) {
		packetData.getFloat().write(1, value);
	}

	/**
	 * Retrieve On Ground.
	 * <p>
	 * Notes: true if the client is on the ground, False otherwise
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
