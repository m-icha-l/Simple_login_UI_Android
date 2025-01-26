package com.example.a2401.ui.theme

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun Input_string(value: MutableState<String>, label: String , icon_type: ImageVector)
{
    OutlinedTextField(
        value = value.value,
        onValueChange = { value.value = it },
        label = { Text(label) },
        modifier = Modifier.fillMaxWidth(),
        trailingIcon = {
            Icon(
                imageVector = icon_type,
                contentDescription = "Trailing Icon"
            )
        },

    )
}
@Composable
fun Button_UI(label: String)
{
    Button(
        onClick = {},
        modifier = Modifier.padding(top = 16.dp)
    ) {
        Text(label)
    }
}