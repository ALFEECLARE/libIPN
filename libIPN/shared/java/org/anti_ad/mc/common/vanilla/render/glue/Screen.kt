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

package org.anti_ad.mc.common.vanilla.render.glue

import org.anti_ad.mc.libipn.Log
import org.anti_ad.mc.common.math2d.Rectangle
import org.anti_ad.mc.common.math2d.Size
import org.anti_ad.mc.common.vanilla.VanillaUtil
import org.anti_ad.mc.common.vanilla.render.rRenderDirtBackground
import org.anti_ad.mc.common.vanilla.render.rScreenHeight
import org.anti_ad.mc.common.vanilla.render.rScreenWidth

/// Screen.kt

fun __glue_rDepthMask__Default(bounds: Rectangle,
                               block: () -> Unit) {
    block()
}

var __glue_rDepthMask: (bounds: Rectangle,
                        block: () -> Unit) -> Unit =  { _: Rectangle,
                                                        block : () -> Unit ->
    Log.glueError("__glue_rDepthMask is not initialized!")
    block()
}

fun rRenderBlackOverlay() { // Screen.renderBackground
    rFillGradient(0,
                  0,
                  rScreenWidth,
                  rScreenHeight,
                  -1072689136,
                  -804253680)
}

fun rRenderVanillaScreenBackground() { // Screen.renderBackground
    if (VanillaUtil.inGame()) {
        rRenderBlackOverlay()
    } else {
        rRenderDirtBackground()
    }
}

val rScreenBounds
    get() = Rectangle(0,
                      0,
                      rScreenWidth,
                      rScreenHeight)
