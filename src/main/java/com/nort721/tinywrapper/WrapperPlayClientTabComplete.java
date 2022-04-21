package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayClientTabComplete extends PacketWrapper {
	public static final PacketType TYPE = PacketType.Play.Client.TAB_COMPLETE;

	public WrapperPlayClientTabComplete(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	public int getTransactionId() {
		return packetData.getIntegers().read(0);
	}

	public void setTransactionId(int value) {
		packetData.getIntegers().write(0, value);
	}

	public String getInput() {
		return packetData.getStrings().read(0);
	}

	public void setInput(String value) {
		packetData.getStrings().write(0, value);
	}
}
