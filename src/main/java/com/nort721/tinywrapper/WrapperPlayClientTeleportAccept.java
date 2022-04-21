package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayClientTeleportAccept extends PacketWrapper {

	public static final PacketType TYPE =
			PacketType.Play.Client.TELEPORT_ACCEPT;

	public WrapperPlayClientTeleportAccept(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	/**
	 * Retrieve Teleport ID.
	 * <p>
	 * Notes: the ID given by the Player Position And Look packet
	 * 
	 * @return The current Teleport ID
	 */
	public int getTeleportId() {
		return packetData.getIntegers().read(0);
	}

	/**
	 * Set Teleport ID.
	 * 
	 * @param value - new value.
	 */
	public void setTeleportId(int value) {
		packetData.getIntegers().write(0, value);
	}

}
