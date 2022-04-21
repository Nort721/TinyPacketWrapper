package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.EnumWrappers.Direction;
import com.comphenix.protocol.wrappers.EnumWrappers.PlayerDigType;

public class WrapperPlayClientBlockDig extends PacketWrapper {
	public static final PacketType TYPE = PacketType.Play.Client.BLOCK_DIG;

	public WrapperPlayClientBlockDig(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	/**
	 * Retrieve Location.
	 * <p>
	 * Notes: block position
	 * 
	 * @return The current Location
	 */
	public BlockPosition getLocation() {
		return packetData.getBlockPositionModifier().read(0);
	}

	/**
	 * Set Location.
	 * 
	 * @param value - new value.
	 */
	public void setLocation(BlockPosition value) {
		packetData.getBlockPositionModifier().write(0, value);
	}

	public Direction getDirection() {
		return packetData.getDirections().read(0);
	}

	public void setDirection(Direction value) {
		packetData.getDirections().write(0, value);
	}

	/**
	 * Retrieve Status.
	 * <p>
	 * Notes: the action the player is taking against the block (see below)
	 * 
	 * @return The current Status
	 */
	public PlayerDigType getStatus() {
		return packetData.getPlayerDigTypes().read(0);
	}

	/**
	 * Set Status.
	 * 
	 * @param value - new value.
	 */
	public void setStatus(PlayerDigType value) {
		packetData.getPlayerDigTypes().write(0, value);
	}
}
