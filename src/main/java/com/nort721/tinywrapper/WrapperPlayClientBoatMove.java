package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayClientBoatMove extends PacketWrapper {

	public static final PacketType TYPE = PacketType.Play.Client.BOAT_MOVE;

	public WrapperPlayClientBoatMove(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	public boolean getLeftOar() {
		return packetData.getBooleans().read(0);
	}

	public void setLeftOar(boolean value) {
		packetData.getBooleans().write(0, value);
	}

	public boolean getRightOar() {
		return packetData.getBooleans().read(1);
	}

	public void setRightOar(boolean value) {
		packetData.getBooleans().write(1, value);
	}

}
