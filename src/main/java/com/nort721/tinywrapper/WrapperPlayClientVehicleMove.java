package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayClientVehicleMove extends PacketWrapper {

	public static final PacketType TYPE = PacketType.Play.Client.VEHICLE_MOVE;

	public WrapperPlayClientVehicleMove(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	/**
	 * Retrieve X.
	 * <p>
	 * Notes: absolute position (X coordinate)
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
	 * Retrieve Y.
	 * <p>
	 * Notes: absolute position (Y coordinate)
	 * 
	 * @return The current Y
	 */
	public double getY() {
		return packetData.getDoubles().read(1);
	}

	/**
	 * Set Y.
	 * 
	 * @param value - new value.
	 */
	public void setY(double value) {
		packetData.getDoubles().write(1, value);
	}

	/**
	 * Retrieve Z.
	 * <p>
	 * Notes: absolute position (Z coordinate)
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
	 * Notes: absolute rotation on the vertical axis, in degrees
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
	 * Notes: absolute rotation on the horizontal axis, in degrees
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

}
