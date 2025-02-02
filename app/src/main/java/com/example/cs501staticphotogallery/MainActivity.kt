package com.example.cs501staticphotogallery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cs501staticphotogallery.ui.theme.CS501StaticPhotoGalleryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CS501StaticPhotoGalleryTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PhotoGallery(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun PhotoGallery(modifier: Modifier = Modifier) {
    val imageSize = modifier.size(100.dp)
    Column {
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(R.drawable.calcifer),
                contentDescription = null,
                modifier = imageSize
            )

            Image(
                painter = painterResource(R.drawable.jiji),
                contentDescription = null,
                modifier = imageSize
            )
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(R.drawable.kiki),
                contentDescription = null,
                modifier = imageSize
            )

            Image(
                painter = painterResource(R.drawable.ponyo),
                contentDescription = null,
                modifier = imageSize
            )
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(R.drawable.radish),
                contentDescription = null,
                modifier = imageSize
            )

            Image(
                painter = painterResource(R.drawable.totoro),
                contentDescription = null,
                modifier = imageSize
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PhotoGalleryPreview() {
    CS501StaticPhotoGalleryTheme {
        PhotoGallery()
    }
}