package com.github.cipher.config

import cc.polyfrost.oneconfig.config.Config
import cc.polyfrost.oneconfig.config.annotations.HUD
import cc.polyfrost.oneconfig.config.annotations.Switch
import cc.polyfrost.oneconfig.config.data.Mod
import cc.polyfrost.oneconfig.config.data.ModType
import cc.polyfrost.oneconfig.config.data.OptionSize

object CipherConfig : Config(Mod("Cipher", ModType.SKYBLOCK), "cipher.json") {

    @Switch(
        name = "TestSwitch",
        size = OptionSize.DUAL,
        category = "General",
        subcategory = ""
    )
    var testSwitch = false



    fun init() {
        initialize()
    }
}