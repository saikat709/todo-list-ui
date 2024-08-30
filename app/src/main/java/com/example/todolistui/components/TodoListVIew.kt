package com.example.todolistui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TodoListView(modifier: Modifier = Modifier) {
    LazyColumn {
        items(10){
            Todo(modifier = Modifier
                .padding(vertical = 5.dp)
            )
        }
    }
}

@Composable
@Preview
fun TodoListViewPrev(modifier: Modifier = Modifier) {
    TodoListView()
}