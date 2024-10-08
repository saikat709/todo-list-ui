package com.example.todolistui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TabbedPanelView(
    tabs: List<String> = listOf("Undone", "Meeting", "Consummation")
) {
    Column {
        TabPanelControl(tabs)
    }
}

@Composable
fun TabPanelControl(
    tabs:List<String>
) {
    var selectedInd by remember { mutableIntStateOf(0) }
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        tabs.forEachIndexed() { index, it ->
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .height(35.dp)
                    .background(
                        color = if (selectedInd==index) MaterialTheme.colorScheme.primary.copy(0.2f)
                                else MaterialTheme.colorScheme.background,
                        shape = RoundedCornerShape(
                            corner = CornerSize(15.dp)
                        )
                    )
                    .clip(RoundedCornerShape(CornerSize(15.dp)))
                    .clickable {
                        selectedInd = index
                    }
                    .padding(horizontal = 15.dp)

            ){
                Text(
                    text = it,
                    color = if (selectedInd==index) MaterialTheme.colorScheme.primary
                            else MaterialTheme.colorScheme.onBackground.copy(0.6f),
                    fontWeight = if (selectedInd==index) FontWeight.Black
                                else FontWeight.Normal
                )
            }

        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun TabbedPrev(modifier: Modifier = Modifier) {
    TabbedPanelView()
}