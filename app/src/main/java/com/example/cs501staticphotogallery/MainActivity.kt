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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
    val imageSize = modifier.size(100.dp) // used to standardize image size
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(80.dp)
    ) {
        // column of rows of two images each
        Row(modifier = Modifier.fillMaxWidth()) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .padding(5.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.calcifer),
                    contentDescription = null,
                    modifier = imageSize
                )
                Text(text = "Calcifer")
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .padding(5.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.jiji),
                    contentDescription = null,
                    modifier = imageSize
                )
                Text(text = "Jiji")
            }
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .padding(5.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.kiki),
                    contentDescription = null,
                    modifier = imageSize
                )
                Text(text = "Kiki")
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .padding(5.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.ponyo),
                    contentDescription = null,
                    modifier = imageSize
                )
                Text(text = "Ponyo")
            }
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .padding(5.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.radish),
                    contentDescription = null,
                    modifier = imageSize
                )
                Text(text = "Radish Spirit")
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .padding(5.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.totoro),
                    contentDescription = null,
                    modifier = imageSize
                )
                Text(text = "Totoro")
            }
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