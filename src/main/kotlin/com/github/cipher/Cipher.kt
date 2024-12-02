package com.github.cipher

import com.github.cipher.commands.ConfigCommand
import com.github.cipher.config.CipherConfig
import net.minecraft.client.Minecraft
import net.minecraft.client.gui.GuiScreen
import net.minecraftforge.client.ClientCommandHandler
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent

@Mod(modid = "cipher", useMetadata = true)
class Cipher {
    companion object {
        var screenToOpenNextTick: GuiScreen? = null
        val mc = Minecraft.getMinecraft()
        val config = CipherConfig
    }

    @Mod.EventHandler
    fun init(event: FMLInitializationEvent) {
        config.init() // Initialize the config
        MinecraftForge.EVENT_BUS.register(this)
    }

    @Mod.EventHandler
    fun loadComplete(event: FMLLoadCompleteEvent) {
        val cch = ClientCommandHandler.instance

        cch.registerCommand(ConfigCommand) // Gui Command
    }

//    @SubscribeEvent
//    fun onTick(event: TickEvent.ClientTickEvent) {
//        if (event.phase == TickEvent.Phase.END) return
//        if (screenToOpenNextTick == null) return
//        Minecraft.getMinecraft().displayGuiScreen(screenToOpenNextTick)
//        screenToOpenNextTick = null
//    }
}