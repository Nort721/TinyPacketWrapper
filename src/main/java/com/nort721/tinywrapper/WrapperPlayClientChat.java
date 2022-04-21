package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayClientChat extends PacketWrapper {
	public static final PacketType TYPE = PacketType.Play.Client.CHAT;

	public WrapperPlayClientChat(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	/**
	 * Retrieve Message.
	 * 
	 * @return The current Message
	 */
	public String getMessage() {
		return packetData.getStrings().read(0);
	}

	/**
	 * Set Message.
	 * 
	 * @param value - new value.
	 */
	public void setMessage(String value) {
		packetData.getStrings().write(0, value);
	}

}
