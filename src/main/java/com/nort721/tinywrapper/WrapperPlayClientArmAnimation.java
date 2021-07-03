package com.nort721.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayClientArmAnimation extends com.nort721.godseye.utils.tinywrapper.PacketWrapper {
	public static final PacketType TYPE = PacketType.Play.Client.ARM_ANIMATION;

	public WrapperPlayClientArmAnimation(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}
}
