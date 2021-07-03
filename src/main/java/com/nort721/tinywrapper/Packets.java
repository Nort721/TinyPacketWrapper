package com.nort721.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.google.common.collect.ImmutableSet;
import lombok.experimental.UtilityClass;

import java.util.Set;

@UtilityClass
public class Packets {

	public Set<PacketType> FLYING = ImmutableSet.of(
			PacketType.Play.Client.FLYING, PacketType.Play.Client.POSITION, PacketType.Play.Client.POSITION_LOOK, PacketType.Play.Client.LOOK);

	public Set<PacketType> POSITION = ImmutableSet.of(
			PacketType.Play.Client.POSITION, PacketType.Play.Client.POSITION_LOOK);
}
