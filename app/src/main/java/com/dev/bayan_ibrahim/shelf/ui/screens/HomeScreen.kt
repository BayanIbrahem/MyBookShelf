package com.dev.bayan_ibrahim.shelf.ui.screens


import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dev.bayan_ibrahim.shelf.ui.theme.MyBookShelfTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
) {

}

// we use this function not to repeat code passing parameters to each preview.
@Composable
private fun HomeScreenFunctionForPreview() {
    HomeScreen()
}

@Preview(showBackground = false)
@Composable
private fun HomeScreenPreviewLight() {
    MyBookShelfTheme(darkTheme = false) {
        Surface(
            modifier = Modifier,
            color = MaterialTheme.colors.background,
        ) {
            HomeScreenFunctionForPreview()
        }
    }
}

@Preview(showBackground = false)
@Composable
private fun HomeScreenPreviewDark() {
    MyBookShelfTheme(darkTheme = true) {
        Surface(
            modifier = Modifier,
            color = MaterialTheme.colors.background,
        ) {
            HomeScreenFunctionForPreview()
        }
    }
}
