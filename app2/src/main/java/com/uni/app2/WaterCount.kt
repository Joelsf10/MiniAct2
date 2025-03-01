package com.uni.app2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCount(modifier: Modifier = Modifier) {
    Column ( modifier = modifier.padding(20.dp)){
        var count = 0

        Text("You've had $count glasses.")
        Button(onClick = {count++}, Modifier.padding(top = 5.dp)) {
            Text("Add more")
        }
    }
}