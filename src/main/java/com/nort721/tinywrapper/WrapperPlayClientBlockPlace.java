package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.EnumWrappers.Hand;

public class WrapperPlayClientBlockPlace extends PacketWrapper {
	public static final PacketType TYPE = PacketType.Play.Client.BLOCK_PLACE;

	public WrapperPlayClientBlockPlace(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	public Hand getHand() {
		return packetData.getHands().read(0);
	}

	public void setHand(Hand value) {
		packetData.getHands().write(0, value);
	}

	public long getTimestamp() {
		return packetData.getLongs().read(0);
	}

	public void setTimestamp(long value) {
		packetData.getLongs().write(0, value);
	}

}
