package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.inventory.ItemStack;

public class WrapperPlayClientWindowClick extends PacketWrapper {
	public static final PacketType TYPE = PacketType.Play.Client.WINDOW_CLICK;

	public WrapperPlayClientWindowClick(PacketEvent packetEvent) {
		super(packetEvent, TYPE);
	}

	/**
	 * Retrieve Window ID.
	 * <p>
	 * Notes: the id of the window which was clicked. 0 for player inventory.
	 * 
	 * @return The current Window ID
	 */
	public int getWindowId() {
		return packetData.getIntegers().read(0);
	}

	/**
	 * Set Window ID.
	 * 
	 * @param value - new value.
	 */
	public void setWindowId(int value) {
		packetData.getIntegers().write(0, value);
	}

	/**
	 * Retrieve Slot.
	 * <p>
	 * Notes: the clicked slot. See below.
	 * 
	 * @return The current Slot
	 */
	public int getSlot() {
		return packetData.getIntegers().read(1);
	}

	/**
	 * Set Slot.
	 * 
	 * @param value - new value.
	 */
	public void setSlot(int value) {
		packetData.getIntegers().write(1, value);
	}

	/**
	 * Retrieve Button.
	 * <p>
	 * Notes: the button used in the click. See below.
	 * 
	 * @return The current Button
	 */
	public int getButton() {
		return packetData.getIntegers().read(2);
	}

	/**
	 * Set Button.
	 * 
	 * @param value - new value.
	 */
	public void setButton(int value) {
		packetData.getIntegers().write(2, value);
	}

	/**
	 * Retrieve Action number.
	 * <p>
	 * Notes: a unique number for the action, used for transaction handling (See
	 * the Transaction packet).
	 * 
	 * @return The current Action number
	 */
	public short getActionNumber() {
		return packetData.getShorts().read(0);
	}

	/**
	 * Set Action number.
	 * 
	 * @param value - new value.
	 */
	public void setActionNumber(short value) {
		packetData.getShorts().write(0, value);
	}

	/**
	 * Retrieve Clicked item.
	 * 
	 * @return The current Clicked item
	 */
	public ItemStack getClickedItem() {
		return packetData.getItemModifier().read(0);
	}

	/**
	 * Set Clicked item.
	 * 
	 * @param value - new value.
	 */
	public void setClickedItem(ItemStack value) {
		packetData.getItemModifier().write(0, value);
	}

	public InventoryClickType getShift() {
		return packetData.getEnumModifier(InventoryClickType.class, 5).read(0);
	}

	public void setShift(InventoryClickType value) {
		packetData.getEnumModifier(InventoryClickType.class, 5).write(0, value);
	}

	public enum InventoryClickType {
		PICKUP, QUICK_MOVE, SWAP, CLONE, THROW, QUICK_CRAFT, PICKUP_ALL;
	}
}
