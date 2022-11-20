package me.mucloud.plugin.MK.AutoReplant

import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.block.Block
import org.bukkit.block.BlockFace
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerHarvestBlockEvent
import org.bukkit.inventory.ItemStack

object Listener : Listener{

    @EventHandler fun onInteract(PIE: PlayerHarvestBlockEvent){
        Bukkit.broadcastMessage("事件触发了")
    }

}