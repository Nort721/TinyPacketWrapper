package com.nort721.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayClientAbilities extends com.nort721.godseye.utils.tinywrapper.PacketWrapper {
	public static final PacketType TYPE = PacketType.Play.Client.ABILITIES;

	public WrapperPlayClientAbilities(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	public boolean isInvulnerable() {
		return handle.getBooleans().read(0);
	}

	public void setInvulnerable(boolean value) {
		handle.getBooleans().write(0, value);
	}

	public boolean isFlying() {
		return handle.getBooleans().read(1);
	}

	public void setFlying(boolean value) {
		handle.getBooleans().write(1, value);
	}

	public boolean canFly() {
		return handle.getBooleans().read(2);
	}

	public void setCanFly(boolean value) {
		handle.getBooleans().write(2, value);
	}

	public boolean canInstantlyBuild() {
		return handle.getBooleans().read(3);
	}

	public void setCanInstantlyBuild(boolean value) {
		handle.getBooleans().write(3, value);
	}

	public float getFlyingSpeed() {
		return handle.getFloat().read(0);
	}

	public void setFlyingSpeed(float value) {
		handle.getFloat().write(0, value);
	}

	public float getWalkingSpeed() {
		return handle.getFloat().read(1);
	}

	public void setWalkingSpeed(float value) {
		handle.getFloat().write(1, value);
	}
}
