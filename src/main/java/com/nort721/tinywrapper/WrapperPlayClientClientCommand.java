package com.nort721.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.EnumWrappers.ClientCommand;

public class WrapperPlayClientClientCommand extends AbstractPacket {
	public static final PacketType TYPE = PacketType.Play.Client.CLIENT_COMMAND;

	public WrapperPlayClientClientCommand(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	/**
	 * Retrieve Action ID.
	 * <p>
	 * Notes: see below
	 * 
	 * @return The current Action ID
	 */
	public ClientCommand getAction() {
		return handle.getClientCommands().read(0);
	}

	/**
	 * Set Action ID.
	 * 
	 * @param value - new value.
	 */
	public void setAction(ClientCommand value) {
		handle.getClientCommands().write(0, value);
	}

}
