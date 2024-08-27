package com.example.todolistui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.DateRange
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Formattable
import java.util.Formatter

@Composable
fun DateAtTop(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 7.dp)

    ){
        Column {
            Text(
                text = "Today",
                style = TextStyle(
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif
                )
            )
            Spacer(
                modifier = Modifier.height(5.dp)
            )
            val date = Date()
            val formatter = SimpleDateFormat.getDateInstance()
            val textDate = formatter.format(date)

            Text(
                text = textDate,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = MaterialTheme.colorScheme.onBackground.copy(0.6F)
                )
            )
        }
        Icon(
            imageVector = Icons.Sharp.DateRange,
            contentDescription = "date",
            tint = MaterialTheme.colorScheme.onBackground.copy(0.6F)
        )
    }
}

@Composable
@Preview(showBackground = true)
fun DateAtTopPre(modifier: Modifier = Modifier) {
    DateAtTop()
}

