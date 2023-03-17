package com.dev.bayan_ibrahim.shelf.ui.screens


import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dev.bayan_ibrahim.shelf.ui.theme.MyBookShelfTheme

@Composable
fun DetailsScreen(
    modifier: Modifier = Modifier,
) {

}

// we use this function not to repeat code passing parameters to each preview.
@Composable
private fun DetailsScreenFunctionForPreview() {
    DetailsScreen()
}

@Preview(showBackground = false)
@Composable
private fun DetailsScreenPreviewLight() {
    MyBookShelfTheme(darkTheme = false) {
        Surface(
            modifier = Modifier,
            color = MaterialTheme.colors.background,
        ) {
            DetailsScreenFunctionForPreview()
        }
    }
}

@Preview(showBackground = false)
@Composable
private fun DetailsScreenPreviewDark() {
    MyBookShelfTheme(darkTheme = true) {
        Surface(
            modifier = Modifier,
            color = MaterialTheme.colors.background,
        ) {
            DetailsScreenFunctionForPreview()
        }
    }
}
