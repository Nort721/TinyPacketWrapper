package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.reflect.StructureModifier;
import com.comphenix.protocol.utility.MinecraftReflection;
import com.comphenix.protocol.wrappers.EnumWrappers;

import java.util.Set;

public class WrapperPlayServerPosition extends PacketWrapper {
	public static final PacketType TYPE = PacketType.Play.Server.POSITION;

	public WrapperPlayServerPosition(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	/**
	 * Retrieve X.
	 * <p>
	 * Notes: absolute/Relative position
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
	 * Notes: absolute/Relative position
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
	 * Notes: absolute/Relative position
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
	 * Notes: absolute/Relative rotation on the X Axis, in degrees
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
	 * Notes: absolute/Relative rotation on the Y Axis, in degrees
	 * 
	 * @return The current Pitch
	 */
	public float getPitch() {
		return packetData.getFloat().read(1);
	}

	public int getTeleportId() {
		return packetData.getIntegers().read(0);
	}

	/**
	 * Set Pitch.
	 * 
	 * @param value - new value.
	 */
	public void setPitch(float value) {
		packetData.getFloat().write(1, value);
	}

	public static final Class<?> FLAGS_CLASS = MinecraftReflection
			.getMinecraftClass("EnumPlayerTeleportFlags",
					"PacketPlayOutPosition$EnumPlayerTeleportFlags");

	public enum PlayerTeleportFlag {
		X, Y, Z, Y_ROT, X_ROT
	}

	private StructureModifier<Set<PlayerTeleportFlag>> getFlagsModifier() {
		return packetData.getSets(
				EnumWrappers.getGenericConverter(FLAGS_CLASS, PlayerTeleportFlag.class));
	}

	public Set<PlayerTeleportFlag> getFlags() {
		return getFlagsModifier().read(0);
	}

	public void setFlags(Set<PlayerTeleportFlag> value) {
		getFlagsModifier().write(0, value);
	}
}
