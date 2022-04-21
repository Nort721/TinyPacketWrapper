package com.nort721.godseye.utils.tinywrapper;

import com.comphenix.protocol.PacketType;
import lombok.experimental.UtilityClass;

import java.util.HashMap;

@UtilityClass
public class WrapperUtil {

    public static final HashMap<PacketType, Class<? extends PacketWrapper>> wrapperConstructors = new HashMap<>();

    static {
        wrapperConstructors.put(PacketType.Play.Client.ABILITIES, WrapperPlayClientAbilities.class);
        wrapperConstructors.put(PacketType.Play.Client.ADVANCEMENTS, WrapperPlayClientAdvancements.class);
        wrapperConstructors.put(PacketType.Play.Client.ARM_ANIMATION, WrapperPlayClientArmAnimation.class);
        wrapperConstructors.put(PacketType.Play.Client.BLOCK_DIG, WrapperPlayClientBlockDig.class);
        wrapperConstructors.put(PacketType.Play.Client.BLOCK_PLACE, WrapperPlayClientBlockPlace.class);
        wrapperConstructors.put(PacketType.Play.Client.BOAT_MOVE, WrapperPlayClientBoatMove.class);
        wrapperConstructors.put(PacketType.Play.Client.CHAT, WrapperPlayClientChat.class);
        wrapperConstructors.put(PacketType.Play.Client.CLIENT_COMMAND, WrapperPlayClientClientCommand.class);
        wrapperConstructors.put(PacketType.Play.Client.CLOSE_WINDOW, WrapperPlayClientCloseWindow.class);
        wrapperConstructors.put(PacketType.Play.Client.ENTITY_ACTION, WrapperPlayClientEntityAction.class);
        wrapperConstructors.put(PacketType.Play.Client.FLYING, WrapperPlayClientFlying.class);
        wrapperConstructors.put(PacketType.Play.Client.HELD_ITEM_SLOT, WrapperPlayClientHeldItemSlot.class);
        wrapperConstructors.put(PacketType.Play.Client.KEEP_ALIVE, WrapperPlayClientKeepAlive.class);
        wrapperConstructors.put(PacketType.Play.Client.LOOK, WrapperPlayClientLook.class);
        wrapperConstructors.put(PacketType.Play.Client.POSITION, WrapperPlayClientPosition.class);
        wrapperConstructors.put(PacketType.Play.Client.POSITION_LOOK, WrapperPlayClientPositionLook.class);
        wrapperConstructors.put(PacketType.Play.Client.RESOURCE_PACK_STATUS, WrapperPlayClientResourcePackStatus.class);
        wrapperConstructors.put(PacketType.Play.Client.SETTINGS, WrapperPlayClientSettings.class);
        wrapperConstructors.put(PacketType.Play.Client.STEER_VEHICLE, WrapperPlayClientSteerVehicle.class);
        wrapperConstructors.put(PacketType.Play.Client.TAB_COMPLETE, WrapperPlayClientTabComplete.class);
        wrapperConstructors.put(PacketType.Play.Client.TELEPORT_ACCEPT, WrapperPlayClientTeleportAccept.class);
        wrapperConstructors.put(PacketType.Play.Client.TRANSACTION, WrapperPlayClientTransaction.class);
        wrapperConstructors.put(PacketType.Play.Client.PONG, WrapperPlayClientTransaction.class);
        wrapperConstructors.put(PacketType.Play.Client.USE_ENTITY, WrapperPlayClientUseEntity.class);
        wrapperConstructors.put(PacketType.Play.Client.VEHICLE_MOVE, WrapperPlayClientVehicleMove.class);
        wrapperConstructors.put(PacketType.Play.Client.WINDOW_CLICK, WrapperPlayClientWindowClick.class);

        wrapperConstructors.put(PacketType.Play.Server.ABILITIES, WrapperPlayServerAbilities.class);
        wrapperConstructors.put(PacketType.Play.Server.ADVANCEMENTS, WrapperPlayServerAdvancements.class);
        wrapperConstructors.put(PacketType.Play.Server.BED, WrapperPlayServerBed.class);
        wrapperConstructors.put(PacketType.Play.Server.CLOSE_WINDOW, WrapperPlayServerCloseWindow.class);
        wrapperConstructors.put(PacketType.Play.Server.ENTITY, WrapperPlayServerEntity.class);
        wrapperConstructors.put(PacketType.Play.Server.ENTITY_DESTROY, WrapperPlayServerEntityDestroy.class);
        wrapperConstructors.put(PacketType.Play.Server.ENTITY_METADATA, WrapperPlayServerEntityMetadata.class);
        wrapperConstructors.put(PacketType.Play.Server.ENTITY_STATUS, WrapperPlayServerEntityStatus.class);
        wrapperConstructors.put(PacketType.Play.Server.ENTITY_VELOCITY, WrapperPlayServerEntityVelocity.class);
        wrapperConstructors.put(PacketType.Play.Server.GAME_STATE_CHANGE, WrapperPlayServerGameStateChange.class);
        wrapperConstructors.put(PacketType.Play.Server.KEEP_ALIVE, WrapperPlayServerKeepAlive.class);
        wrapperConstructors.put(PacketType.Play.Server.NAMED_ENTITY_SPAWN, WrapperPlayServerNamedEntitySpawn.class);
        wrapperConstructors.put(PacketType.Play.Server.POSITION, WrapperPlayServerPosition.class);
        wrapperConstructors.put(PacketType.Play.Server.REL_ENTITY_MOVE, WrapperPlayServerRelEntityMove.class);
        wrapperConstructors.put(PacketType.Play.Server.REL_ENTITY_MOVE_LOOK, WrapperPlayServerRelEntityMoveLook.class);
        wrapperConstructors.put(PacketType.Play.Server.RESPAWN, WrapperPlayServerRespawn.class);
        wrapperConstructors.put(PacketType.Play.Server.TRANSACTION, WrapperPlayServerTransaction.class);
        wrapperConstructors.put(PacketType.Play.Server.PING, WrapperPlayServerTransaction.class);
        wrapperConstructors.put(PacketType.Play.Server.UPDATE_HEALTH, WrapperPlayServerUpdateHealth.class);
    }

}
