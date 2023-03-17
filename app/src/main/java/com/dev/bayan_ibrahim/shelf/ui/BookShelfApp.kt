package com.dev.bayan_ibrahim.shelf.ui


import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dev.bayan_ibrahim.shelf.ui.theme.MyBookShelfTheme

@Composable
fun BookShelfApp(
    modifier: Modifier = Modifier,
) {

}

// we use this function not to repeat code passing parameters to each preview.
@Composable
private fun BookShelfAppFunctionForPreview() {
    BookShelfApp()
}

@Preview(showBackground = false)
@Composable
private fun BookShelfAppPreviewLight() {
    MyBookShelfTheme(darkTheme = false) {
        Surface(
            modifier = Modifier,
            color = MaterialTheme.colors.background,
        ) {
            BookShelfAppFunctionForPreview()
        }
    }
}

@Preview(showBackground = false)
@Composable
private fun BookShelfAppPreviewDark() {
    MyBookShelfTheme(darkTheme = true) {
        Surface(
            modifier = Modifier,
            color = MaterialTheme.colors.background,
        ) {
            BookShelfAppFunctionForPreview()
        }
    }
}
