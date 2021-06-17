package com.nort721.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayClientTabComplete extends AbstractPacket {
	public static final PacketType TYPE = PacketType.Play.Client.TAB_COMPLETE;

	public WrapperPlayClientTabComplete(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	public int getTransactionId() {
		return handle.getIntegers().read(0);
	}

	public void setTransactionId(int value) {
		handle.getIntegers().write(0, value);
	}

	public String getInput() {
		return handle.getStrings().read(0);
	}

	public void setInput(String value) {
		handle.getStrings().write(0, value);
	}
}
