package com.example.scrollapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scrollapp.data.ListMotivasi
import com.example.scrollapp.model.Motivasi
import com.example.scrollapp.ui.theme.ScrollAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScrollApp(listMotivasi = ListMotivasi().LoadMotivasi())
        }
    }
}

@Composable
fun ScrollApp(listMotivasi: List<Motivasi>) {
    LazyColumn{
        items(listMotivasi) { Motivasi ->
            Scrolling(Motivasi = Motivasi)
        }
    }
}

@Composable
fun Scrolling() {
    Column() {
        Image(
            painter = painterResource(id = R.drawable.image1),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Text(
            text = stringResource(id = R.string.affirmation1),
            modifier = Modifier.padding(6.dp),
            style = MaterialTheme.typography.h1
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ScrollAppTheme {
        Scrolling()
    }
}