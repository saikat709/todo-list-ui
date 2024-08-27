package com.example.todolistui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todolistui.components.DateAtTop
import com.example.todolistui.components.SearchButton
import com.example.todolistui.components.TabbedPanelView

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    BottomSheetScaffold(
        modifier = Modifier
            .padding(top = 75.dp)
            .padding(horizontal = 15.dp),
        sheetContent = {

        }
    ) {
        Column {
            DateAtTop()
            Spacer(modifier = Modifier.height(12.dp))
            SearchButton()
            Spacer(modifier = Modifier.height(12.dp))
            TabbedPanelView(
                listOf("Undone", "Meeting", "Consummation")
            )
        }

    }
}


@Composable
@Preview(showSystemUi = true)
fun HomeScreenPreview(modifier: Modifier = Modifier) {
    HomeScreen()
}