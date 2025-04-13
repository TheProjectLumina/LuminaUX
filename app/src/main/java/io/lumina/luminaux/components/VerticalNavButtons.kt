
package io.lumina.luminaux.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun VerticalNavButtons(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(5.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        repeat(3) { index ->
            val iconContent: @Composable () -> Unit = when (index) {
                0 -> {
                    {
                        Icon(
                            imageVector = Icons.Default.Settings,
                            contentDescription = "Settings",
                            tint = Color(0xFFFFB7C5),
                            modifier = Modifier.size(8.dp)
                        )
                    }
                }
                1 -> {
                    {
                        Box(
                            modifier = Modifier
                                .size(8.dp)
                                .background(Color(0xFFFFB7C5), CircleShape)
                        )
                    }
                }
                else -> {
                    {
                        Icon(
                            imageVector = Icons.Default.Build,
                            contentDescription = "Info",
                            tint = Color(0xFFFFB7C5),
                            modifier = Modifier.size(8.dp)
                        )
                    }
                }
            }

            val label = when (index) {
                0 -> "Settings"
                1 -> "Community"
                else -> "Info"
            }

            AnimatedNavButton(
                content = iconContent,
                label = label,
                index = index,
                onClick = { /* Action */ }
            )
        }
    }
}