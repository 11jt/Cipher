package com.github.cipher.commands

import com.github.cipher.Cipher
import net.minecraft.client.entity.EntityPlayerSP

object ConfigCommand : BaseCommand("ci", listOf("cipher")) {

    override fun processCommand(player: EntityPlayerSP, args: Array<String>) {
        Cipher.config.openGui()
    }
}