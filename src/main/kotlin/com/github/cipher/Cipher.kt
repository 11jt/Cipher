package com.github.cipher

import com.github.cipher.commands.GuiCommand
import net.minecraft.client.Minecraft
import net.minecraft.client.gui.GuiScreen
import net.minecraftforge.client.ClientCommandHandler
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.fml.common.gameevent.TickEvent

@Mod(modid = "cipher", useMetadata = true)
class Cipher {
    companion object {
        var screenToOpenNextTick: GuiScreen? = null
    }

    @Mod.EventHandler
    fun init(event: FMLInitializationEvent) {
        MinecraftForge.EVENT_BUS.register(this)
        ClientCommandHandler.instance.registerCommand(GuiCommand)
    }

    @SubscribeEvent
    fun onTick(event: TickEvent.ClientTickEvent) {
        if (event.phase == TickEvent.Phase.END) return
        if (screenToOpenNextTick == null) return
        println("Was checked.")
        Minecraft.getMinecraft().displayGuiScreen(screenToOpenNextTick)
        screenToOpenNextTick = null
    }
}
