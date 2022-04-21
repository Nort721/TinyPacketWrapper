package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayServerEntityDestroy extends PacketWrapper {
	public static final PacketType TYPE = PacketType.Play.Server.ENTITY_DESTROY;

	public WrapperPlayServerEntityDestroy(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	/**
	 * Retrieve Count.
	 * <p>
	 * Notes: length of following array
	 * 
	 * @return The current Count
	 */
	public int getCount() {
		return packetData.getIntegerArrays().read(0).length;
	}

	/**
	 * Retrieve Entity IDs.
	 * <p>
	 * Notes: the list of entities of destroy
	 * 
	 * @return The current Entity IDs
	 */
	public int[] getEntityIDs() {
		return packetData.getIntegerArrays().read(0);
	}

	/**
	 * Set Entity IDs.
	 * 
	 * @param value - new value.
	 */
	public void setEntityIds(int[] value) {
		packetData.getIntegerArrays().write(0, value);
	}

}
