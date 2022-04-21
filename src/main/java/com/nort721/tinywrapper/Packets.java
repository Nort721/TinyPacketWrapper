package com.nort721.godseye.utils.packet;

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

    public Set<PacketType> ROTATION = ImmutableSet.of(
            PacketType.Play.Client.LOOK, PacketType.Play.Client.POSITION_LOOK);

    public Set<PacketType> TRANSACTION_CLIENT = ImmutableSet.of(
            PacketType.Play.Client.TRANSACTION, PacketType.Play.Client.PONG);

    public Set<PacketType> TRANSACTION_SERVER = ImmutableSet.of(
            PacketType.Play.Server.TRANSACTION, PacketType.Play.Server.PING);
}
