package com.github.cipher.commands

import com.github.cipher.Cipher
import com.github.cipher.cipherGui.ScreenGui
import net.minecraft.command.CommandBase
import net.minecraft.command.ICommandSender

object GuiCommand : CommandBase() {

    override fun getCommandName(): String = "gui"

    override fun getCommandUsage(sender: ICommandSender?): String = ""

    override fun processCommand(sender: ICommandSender?, args: Array<String>) {
        Cipher.screenToOpenNextTick = ScreenGui
    }

    override fun getRequiredPermissionLevel(): Int = 0
}