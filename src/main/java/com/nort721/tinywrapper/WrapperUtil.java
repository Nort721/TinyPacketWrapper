package com.nort721.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;

import java.util.HashMap;

public class WrapperUtil {

    private static final HashMap<PacketType, Class<? extends PacketWrapper>> wrapperConstructors = new HashMap<>();

    static {

        wrapperConstructors.put(PacketType.Play.Client.FLYING, WrapperPlayClientFlying.class);

    }


}
