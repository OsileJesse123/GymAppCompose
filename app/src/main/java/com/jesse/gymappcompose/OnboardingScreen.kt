package com.jesse.gymappcompose

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jesse.gymappcompose.ui.theme.GymAppComposeTheme
import com.jesse.gymappcompose.ui.theme.gymPink

@Composable
fun OnboardingScreen(modifier: Modifier = Modifier) {
    var backgroundColor = gymPink
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = backgroundColor),
        contentAlignment = Alignment.BottomCenter
    ) {
        Image(
            painter = painterResource(id = R.drawable.gym_lady_1),
            contentDescription = "lady in the gym",
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)
        )
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp, top = 35.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "V",
                    fontSize = 50.sp,
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold
                )
                Row(
                ) {
                    val rowColor = Color.White.copy(
                        alpha = .5f
                    )
                    Text(
                        text = stringResource(id = R.string.skip).toUpperCase(Locale.current),
                        color = rowColor
                    )
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowRight,
                        contentDescription = "forward arrow",
                        tint = rowColor
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun OnboardingScreenPreview() {
    GymAppComposeTheme {
        OnboardingScreen()
    }
}