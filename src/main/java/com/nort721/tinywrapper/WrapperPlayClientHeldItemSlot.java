package com.nort721.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayClientHeldItemSlot extends PacketWrapper {
	public static final PacketType TYPE = PacketType.Play.Client.HELD_ITEM_SLOT;

	public WrapperPlayClientHeldItemSlot(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	/**
	 * Retrieve Slot.
	 * <p>
	 * Notes: the slot which the player has selected (0-8)
	 * 
	 * @return The current Slot
	 */
	public int getSlot() {
		return handle.getIntegers().read(0);
	}

	/**
	 * Set Slot.
	 * 
	 * @param value - new value.
	 */
	public void setSlot(int value) {
		handle.getIntegers().write(0, value);
	}

}
