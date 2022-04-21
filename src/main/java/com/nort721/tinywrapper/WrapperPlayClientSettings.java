package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.EnumWrappers.ChatVisibility;

public class WrapperPlayClientSettings extends PacketWrapper {
	public static final PacketType TYPE = PacketType.Play.Client.SETTINGS;

	public WrapperPlayClientSettings(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	/**
	 * Retrieve Locale.
	 * <p>
	 * Notes: en_GB
	 * 
	 * @return The current Locale
	 */
	public String getLocale() {
		return packetData.getStrings().read(0);
	}

	/**
	 * Set Locale.
	 * 
	 * @param value - new value.
	 */
	public void setLocale(String value) {
		packetData.getStrings().write(0, value);
	}

	/**
	 * Retrieve View distance.
	 * <p>
	 * Notes: client-side render distance(chunks)
	 * 
	 * @return The current View distance
	 */
	public int getViewDistance() {
		return packetData.getIntegers().read(0);
	}

	/**
	 * Set View distance.
	 * 
	 * @param value - new value.
	 */
	public void setViewDistance(byte value) {
		packetData.getIntegers().write(0, (int) value);
	}

	/**
	 * Retrieve Chat flags.
	 * <p>
	 * Notes: chat settings. See notes below.
	 * 
	 * @return The current Chat flags
	 */
	public ChatVisibility getChatFlags() {
		return packetData.getChatVisibilities().read(0);
	}

	/**
	 * Set Chat flags.
	 * 
	 * @param value - new value.
	 */
	public void setChatFlags(ChatVisibility value) {
		packetData.getChatVisibilities().write(0, value);
	}

	/**
	 * Retrieve Chat colours.
	 * <p>
	 * Notes: "Colours" multiplayer setting
	 * 
	 * @return The current Chat colours
	 */
	public boolean getChatColours() {
		return packetData.getBooleans().read(0);
	}

	/**
	 * Set Chat colours.
	 * 
	 * @param value - new value.
	 */
	public void setChatColours(boolean value) {
		packetData.getBooleans().write(0, value);
	}

	/**
	 * Retrieve Displayed skin parts.
	 * <p>
	 * Notes: skin parts. See note below
	 * 
	 * @return The current Displayed skin parts
	 */
	public int getDisplayedSkinParts() {
		return packetData.getIntegers().read(1);
	}

	/**
	 * Set Displayed skin parts.
	 * 
	 * @param value - new value.
	 */
	public void setDisplayedSkinParts(int value) {
		packetData.getIntegers().write(1, value);
	}

}
