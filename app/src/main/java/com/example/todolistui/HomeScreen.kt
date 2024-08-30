package com.example.todolistui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBarState
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.BottomSheetScaffoldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.material3.rememberStandardBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todolistui.components.AddTodoSheetContent
import com.example.todolistui.components.DateAtTop
import com.example.todolistui.components.SearchButton
import com.example.todolistui.components.TabbedPanelView
import com.example.todolistui.components.TodoListView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    val scaffoldState = rememberBottomSheetScaffoldState()
    val scope = rememberCoroutineScope()

    LaunchedEffect(Unit) {
        scope.launch {
            scaffoldState.bottomSheetState.show()
        }
    }

    BottomSheetScaffold(
        modifier = Modifier
            .padding(top = 75.dp)
            .padding(horizontal = 15.dp),
        sheetContent = {
            AddTodoSheetContent()
        },
        sheetPeekHeight = 65.dp,
        scaffoldState = scaffoldState,
    ) {
        Column {
            DateAtTop()
            Spacer(modifier = Modifier.height(12.dp))
            SearchButton()
            Spacer(modifier = Modifier.height(12.dp))
            TabbedPanelView(
                listOf("Undone", "Meeting", "Consummation")
            )
            TodoListView()
        }

    }
}


@Composable
@Preview(showSystemUi = true)
fun HomeScreenPreview(modifier: Modifier = Modifier) {
    HomeScreen()
}