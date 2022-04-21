package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayServerCloseWindow extends PacketWrapper {
	public static final PacketType TYPE = PacketType.Play.Server.CLOSE_WINDOW;

	public WrapperPlayServerCloseWindow(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	/**
	 * Retrieve Window ID.
	 * <p>
	 * Notes: this is the id of the window that was closed. 0 for inventory.
	 * 
	 * @return The current Window ID
	 */
	public int getWindowId() {
		return packetData.getIntegers().read(0);
	}

	/**
	 * Set Window ID.
	 * 
	 * @param value - new value.
	 */
	public void setWindowId(int value) {
		packetData.getIntegers().write(0, value);
	}

}
