package com.example.examen_yifei

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.examen_yifei.ui.theme.Examen_YifeiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Examen_YifeiTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    examen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun examen(modifier: Modifier = Modifier){
    Column (
        modifier = Modifier.fillMaxSize().
        background(color = Color.Cyan).padding(40.dp)
    ) {
        Column () {
            Row (
                modifier.background(color = Color.Gray).padding(40.dp).fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column (
                    modifier.background(color = Color.Red),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Hello Android")

                }
                Column (
                    modifier.background(color = Color.Red),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Hello Android")
                    modifier.padding(40.dp)

                    Text(text = "Hello Android")
                    Text(text = "Hello Android")
                }
            }
            Column (
                modifier = modifier.background(color = Color.White).padding(40.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Hello Android")
            }
            Row (
                modifier.background(color = Color.Green).padding(40.dp).fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column (
                    modifier.background(color = Color.Blue).padding()
                ) {
                    Button(
                        onClick = {}
                    ) {
                        modifier.size(60.dp)
                        Text(text = "1")
                    }
                    Button(
                        onClick = {}
                    ) {
                        modifier.size(60.dp)
                        Text(text = "4")
                    }
                    Button(
                        onClick = {}
                    ) {
                        modifier.size(60.dp)
                        Text(text = "7")
                    }
                }
                Column (
                    modifier.background(color = Color.Magenta),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        onClick = {}
                    ) {
                        modifier.size(60.dp)
                        Text(text = "2")
                    }
                    Button(
                        onClick = {}
                    ) {
                        modifier.size(60.dp)
                        Text(text = "5")
                    }
                    Button(
                        onClick = {}
                    ) {
                        modifier.size(60.dp)

                        Text(text = "8")
                    }
                }
                Column (
                    modifier.background(color = Color.Black).padding()
                ) {
                    Button(
                        onClick = {}
                    ) {
                        modifier.size(60.dp)
                        Text(text = "3")
                    }
                    Button(
                        onClick = {}
                    ) {
                        modifier.size(60.dp)
                        Text(text = "6")
                    }
                    Button(
                        onClick = {}
                    ) {
                        modifier.size(60.dp)
                        Text(text = "9")
                    }
                }
            }
        }
    }
}
