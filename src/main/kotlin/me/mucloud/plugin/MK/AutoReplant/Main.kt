package me.mucloud.plugin.MK.AutoReplant

import org.bukkit.event.HandlerList
import org.bukkit.plugin.java.JavaPlugin

class Main: JavaPlugin() {

    val PREFIX = "§b§lMK§7§l-§e§lAutoReplant"

    override fun onDisable() {
        HandlerList.unregisterAll(this)
        logger.info("§7§l[$PREFIX§7§l] §a插件已关闭")
    }

    override fun onEnable() {
        server.pluginManager.registerEvents(Listener,this)
        logger.info("§7§l[$PREFIX§7§l] §a插件已启动")
    }

}