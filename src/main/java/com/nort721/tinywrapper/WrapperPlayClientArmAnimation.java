package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayClientArmAnimation extends PacketWrapper {
	public static final PacketType TYPE = PacketType.Play.Client.ARM_ANIMATION;

	public WrapperPlayClientArmAnimation(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}
}
