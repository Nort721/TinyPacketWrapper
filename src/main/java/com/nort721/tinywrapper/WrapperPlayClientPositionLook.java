package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayClientPositionLook extends PacketWrapper {
	public static final PacketType TYPE = PacketType.Play.Client.POSITION_LOOK;

	public WrapperPlayClientPositionLook(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	/**
	 * Retrieve X.
	 * <p>
	 * Notes: absolute position
	 * 
	 * @return The current X
	 */
	public double getX() {
		return packetData.getDoubles().read(0);
	}

	/**
	 * Set X.
	 * 
	 * @param value - new value.
	 */
	public void setX(double value) {
		packetData.getDoubles().write(0, value);
	}

	/**
	 * Retrieve Feet Y.
	 * <p>
	 * Notes: absolute feet position. Is normally HeadY - 1.62. Used to modify
	 * the players bounding box when going up stairs, crouching, etc…
	 * 
	 * @return The current FeetY
	 */
	public double getY() {
		return packetData.getDoubles().read(1);
	}

	/**
	 * Set Feet Y.
	 * 
	 * @param value - new value.
	 */
	public void setY(double value) {
		packetData.getDoubles().write(1, value);
	}

	/**
	 * Retrieve Z.
	 * <p>
	 * Notes: absolute position
	 * 
	 * @return The current Z
	 */
	public double getZ() {
		return packetData.getDoubles().read(2);
	}

	/**
	 * Set Z.
	 * 
	 * @param value - new value.
	 */
	public void setZ(double value) {
		packetData.getDoubles().write(2, value);
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
