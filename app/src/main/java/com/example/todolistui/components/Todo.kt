package com.example.todolistui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Todo(modifier: Modifier = Modifier) {
    Row(
//        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .then(modifier)
            .fillMaxWidth()
            .background(
                color = MaterialTheme.colorScheme.background.copy(0.85f),
                shape = RoundedCornerShape(CornerSize(10.dp))
            )
            .padding(all = 15.dp)
            .padding(all = 0.dp)
    ) {
        Box(
            modifier = Modifier
                .size(15.dp)
                .background(
                    color = MaterialTheme.colorScheme.primary.copy(0.85f),
                    shape = CircleShape
                )
                .padding(15.dp)
        )
        Column(
            modifier = Modifier
                .padding(horizontal = 20.dp)
        ){
            Text("Title",
                style = TextStyle(
                    fontSize = 19.sp,
                    fontWeight = FontWeight.Medium
                )
            )
            Text("description",
                style = TextStyle(
                    fontSize = 17.sp
                )
            )

        }
        Spacer(
            modifier = Modifier.weight(1f)
        )
        Text(text = "3.10 am")
    }
}


@Composable
@Preview
fun TodoPrev(modifier: Modifier = Modifier) {
    Todo()
}