package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayClientAbilities extends PacketWrapper {
	public static final PacketType TYPE = PacketType.Play.Client.ABILITIES;

	public WrapperPlayClientAbilities(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	public boolean isInvulnerable() {
		return packetData.getBooleans().read(0);
	}

	public void setInvulnerable(boolean value) {
		packetData.getBooleans().write(0, value);
	}

	public boolean isFlying() {
		return packetData.getBooleans().read(1);
	}

	public void setFlying(boolean value) {
		packetData.getBooleans().write(1, value);
	}

	public boolean canFly() {
		return packetData.getBooleans().read(2);
	}

	public void setCanFly(boolean value) {
		packetData.getBooleans().write(2, value);
	}

	public boolean canInstantlyBuild() {
		return packetData.getBooleans().read(3);
	}

	public void setCanInstantlyBuild(boolean value) {
		packetData.getBooleans().write(3, value);
	}

	public float getFlyingSpeed() {
		return packetData.getFloat().read(0);
	}

	public void setFlyingSpeed(float value) {
		packetData.getFloat().write(0, value);
	}

	public float getWalkingSpeed() {
		return packetData.getFloat().read(1);
	}

	public void setWalkingSpeed(float value) {
		packetData.getFloat().write(1, value);
	}
}
