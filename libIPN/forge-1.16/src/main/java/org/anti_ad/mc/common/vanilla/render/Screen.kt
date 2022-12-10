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

package org.anti_ad.mc.common.vanilla.render

import org.anti_ad.mc.common.math2d.Rectangle
import org.anti_ad.mc.common.math2d.Size
import org.anti_ad.mc.common.vanilla.Vanilla
import org.anti_ad.mc.common.vanilla.alias.LiteralText
import org.anti_ad.mc.common.vanilla.alias.Screen
import org.anti_ad.mc.common.vanilla.VanillaUtil
import org.anti_ad.mc.common.vanilla.render.glue.__glue_rDepthMask

val rScreenWidth
    get() = Vanilla.window().scaledWidth
val rScreenHeight
    get() = Vanilla.window().scaledHeight
val rScreenSize
    get() = Size(rScreenWidth,
                 rScreenHeight)

fun rRenderDirtBackground() {
    (Vanilla.screen() ?: dummyScreen).renderDirtBackground(0)
}

private val dummyScreen = object : Screen(
    LiteralText(
        ""
    )
) {}


fun initScreenGlue() {
    __glue_rDepthMask = { rectangle: Rectangle, block: () -> Unit -> rDepthMask(rectangle, block) }
}
