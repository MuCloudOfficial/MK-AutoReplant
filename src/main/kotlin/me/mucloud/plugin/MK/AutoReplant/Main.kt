package me.mucloud.plugin.MK.AutoReplant

import org.bukkit.event.HandlerList
import org.bukkit.plugin.java.JavaPlugin

object Main: JavaPlugin() {

    val PREFIX = "§b§lMK§7§l-§e§lAutoReplant"

    override fun onDisable() {
        HandlerList.unregisterAll(this)
    }

    override fun onEnable() {
        server.pluginManager.registerEvents(Listener,this)
    }

}