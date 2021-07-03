package com.nort721.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.EnumWrappers.ResourcePackStatus;

public class WrapperPlayClientResourcePackStatus extends PacketWrapper {
	public static final PacketType TYPE =
			PacketType.Play.Client.RESOURCE_PACK_STATUS;

	public WrapperPlayClientResourcePackStatus(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	/**
	 * Retrieve Result.
	 * <p>
	 * Notes: successfully loaded: 0, Declined: 1, Failed download: 2, Accepted:
	 * 3
	 * 
	 * @return The current Result
	 */
	public ResourcePackStatus getResult() {
		return handle.getResourcePackStatus().read(0);
	}

	/**
	 * Set Result.
	 * 
	 * @param value - new value.
	 */
	public void setResult(ResourcePackStatus value) {
		handle.getResourcePackStatus().write(0, value);
	}
}
