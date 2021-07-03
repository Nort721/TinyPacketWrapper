package com.nort721.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayClientBoatMove extends PacketWrapper {

	public static final PacketType TYPE = PacketType.Play.Client.BOAT_MOVE;

	public WrapperPlayClientBoatMove(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	public boolean getLeftOar() {
		return handle.getBooleans().read(0);
	}

	public void setLeftOar(boolean value) {
		handle.getBooleans().write(0, value);
	}

	public boolean getRightOar() {
		return handle.getBooleans().read(1);
	}

	public void setRightOar(boolean value) {
		handle.getBooleans().write(1, value);
	}

}
