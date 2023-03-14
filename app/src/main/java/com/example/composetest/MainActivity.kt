package com.example.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetest.ui.theme.ComposeTestTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            ComposeTestTheme {
                BirthdayGreetingWithText(message = "hi", from = "me")
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {

                    BirthdayGreetingWithText(message = "hi baby", from = "tt")
//                    Greeting("tayyebe")
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithText(modifier: Modifier = Modifier, message: String, from: String) {
    Surface(color = Color.Red) {
        Column(modifier = modifier) {
            Text(text = message, fontSize = 36.sp)
            Text(text = from, fontSize = 24.sp)
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BirthdayGreetingWithTextPreview() {
    ComposeTestTheme {
        BirthdayGreetingWithText(message = "Happy BirthDay bestie", from = " - from Emma")

    }

}

@Composable
fun Greeting(name: String) {
    Surface(color = Color.Green) {
        Text(text = "My name is $name!", Modifier.padding(24.dp))
    }
}


@Preview(name = "it's mine", showSystemUi = true)
@Composable
fun CongratulationCardPreview() {
    ComposeTestTheme {
        Greeting("something")
    }
}
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    ComposeTestTheme {
//        Greeting("tayyebe")
//    }
//}