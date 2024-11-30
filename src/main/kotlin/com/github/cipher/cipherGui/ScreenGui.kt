package com.github.cipher.cipherGui

import net.minecraft.client.gui.GuiButton
import net.minecraft.client.gui.GuiScreen

object ScreenGui : GuiScreen() {

    private var lastClickedButton = 0

    override fun initGui() {
        super.initGui()

        this.buttonList.add(GuiButton(0, width / 2 - 55, height / 2 - 10, 30, 20, "§cRED"))
        this.buttonList.add(GuiButton(1, width / 2 - 15, height / 2 - 10, 30, 20, "§9BLUE"))
        this.buttonList.add(GuiButton(2, width / 2 + 25, height / 2 - 10, 30, 20, "§2GREEN"))
    }

    override fun actionPerformed(button: GuiButton) {
        lastClickedButton = button.id
    }

    override fun drawScreen(mouseX: Int, mouseY: Int, partialTicks: Float) {
        drawDefaultBackground()

        var color = 0
        when (lastClickedButton) {
            0 -> color = 0xFFFF0000.toInt() // Red
            1 -> color = 0xFF0000FF.toInt() // Blue
            2 -> color = 0xFF00FF00.toInt() // Green
        }

        drawGradientRect(width / 2 - 65, height / 2 - 20, width / 2 + 65, height / 2 + 20, color, color)

        super.drawScreen(mouseX, mouseY, partialTicks)
    }

    override fun keyTyped(typedChar: Char, keyCode: Int) {
        super.keyTyped(typedChar, keyCode)
    }

    override fun mouseClicked(mouseX: Int, mouseY: Int, mouseButton: Int) {
        super.mouseClicked(mouseX, mouseY, mouseButton)
    }
}