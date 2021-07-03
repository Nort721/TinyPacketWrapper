package com.nort721.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import com.nort721.godseye.utils.server.ProtocolVersion;

public class WrapperPlayServerKeepAlive extends com.nort721.godseye.utils.tinywrapper.PacketWrapper {
	public static final PacketType TYPE = PacketType.Play.Server.KEEP_ALIVE;

	public WrapperPlayServerKeepAlive(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	/**
	 * Retrieve Keep Alive ID.
	 *
	 * @return The current Keep Alive ID
	 */
	public long getKeepAliveId() {
		return ProtocolVersion.getGameVersion().isOrAbove(ProtocolVersion.V1_12) ? handle.getLongs().read(0) : (long) handle.getIntegers().read(0);
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
