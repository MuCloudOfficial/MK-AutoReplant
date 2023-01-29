package me.mucloud.plugin.MK.AutoReplant

import org.bukkit.Tag
import org.bukkit.block.data.Ageable
import org.bukkit.entity.EntityType
import org.bukkit.entity.Item
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.inventory.ItemStack

object Listener : Listener{

    @EventHandler fun onInteract(e: PlayerInteractEvent){
        if(e.action == Action.RIGHT_CLICK_BLOCK &&
                Tag.CROPS.isTagged(e.clickedBlock!!.type) &&
                (e.clickedBlock!!.blockData as Ageable).age == (e.clickedBlock!!.blockData as Ageable).maximumAge
                ){

            for(isl: ItemStack in e.clickedBlock!!.drops){
                (e.player.world.spawnEntity(e.clickedBlock!!.location, EntityType.DROPPED_ITEM) as Item).itemStack = isl
            }

            val a: Ageable = e.clickedBlock!!.blockData as Ageable
            a.age = 0

            e.clickedBlock!!.blockData = a
        }
    }

}