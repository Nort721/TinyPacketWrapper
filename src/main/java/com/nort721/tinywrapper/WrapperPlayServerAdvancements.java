package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.*;
import org.bukkit.advancement.Advancement;
import org.bukkit.inventory.ItemStack;

import java.util.Date;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static com.comphenix.protocol.utility.MinecraftReflection.getMinecraftClass;

public class WrapperPlayServerAdvancements extends PacketWrapper {

    public static final PacketType TYPE = PacketType.Play.Server.ADVANCEMENTS;
    
    public WrapperPlayServerAdvancements(PacketEvent packetEvent) {
        super(packetEvent, TYPE);
    }

    public static class SerializedAdvancement {
        public MinecraftKey key;
        public Advancement advancement;
        public AdvancementDisplay display;
        public Object rewards;
        public Map<String, Object> criteria;
        public String[][] requirements;
    }

    public static class AdvancementDisplay {
        public WrappedChatComponent title;
        public WrappedChatComponent description;
        public ItemStack icon;
        public MinecraftKey background;
        public FrameType frame;
        public boolean showToast;
        public boolean announceToChat;
        public boolean hidden;
        public float xCoord;
        public float yCoord;
    }

    public enum FrameType {
        TASK,
        CHALLENGE,
        GOAL
    }

    public static class AdvancementProgress {
        public Map<String, CriterionProgress> progress;
        public String[][] array2d;
    }

    public static class CriterionProgress {
        public AdvancementProgress progress;
        public Date date;
    }

    private static final AutoWrapper<AdvancementDisplay> DISPLAY = AutoWrapper
            .wrap(AdvancementDisplay.class, "AdvancementDisplay")
            .field(0, BukkitConverters.getWrappedChatComponentConverter())
            .field(1, BukkitConverters.getWrappedChatComponentConverter())
            .field(2, BukkitConverters.getItemStackConverter())
            .field(3, MinecraftKey.getConverter())
            .field(4, EnumWrappers.getGenericConverter(getMinecraftClass("AdvancementFrameType"), FrameType.class));

    private static final AutoWrapper<SerializedAdvancement> WRAPPER = AutoWrapper
            .wrap(SerializedAdvancement.class,"Advancement$SerializedAdvancement")
            .field(0, MinecraftKey.getConverter())
            .field(1, BukkitConverters.getAdvancementConverter())
            .field(2, DISPLAY);

    private static final AutoWrapper<CriterionProgress> CRITERION = AutoWrapper
            .wrap(CriterionProgress.class, "CriterionProgress");

    private static final AutoWrapper<AdvancementProgress> PROGRESS = AutoWrapper
            .wrap(AdvancementProgress.class, "AdvancementProgress")
            .field(0, BukkitConverters.getMapConverter(Converters.passthrough(String.class), CRITERION));

    static {
        CRITERION.field(0, PROGRESS);
    }

    /**
     * Retrieve Reset/Clear.
     * <p>
     * Notes: whether to reset/clear the current advancements
     * @return The current Reset/Clear
     */
    public boolean isReset() {
        return packetData.getBooleans().read(0);
    }
    
    /**
     * Set Reset/Clear.
     * @param value - new value.
     */
    public void setReset(boolean value) {
        packetData.getBooleans().write(0,  value);
    }

    public Optional<Map<MinecraftKey, SerializedAdvancement>> getAdvancements() {
        return packetData.getMaps(MinecraftKey.getConverter(), WRAPPER).optionRead(0);
    }

    public void setAdvancements(Map<MinecraftKey, SerializedAdvancement> value) {
        packetData.getMaps(MinecraftKey.getConverter(), WRAPPER).writeSafely(0, value);
    }

    public Optional<Set<MinecraftKey>> getKeys() {
        return packetData.getSets(MinecraftKey.getConverter()).optionRead(0);
    }

    public void setKeys(Set<MinecraftKey> value) {
        packetData.getSets(MinecraftKey.getConverter()).writeSafely(0, value);
    }

    public Optional<Map<MinecraftKey, AdvancementProgress>> getProgress() {
        return packetData.getMaps(MinecraftKey.getConverter(), PROGRESS).optionRead(1);
    }
}
