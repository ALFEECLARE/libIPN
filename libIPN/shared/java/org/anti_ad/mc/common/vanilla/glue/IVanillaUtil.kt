/*
 * Inventory Profiles Next
 *
 *   Copyright (c) 2019-2020 jsnimda <7615255+jsnimda@users.noreply.github.com>
 *   Copyright (c) 2021-2022 Plamen K. Kosseff <p.kosseff@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.anti_ad.mc.common.vanilla.glue

import org.anti_ad.mc.common.Log
import org.anti_ad.mc.common.input.KeybindSettings
import java.io.File
import java.net.URL
import java.nio.file.Path

var __glue_vanillaUtil: IVanillaUtil? = null

val VanillaUtil: IVanillaUtil
    get() {
        return __glue_vanillaUtil ?: DummyVanillaUtil
    }

val Path.loggingPath
    get() = VanillaUtil.loggingString(this)


object DummyVanillaUtil : IVanillaUtil {
    override fun isValidScreen(ctx: KeybindSettings.Context): Boolean {
        Log.glueError("VanillaUtil Not Initialized")
        TODO("Not yet implemented")
    }

    override fun isOnClientThread(): Boolean {
        Log.glueError("VanillaUtil Not Initialized")
        TODO("Not yet implemented")
    }

    override fun inGame(): Boolean {
        Log.glueError("VanillaUtil Not Initialized")
        TODO("Not yet implemented")
    }

    override fun languageCode(): String {
        Log.glueError("VanillaUtil Not Initialized")
        TODO("Not yet implemented")
    }

    override fun shiftDown(): Boolean {
        Log.glueError("VanillaUtil Not Initialized")
        TODO("Not yet implemented")
    }

    override fun ctrlDown(): Boolean {
        Log.glueError("VanillaUtil Not Initialized")
        TODO("Not yet implemented")
    }

    override fun altDown(): Boolean {
        Log.glueError("VanillaUtil Not Initialized")
        TODO("Not yet implemented")
    }

    override fun mouseX(): Int {
        Log.glueError("VanillaUtil Not Initialized")
        TODO("Not yet implemented")
    }

    override fun mouseY(): Int {
        Log.glueError("VanillaUtil Not Initialized")
        TODO("Not yet implemented")
    }

    override fun mouseXRaw(): Double {
        Log.glueError("VanillaUtil Not Initialized")
        TODO("Not yet implemented")
    }

    override fun mouseYRaw(): Double {
        Log.glueError("VanillaUtil Not Initialized")
        TODO("Not yet implemented")
    }

    override fun mouseXDouble(): Double {
        Log.glueError("VanillaUtil Not Initialized")
        TODO("Not yet implemented")
    }

    override fun mouseYDouble(): Double {
        Log.glueError("VanillaUtil Not Initialized")
        TODO("Not yet implemented")
    }

    override fun mouseScaleX(amount: Double): Double {
        Log.glueError("VanillaUtil Not Initialized")
        TODO("Not yet implemented")
    }

    override fun mouseScaleY(amount: Double): Double {
        Log.glueError("VanillaUtil Not Initialized")
        TODO("Not yet implemented")
    }

    override fun lastFrameDuration(): Float {
        Log.glueError("VanillaUtil Not Initialized")
        TODO("Not yet implemented")
    }

    override fun configDirectory(): Path {
        Log.glueError("VanillaUtil Not Initialized")
        TODO("Not yet implemented")
    }

    override fun configDirectory(modName: String): Path {
        Log.glueError("VanillaUtil Not Initialized")
        TODO("Not yet implemented")
    }

    override fun getResourceAsString(identifier: String): String? {
        Log.glueError("VanillaUtil Not Initialized")
        TODO("Not yet implemented")
    }

    override fun loggingString(path: Path): String {
        Log.glueError("VanillaUtil Not Initialized")
        TODO("Not yet implemented")
    }

    override fun open(file: File) {
        Log.glueError("VanillaUtil Not Initialized")
        TODO("Not yet implemented")
    }

    override fun open(url: URL) {
        Log.glueError("VanillaUtil Not Initialized")
        TODO("Not yet implemented")
    }

    override fun chat(message: Any) {
        Log.glueError("VanillaUtil Not Initialized")
        TODO("Not yet implemented")
    }
}


interface IVanillaUtil {
    fun isOnClientThread(): Boolean

    // ============
    // info
    // ============
    fun inGame(): Boolean
    fun languageCode(): String
    fun shiftDown(): Boolean
    fun ctrlDown(): Boolean
    fun altDown(): Boolean

    // Mouse.onCursorPos() / GameRenderer.render()
    fun mouseX(): Int
    fun mouseY(): Int
    fun mouseXRaw(): Double
    fun mouseYRaw(): Double
    fun mouseXDouble(): Double
    fun mouseYDouble(): Double
    fun mouseScaleX(amount: Double): Double
    fun mouseScaleY(amount: Double): Double

    // this.client.getLastFrameDuration()
    fun lastFrameDuration(): Float

    // ============
    // do actions
    // ============
    fun configDirectory(): Path
    fun configDirectory(modName: String): Path
    fun getResourceAsString(identifier: String): String?
    fun loggingString(path: Path): String
    fun open(file: File)
    fun open(url: URL)
    fun isValidScreen(ctx: KeybindSettings.Context): Boolean
    fun chat(message: Any)
}
