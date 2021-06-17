package com.nort721.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayClientKeepAlive extends AbstractPacket {
	public static final PacketType TYPE = PacketType.Play.Client.KEEP_ALIVE;

	public WrapperPlayClientKeepAlive(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	/**
	 * Retrieve Keep Alive ID.
	 * 
	 * @return The current Keep Alive ID
	 */
	public long getKeepAliveId() {
		return handle.getLongs().read(0);
	}

	/**
	 * Set Keep Alive ID.
	 * 
	 * @param value - new value.
	 */
	public void setKeepAliveId(long value) {
		handle.getLongs().write(0, value);
	}

}
