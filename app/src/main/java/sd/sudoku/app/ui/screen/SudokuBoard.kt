package sd.sudoku.app.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import sd.sudoku.app.ui.theme.SudokuAppTheme

@Composable
fun SudokuBoard(name: String, modifier: Modifier = Modifier) {
    Column {
        Text(text = "sudoku board")
    }
}

@Preview(showBackground = true)
@Composable
fun SudokuBoardPreview() {
    SudokuAppTheme {
        SudokuBoard("Android")
    }
}